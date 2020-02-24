package com.kfgs.firstweb.controller;

import com.alibaba.fastjson.JSON;
import com.kfgs.domain.ext.FormDate;
import okhttp3.*;
import org.apache.http.cookie.SetCookie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* *
 * 功能描述:
 * 〈〉
 *
 * @param null 1
 * @return : 模拟访问，获取session
 * @author : mango
 * @date : 2020/2/15 15:03
 */
@Controller
@RequestMapping("/Simulation")
public class SimulationWebController {

    @ResponseBody
    @GetMapping("/getCookie")
    public Map getCookie(HttpServletRequest servletRequestrequest) throws IOException {
        String userAgent = servletRequestrequest.getHeader("User-Agent");
        System.out.println(userAgent);
        Map result = new HashMap();
        OkHttpClient client=new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://www.patviewer.com/")
                .addHeader("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                .addHeader("Connection","keep-alive")
                .addHeader("Accept-Language", "zh-CN,zh;q=0.9")
                .addHeader("Host","www.patviewer.com")
                .addHeader("User-Agent",userAgent)
                .build();
        okhttp3.Call call = client.newCall(request);
        // 执行GET请求，并在异步回调中处理请求
        Response response = call.execute();
        Headers headers = response.headers();
        List<String> jsessionid = headers.values("Set-Cookie");
        System.out.println(jsessionid);
        //截取JSESSIONID
        String setCookie = jsessionid.get(0);
        String jession = setCookie.substring(setCookie.indexOf("=") + 1 , setCookie.indexOf(";"));
        System.out.println(response);
        result.put("session",jession);
        return result;
    }

    @PostMapping("/getResponseBody")
    public void getResponseBody(HttpServletRequest req, HttpServletResponse resp, String url, @RequestBody FormDate formDate) throws IOException {
        System.out.println(req);
        System.out.println(req.getRequestedSessionId());
        System.out.println(req.getRequestedSessionId().replaceAll("%22",""));
        String formDateJson = JSON.toJSONString(formDate);
        //请求body
        okhttp3.RequestBody body;
        body = okhttp3.RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), formDateJson);
        System.out.println(body);
        String userAgent = req.getHeader("User-Agent");
        OkHttpClient client=new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .addHeader("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                .addHeader("Connection","keep-alive")
                .addHeader("Accept-Language", "zh-CN,zh;q=0.9")
                .addHeader("Host","www.patviewer.com")
                .addHeader("User-Agent",userAgent)
                .addHeader("Cookie",req.getRequestedSessionId().replaceAll("%22",""))
                //.addHeader("User-Agent",req.getHeader())
                .post( body)
                .build();

        okhttp3.Call call = client.newCall(request);
        // 执行GET请求，并在异步回调中处理请求
        Response response = call.execute();

        System.out.println(formDate.toString());
    }


}
