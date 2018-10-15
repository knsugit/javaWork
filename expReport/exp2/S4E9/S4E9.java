public class S4E9{
	public static void main(String args[]){
		MyDate md = new MyDate();
		md.plusDate("2018", "10", "11");
		md.plusDate("2018", "10", "12");
		md.plusDate("2018", "10", "13");
		md.showDate();
		System.out.println("�ı�����һ������:");
		md.setDate(0,"2017", "10", "11");
		md.showDate();
	}
}

class MyDate{
	final int MAXSIZE = 100;
	public String[] dates = new String[MAXSIZE];
	MyDate(){
		for(int i = 0; i < MAXSIZE; i++){
			dates[i] = "-1";
		}
	}
	
	void setDate(int n, String y, String m, String d){    //���õ� n ������
		if(dates[n] == "-1"){
			System.out.println("Is Empty");
		}
		else{
			dates[n] = (y + "-" + m + "-" + d);
		}
	}
	
	void plusDate(String y, String m, String d){    	//��������
		for(int i = 0; i < MAXSIZE; i++){
			if(dates[i] == "-1"){
				dates[i] = (y + "-" + m + "-" + d);
				return;
			}
		}
		System.out.println("Is Full");
	}
	
	void showDate(){                        //չʾ����
		for(int i = 0; i < MAXSIZE; i++){
			if(dates[i] == "-1"){
				break;
			}
			System.out.println(dates[i]);
		}
	}
}