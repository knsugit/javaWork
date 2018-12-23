import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class S10E6Server {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(10006);

            Socket s = server.accept();
            System.out.println(s.getInetAddress().getHostAddress()+" is uploading a file...");

            //��ȡ�ͻ����ϴ��������ı��ļ�
            //Դ ---socket(�ֽ���)---���⣺��Ҫת�����ַ���  ��������
            InputStream in  = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            //Ŀ�� ---Ӳ���ַ��� FileWriter---���⣺��ӡ��
            PrintWriter pw = new PrintWriter(new FileWriter("server.txt"),true);
            String line = null;
            while((line=br.readLine())!=null){
                pw.println(line);
            }
            pw.close();

            OutputStream out = s.getOutputStream();
            DataOutputStream dout = new DataOutputStream(out);
            dout.writeUTF("File was uploaded successfully.");
            s.close();
            server.close();
            dout.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}