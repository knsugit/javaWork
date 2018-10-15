import java.util.Scanner;
public class S4E9{
	public static void main(String args[]){
		int y, m, d;
		MyDate md = new MyDate();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please input Year:");
		y = input.nextInt();
		System.out.println("Please input Month:");
		m = input.nextInt();
		System.out.println("Please input Day:");
		d = input.nextInt();
		
		md.setDate(y, m, d);
	}
}

class MyDate{
	int Year;
	int Month;
	int Day;
	
	void setDate(int year, int month, int day){
			if(year>=0 && month>0 && day>0){
				Year = year;
				if(month < 13){
					Month = month;
					if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
						if(day<32){
							Day = day;
						}
					}
					else if(month==2){
						if((year%4==0 && year%100!=0) || year%400==0){
							if(day<30){
								Day = day;
							}
						}
						else{
							if(day<29){
								Day = day;
							}
						}
					}
					else{
						if(day<31){
							Day = day;
						}
					}
				}
			}
			else{
				System.out.println("Enter error! Please enter again.");
				return;
			}
			showDate();
			return;
	}
	
	void plusDate(){
		
	}
	
	void showDate(){
		System.out.println(Year+"-"+Month+"-"+Day);
	}
}