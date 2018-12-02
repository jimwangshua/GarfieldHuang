package com.xinbitiangao;

import lombok.Data;

/**
 * @author 1.0
 * @Description: 妹子图url实体
 * @Auther: hay17
 * @Date: 2018/12/2 22:57
 */
@Data
public class MzituImgEntity {
    String name;
    String imgSrc;
    String htmlUrl;

    public MzituImgEntity() {
    }

    public MzituImgEntity(String name, String imgSrc, String htmlUrl) {
        this.name = name;
        this.imgSrc = imgSrc;
        this.htmlUrl = htmlUrl;
    }

    @Override
    public String toString() {
        return "MzituImgEntity{" +
                "name='" + name + '\'' +
                ", imgSrc='" + imgSrc + '\'' +
                ", htmlUrl='" + htmlUrl + '\'' +
                '}';
    }
}
