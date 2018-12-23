class sample {
    private String name;
    sample(){}
    String getName(){
        return name;
    }
}
public class S7E6 {
    public static void main(String[] args) {
        int[] array = new int[3];
        int num=2;

        for(int i=1; i<=3; i++) {
            try {
                System.out.println("Case" + i + ": ");
                switch(i) {
                    case 1:
                        num /= 0;
                        break;
                    case 2:
                        array[3] = num;
                        break;
                    case 3:
                        new sample().getName().length();
                        break;
                }
            }
            catch(ArithmeticException e) {
                System.out.println(e);
            }
            catch(IndexOutOfBoundsException e) {
                System.out.println(e);
            }
            catch(NullPointerException e) {
                System.out.println(e);
            }
            finally {
                System.out.println("Finish Case" + i + ".");
            }
        }
    }
}