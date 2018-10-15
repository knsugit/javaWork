public class dataDeliverTest {
	public static void main(String args[]) {
		//ʵ�����õ�3��Point�����
		Point p = new Point();    //p�������ڳ䵱ʵ��
		Point test = new Point(); //test�������ڲ���
		Point result = new Point();//result�������ڳ䵱ʵ��
		
		//���Զ���p�ĳ�ʼֵ
		System.out.println("Object p's value:");
		System.out.println("p.x=" + p.x + "\np.y=" + p.y);
		
		int xVal = -1; int yVal = -1;
		
		//��֤����Ϊ������ʱ�Ĵ���Ч��������������ʵ�β��ᱻӰ��
		p.getData(xVal, yVal);
		System.out.println("Pass by Value:");
		System.out.println("xVal=" + xVal + "\nyVal=" + yVal);
		
		//��֤����Ϊ��������ʱ�Ĵ���Ч����������������ʵ�������õĿռ��е����ݻᱻ�ı�
		Location loc = new Location();
		p.getLocation(loc);
		System.out.println("Pass by reference:");
		System.out.println("xVal=" + loc.x + "\nyVal=" + loc.y);
		
		//��result���󸳳�ֵ
		result.x = 1;
		result.y = 2;
		
		//��ʾ���в���p����û�б��ı䣬��˸ı�x��yֵ��ʹʵ��result��Ӱ��
		test.setData(result);
		System.out.println("Call the setData()");
		System.out.println("result.x=" + result.x);
		System.out.println("result.y=" + result.y);
		//��ʾ���в���p���ñ��ı䣬��˸ı�x��yֵ��ʵ��result����Ӱ��
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