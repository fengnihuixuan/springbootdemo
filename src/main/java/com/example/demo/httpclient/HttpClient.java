package com.example.demo.httpclient;

import org.apache.catalina.User;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:yangtao
 * @date:2019/5/5
 * @description:
 */
public class HttpClient {

    public  static void setContent(String ip,int port,String content){

        try {
            //建立客户端Socket连接，指定服务器的位置以及端口。
            Socket socket = new Socket(ip,port);
            //打开输入输出流
            OutputStream os=socket.getOutputStream();
            InputStream  is=socket.getInputStream();
            //发送客户端登录信息，即向输出流写入信息
            os.write(content.getBytes());
            socket.shutdownOutput();
            //接收服务器端的响应，即从输入流读取信息
            String reply=null;
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
             /*  Map<String,String> map= User.getName();*/
            Map<String,String> map= new HashMap<>();//不成立
            String dfIP=socket.getInetAddress().getHostAddress();
            String name=map.get(ip);

            StringBuffer sb= new StringBuffer();

            while(!((reply=br.readLine())==null)){
                sb.append(reply);
            }
            if(name!=null&&name!=""){
                System.out.println(name+"说:"+sb.toString());
            }else{
                
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
