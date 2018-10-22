interface Print{
    void print(String str);
}

class PrintStr implements Print{
    public void print(String str){
        System.out.print(str);
    }
}

public class S6E7{
    public static void main(String args[]){
        PrintStr p = new PrintStr();
        p.print("Interface test");
    }
}