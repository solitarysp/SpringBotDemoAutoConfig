package com.lethanh98.spring.bot.demo.autoconfig.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupUntil {
    public static Document convertStringToDocumentJsoup(String htmlData) {
        return Jsoup.parse(htmlData);
    }
}
