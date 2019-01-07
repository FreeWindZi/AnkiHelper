package com.navy.servlet;

import com.navy.servlet.utils.FileUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet("/save")
public class SaveServlet extends HttpServlet {

    File wordDir = new File("words");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String word = req.getParameter("name");
        String content = req.getParameter("content");
        File file = new File(wordDir, word + ".json");
        FileUtils.save(file, content);
        resp.getWriter().println("true");
    }
}
