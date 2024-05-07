package jtest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Tiktok {
    public static void main(String[] args) {
        Document document;
        try {
            document = Jsoup.connect("https://v.douyin.com/i8K4PyLR/").get();
            System.out.println(document.toString());
            Elements elements = document.getElementsByTag("img");
            for(Element element : elements){
                System.out.println(element.html());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
