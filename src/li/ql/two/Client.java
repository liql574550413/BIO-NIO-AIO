package li.ql.two;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @author liql
 * @date 2021/3/16
 */
//客户端
public class Client {
        public static void main(String[] args) throws IOException {
            //创建客户端的对象 请求服务端的链接
            Socket socket = new Socket("127.0.0.1", 8888);
            //2.从socket中获取一个字节输出流
            OutputStream outputStream = socket.getOutputStream();
            //3.把字节输出流包装成一个打印流
            PrintStream printStream = new PrintStream(outputStream);
            printStream.println("服务端 你好，我是客户端");
            printStream.flush();

        }

}
