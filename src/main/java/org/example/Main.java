package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String url = "https://sirus.su/base/ladder/arena/x1?type=2";
            Document doc = Jsoup.connect(url).get();
            String title = doc.title();
            System.out.println("Title: " + title);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}