import java.util.Scanner;
public class TestArray{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length of the array:");
		
		int len = input.nextInt();
		int sim[] = new int[len];
		
		System.out.println("Please input the number in array:");
		for(int i = 0; i < sim.length; i++){
			int num = input.nextInt(); 
			sim[i] = num;
			
		}
		
		for(int i = 0; i < sim.length - 1; i++){
			for(int j = 0; j <sim.length - i -1; j++){
				if(sim[j] > sim[j+1]){
					int temp = sim[j];
					sim[j]  = sim[j+1];
					sim[j+1] = temp;
				}
			}
		}
		
		
		for(int i=0; i< sim.length; i++){
			System.out.print(sim[i] + " ");
		}
	}
}