package jtest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
public class JsoupTest {
    public static void main(String[] args) {
        Document document;
        try {
            document = (Document) Jsoup.connect("http://www.jtdsx.com/jkzs/").get();
            Thread.sleep(3000);
            Elements news = document.getElementsByClass("news1");
            for(Element e : news){
                System.out.println(e.select("a").attr("title"));
                System.out.println(e.select("a").attr("href"));
                Document new2 = Jsoup.connect("http://www.jtdsx.com/"+e.select("a").attr("href")).get();
                System.out.println(new2);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
