package com.xinbitiangao;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 1.0
 * @Description: TODO 说明
 * @Auther: hay17
 * @Date: 2018/12/2 22:02
 */
public class mzitu {

    public static void main(String[] args) throws IOException {
        //    获取所有妹子图系列Url
        String url = "https://www.mzitu.com/all/";

        Document document = Jsoup.connect(url)
                .header("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2")
                .get();
        Elements select = document.select("a[target]").select("a[href~=(^*\\d+\\.?\\d*|\\.\\d+$)]");

        List<String> imgUrls = new ArrayList<String>();
        for (Element element : select) {
            imgUrls.add(element.attr("href"));
        }

        System.out.println(imgUrls);
        System.out.println(imgUrls.size());

//        存储所有妹子图系列集合Map
        Map<String, List<MzituImgEntity>> imgMap = new HashMap<String, List<MzituImgEntity>>();

        //  遍历地址集 进入妹子图界面
        for (String imgHtmUrl : imgUrls) {
            Document doc = Jsoup.connect(imgHtmUrl)
                    .header("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2")
                    .get();

            Elements pagenavi = doc.select("div.pagenavi").select("a");
            Integer imgSize = Integer.valueOf(pagenavi.get(pagenavi.size() - 2).select("span").get(0).text());

//            存放当前系列妹子图数据集合
            List<MzituImgEntity> mies = new ArrayList<MzituImgEntity>();
            for (int i = 1; i <= imgSize; i++) {
                Document docu = Jsoup.connect(imgHtmUrl + "/" + i)
                        .header("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2")
                        .get();
                //            获取妹子图片地址
                String imgSrc = docu.select("div.main-image").select("img").attr("src");
                //            获取妹子图片名称
                String name = docu.select("h2.main-title").text();
                //             加入数据集合
                mies.add(new MzituImgEntity(name, imgSrc, imgHtmUrl + "/" + i));
            }

            //           将当前系列存入Map集合中 key为name+id
            //            获取妹子图片名称
            String name = doc.select("h2.main-title").text();
            String[] split = imgHtmUrl.split("/");
            String id = split[split.length - 1];
            imgMap.put(name + "_" + id, mies);
        }

    }


}
