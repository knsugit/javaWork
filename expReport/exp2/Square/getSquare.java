public class getSquare{
	public static void main(String args[]){
		rectangle rec = new rectangle(2, 3);
		System.out.println(rec.getSquare());
		
		triangle tri = new triangle(3, 4, 5);
		System.out.println(tri.getSquare());
	}
}

class rectangle{
	int x, y;
	rectangle(int x, int y){
		this.x = x;
		this.y = y;
	}
	int getSquare(){
		return x*y;
	}
}

class triangle{
	int a, b, c;
	triangle(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	double getSquare(){
		int p = (a+b+c)/2;
		double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return s;
	}
}