package com.navy.servlet.utils;

import java.io.*;

public class FileUtils {

    public static void save(File file, String content) throws IOException {
        if (file == null || content == null){
            return;
        }

        if (file.exists()){
            file.delete();
        }
        file.createNewFile();
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close();
        fw.close();

    }

}
