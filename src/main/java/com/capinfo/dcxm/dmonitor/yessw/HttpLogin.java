package com.capinfo.dcxm.dmonitor.yessw;

import org.apache.commons.httpclient.Cookie;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.cookie.CookiePolicy;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;


public class HttpLogin {

    /**
     * 模拟登陆12345，获取信息
     */
    public static void getYesswData() {
        //登陆的url
        String loginUrl = "http://172.26.54.61";
        //登录以后访问的地址，获取查询数据
        String dataUrl = "http://172.26.54.61/admin/api/order/list";
        //获取验证码图片的地址
        String checkCodeUrl = "http://172.26.54.61/authz/capcha";

        HttpClient httpClient = new HttpClient();
        PostMethod postMethod = new PostMethod(loginUrl);

        NameValuePair[] data = { new NameValuePair("username", "101002"), new NameValuePair("password", "cxtj1234") };
        postMethod.setRequestBody(data);

        try {
            // 设置 HttpClient 接收 Cookie,用与浏览器一样的策略
            httpClient.getParams().setCookiePolicy(CookiePolicy.BROWSER_COMPATIBILITY);
            int statusCode=httpClient.executeMethod(postMethod);

            // 获得登陆后的 Cookie
            Cookie[] cookies = httpClient.getState().getCookies();
            StringBuffer tmpcookies = new StringBuffer();
            for (Cookie c : cookies) {
                tmpcookies.append(c.toString() + ";");
                //System.out.println("cookies = "+c.toString());
            }
            if(statusCode==302){//重定向到新的URL
                System.out.println("模拟登录成功");
                // 进行登陆后的操作
                GetMethod getMethod = new GetMethod(dataUrl);
                // 每次访问需授权的网址时需带上前面的 cookie 作为通行证
                getMethod.setRequestHeader("cookie", tmpcookies.toString());
                postMethod.setRequestHeader("Referer", "http://passport.mop.com/");
                postMethod.setRequestHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.63 Safari/537.36");
                httpClient.executeMethod(getMethod);
                String text = getMethod.getResponseBodyAsString();
                //System.out.println(text);
                //在这个可能拿到的是数据的json，在这里把数据分别查询96010的状态、案件号和城管系统的状态、案件号

            } else {
                System.out.println("登录失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }





    public static void main(String[] args) {
        // 登陆 Url
        String loginUrl = "http://passport.mop.com/?targetUrl=http://hi.mop.com/?&g=1447141423230&loginCheck=UNLOGINED";
        // 需登陆后访问的 Url
        String dataUrl = "http://hi.mop.com/?";
        HttpClient httpClient = new HttpClient();

        // 模拟登陆，按实际服务器端要求选用 Post 或 Get 请求方式
        PostMethod postMethod = new PostMethod(loginUrl);

        // 设置登陆时要求的信息，用户名和密码
        NameValuePair[] data = { new NameValuePair("loginName", "15901280667"), new NameValuePair("loginPasswd", "wu19941010") };
        postMethod.setRequestBody(data);
        try {
            // 设置 HttpClient 接收 Cookie,用与浏览器一样的策略
            httpClient.getParams().setCookiePolicy(CookiePolicy.BROWSER_COMPATIBILITY);
            int statusCode=httpClient.executeMethod(postMethod);

            // 获得登陆后的 Cookie
            Cookie[] cookies = httpClient.getState().getCookies();
            StringBuffer tmpcookies = new StringBuffer();
            for (Cookie c : cookies) {
                tmpcookies.append(c.toString() + ";");
                System.out.println("cookies = "+c.toString());
            }
            if(statusCode==302){//重定向到新的URL
                System.out.println("模拟登录成功");
                // 进行登陆后的操作
                GetMethod getMethod = new GetMethod(dataUrl);
                // 每次访问需授权的网址时需带上前面的 cookie 作为通行证
                getMethod.setRequestHeader("cookie", tmpcookies.toString());
                // 你还可以通过 PostMethod/GetMethod 设置更多的请求后数据
                // 例如，referer 从哪里来的，UA 像搜索引擎都会表名自己是谁，无良搜索引擎除外
                postMethod.setRequestHeader("Referer", "http://passport.mop.com/");
                postMethod.setRequestHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.63 Safari/537.36");
                httpClient.executeMethod(getMethod);
                // 打印出返回数据，检验一下是否成功
                String text = getMethod.getResponseBodyAsString();
                System.out.println(text);
            }
            else {
                System.out.println("登录失败");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }





}
