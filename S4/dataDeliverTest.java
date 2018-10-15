public class dataDeliverTest {
	public static void main(String args[]) {
		//实例化得到3个Point类对象
		Point p = new Point();    //p对象用于充当实参
		Point test = new Point(); //test对象用于测试
		Point result = new Point();//result对象用于充当实参
		
		//测试对象p的初始值
		System.out.println("Object p's value:");
		System.out.println("p.x=" + p.x + "\np.y=" + p.y);
		
		int xVal = -1; int yVal = -1;
		
		//验证参数为简单类型时的传递效果，表明简单类型实参不会被影响
		p.getData(xVal, yVal);
		System.out.println("Pass by Value:");
		System.out.println("xVal=" + xVal + "\nyVal=" + yVal);
		
		//验证参数为引用类型时的传递效果，表明引用类型实参所引用的空间中的数据会被改变
		Location loc = new Location();
		p.getLocation(loc);
		System.out.println("Pass by reference:");
		System.out.println("xVal=" + loc.x + "\nyVal=" + loc.y);
		
		//给result对象赋初值
		result.x = 1;
		result.y = 2;
		
		//该示例中参数p引用没有被改变，因此改变x，y值会使实参result受影响
		test.setData(result);
		System.out.println("Call the setData()");
		System.out.println("result.x=" + result.x);
		System.out.println("result.y=" + result.y);
		//该示例中参数p引用被改变，因此改变x，y值，实参result不受影响
		test.setRefer(result);
		System.out.println("Call the setRefer()");
		System.out.println("result.x=" + result.x);
		System.out.println("result.y=" + result.y);
	}
}

class Location{
	int x, y;
}

class Point {
	int x, y;
	Point(){
		x = 20;
		y = 30;
	}
	void getData(int xValue, int yValue) {
		xValue = 100;
		yValue = 200;
	}
	
	void getLocation(Location locRef) {
		locRef.x = x;
		locRef.y = y;
	}
	
	void setData(Point p) {
		p.x = 10;
		p.y = 20;
	}
	
	void setRefer(Point p) {
		p = new Point();
		p.x = 100;
		p.y = 200;
	}
}