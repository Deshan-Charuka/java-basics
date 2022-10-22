package com.charuka.deshan;

/**
 * @author : Deshan Charuka <d.c.0729439631@gmail.com>
 * @since : 2022-10-22
 **/
public class Browser {
    public void navigate(String address){
        String ip = findIPAddress(address,true);
        String html = sendHttpAddress(ip);
        System.out.println(html);
    }

    private String sendHttpAddress(String ip) {
        return "<html></html>";
    }

    private String findIPAddress(String address,boolean cache) {
        return "127.0.0.1";
    }
}
