public class TestPoint{
	public static void main(String args[]){
		Point p = new Point();
		p.getPoint();
		p.movePoint(10, 20);
		p.getPoint();
	}
}

class Point{
	int x, y;
	Point(){
		x=0;
		y=0;
	}
	
	void setX(int x){
		this.x = x;
	}
	
	void setY(int y){
		this.y = y;
	}
	
	void getPoint(){
		System.out.println("(" + x + "," + y + ")");
	}
	
	void movePoint(int x, int y){
		this.x += x;
		this.y += y;
	}
	
}