package jtest;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class COC {
    public static void main(String[] args){
        final WebClient webClient = new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        webClient.getOptions().setActiveXNative(false);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(true);
        webClient.setAjaxController(new NicelyResynchronizingAjaxController());
        HtmlPage page = null;
        try {
            page = webClient.getPage("http://cocfz.com/");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            webClient.close();
        }
        webClient.waitForBackgroundJavaScript(3000);
        Document document = null;
        document = Jsoup.parse(page.asXml());
        Element start_code = document.getElementById("verImg");
        assert start_code != null;
        System.out.println(start_code.html());
    }
}
