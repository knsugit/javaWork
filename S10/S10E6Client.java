import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class S10E6Client {

    public static void main(String[] args) {

        try {
            Socket s = new Socket("127.0.0.1", 10006);

            //思路：把本地文件的数据读取出来通过 s.getOutputStream()获得的out对象发送出去
            BufferedReader bf = new BufferedReader(new FileReader("client.txt"));

            OutputStream out = s.getOutputStream();//这里的输出流 对应的是服务器端的输入流
            PrintWriter pw = new PrintWriter(out,true);

            String str=null;
            while((str=bf.readLine())!=null){
                pw.println(str);
            }

            //给服务器发送结束标记---上传结束，要加结束标记，
            s.shutdownOutput();
            bf.close();

            //接收服务器端反馈

            InputStream in = s.getInputStream();
            DataInputStream din = new DataInputStream(in);
            System.out.println("server responsed: "+din.readUTF());
            s.close();
            din.close();


        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}