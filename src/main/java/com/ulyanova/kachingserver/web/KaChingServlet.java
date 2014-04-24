package com.ulyanova.kachingserver.web;

import org.json.simple.JSONObject;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by O_O on 23.04.14.
 */
public class KaChingServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = resp.getWriter();
        JSONObject json = new JSONObject();
        json.put("field1", "some content");
        json.put("field2", "some other content");
        printWriter.print(json.toString());
        printWriter.flush();
    }
}
