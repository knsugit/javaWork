import java.util.Scanner;
public class addAllNum{
	public static void main(String args[]){
		int sum=0;
		System.out.print("Please input a number:");
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		while(num > 0){
			//System.out.println("num=" + num);
			sum += num%10;
			num = num/10;
		}
		System.out.println("sum=" + sum);
	}
}