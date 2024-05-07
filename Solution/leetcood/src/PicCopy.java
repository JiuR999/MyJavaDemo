package com.uwo9.test01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class PicCopy {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        File fromFile = new File("D:/123/Guo.bmp");
        File toFile = new File("D:/GuoLingT/GuoLingT.jpg");
        InputStream is = null;
        OutputStream os=null;
        try {
            is = new FileInputStream(fromFile);
            os = new FileOutputStream(toFile);
            int content = is.read();
            while (content != -1) {
                os.write(content);
                content = is.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            long endTime = System.currentTimeMillis();
            long costTime = endTime - startTime;
            System.out.println("œ…≈Æπ˘¡·ÕÆ");
        }


    }

}