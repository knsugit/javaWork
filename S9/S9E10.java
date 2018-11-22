import java.io.*;
import java.util.*;

public class S9E10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            PrintWriter out = new PrintWriter("newfile.txt");
            String str = in.nextLine();
            out.println(str);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}