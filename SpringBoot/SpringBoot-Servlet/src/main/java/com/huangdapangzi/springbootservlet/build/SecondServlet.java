package com.huangdapangzi.springbootservlet.build;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 黄大胖子
 * 2018/6/6 13:23
 */

//这里不需要添加webServlet注解
public class SecondServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("SecondServlet");
    }
}

