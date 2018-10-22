class Shape{
    public double area;
    public double getArea(){
        return area;
    }
}

class Triangle extends Shape{
    double a, b ,c;
    public double getArea(){
        return area;
    }
    public double getArea(double a, double b, double c){
		double p = (a + b + c) / 2;
		super.area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return super.area;
	}
}

class Rectangle extends Shape{
    double a, b;
    public double getArea(){
        return area;
    }
    public double getArea(double a, double b){
        super.area = a * b;
        return super.area;
    }
}

class Pillar{
    double height;
    double volume;
    /**
     * @return the volume
     */
    public double getVolume(double area, double height) {
        volume = area * height;
        return volume;
    }
}

public class PillarTest{
    public static void main(String args[]){
        Triangle tri = new Triangle();
        Rectangle rec = new Rectangle();
        Pillar p = new Pillar();
        
        double area1 = tri.getArea(3, 4, 5);
        double volume1 = p.getVolume(area1, 3);
        System.out.println("三棱柱体积: " + volume1);

        double area2 = rec.getArea(5, 6);
        double volume2 = p.getVolume(area2, 8);
        System.out.println("四棱柱体积: " + volume2);

    }
}