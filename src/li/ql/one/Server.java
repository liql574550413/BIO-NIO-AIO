package li.ql.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author liql
 * @date 2021/3/16
 */
//服务端
public class Server {
    public static void main(String[] args) throws IOException {

       // 1、定义一个ServerSocket对象进行服务端的端口注册
        ServerSocket serverSocket = new ServerSocket(8888);

        //2.监听客户端的Socket链接请求
        Socket socket = serverSocket.accept();

        //3.从socket管道中得到一个字节输入流 对象
        InputStream inputStream = socket.getInputStream();

        //4.把一个字节输入流包装成一个缓冲字符输入流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String msg = new String();
        if ((msg=bufferedReader.readLine())!=null){
            System.out.println("服务器接收到的消息:"+msg);
        }


    }

}
