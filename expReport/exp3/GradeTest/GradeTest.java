class Grade{
    public double StuGrade;
    public double TeaGrade;
    public double CouGrade;
    void setGrade(double grade){}
    double getGrade(){
        return 0;
    }
}

class Student extends Grade{
    void setGrade(double grade){
        super.StuGrade = grade;
    }
    double getGrade(){
        return super.StuGrade;
    }
}

class Teacher extends Grade{

}

class Course extends Grade{

}

public class GradeTest{
    public static void main(String args[]){
        Student stu = new Student();
        stu.setGrade(10);
        System.out.println(stu.getGrade());
    }
}