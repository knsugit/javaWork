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

            //˼·���ѱ����ļ������ݶ�ȡ����ͨ�� s.getOutputStream()��õ�out�����ͳ�ȥ
            BufferedReader bf = new BufferedReader(new FileReader("client.txt"));

            OutputStream out = s.getOutputStream();//���������� ��Ӧ���Ƿ������˵�������
            PrintWriter pw = new PrintWriter(out,true);

            String str=null;
            while((str=bf.readLine())!=null){
                pw.println(str);
            }

            //�����������ͽ������---�ϴ�������Ҫ�ӽ�����ǣ�
            s.shutdownOutput();
            bf.close();

            //���շ������˷���

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