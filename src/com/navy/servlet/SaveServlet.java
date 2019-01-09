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

    File wordDir = null;

    public SaveServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("I am SaveServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (wordDir == null){
           wordDir =  new File("E:\\AnkiWords");
        }
        if (!wordDir.exists()){
            wordDir.mkdirs();
        }
        String word = req.getParameter("word");
        String content = req.getParameter("content");
        File file = new File(wordDir, word + ".json");
        FileUtils.save(file, content);
        resp.getWriter().println("true");
    }
}
