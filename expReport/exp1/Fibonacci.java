import java.util.Scanner;
public class Fibonacci{
	public static void main(String args[]){
		int i=1, j=1, temp = i;
		System.out.print("请输入你想得到数列的位数：");
		Scanner input = new Scanner(System.in);
		int position = input.nextInt();
		if(position > 0){
			System.out.println(i);
			if(position > 1){
				System.out.println(j);
			}
			if(position > 2){
				for(int k=2; k<position; k++){
				temp=i+j;
				System.out.println(temp);
				i=j;
				j=temp;
			}
			}
		}
		else{
			System.out.println("请输入正整数！");
		}
	}
}