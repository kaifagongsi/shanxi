package com.kfgs.firstweb.controller;

import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.http.cookie.SetCookie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
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
@RestController
@RequestMapping("/Simulation")
public class SimulationWebController {

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
}
