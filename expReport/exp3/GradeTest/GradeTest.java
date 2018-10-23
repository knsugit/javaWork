class Grade{
    public double StuGrade;
    public double TeaGrade;
    public double CouGrade;
    Grade(){
        this.StuGrade = 0;
        this.TeaGrade = 0;
        this.CouGrade = 0;
    }
    Grade(double StuGrade, double TeaGrade, double CouGrade){
        this.StuGrade = StuGrade;
        this.TeaGrade = TeaGrade;
        this.CouGrade = CouGrade;
    }
    void setGrade(double StuGrade, double TeaGrade, double CouGrade){
        this.StuGrade = StuGrade;
        this.TeaGrade = TeaGrade;
        this.CouGrade = CouGrade;
    }
    String getGrade(){
        return "Student Grade:\t" + StuGrade + 
                "\nTeacher Grade:\t" + TeaGrade + 
                "\nCourse Grade:\t" + CouGrade;
    }
}

class Student extends Grade{
    Student(){
        super();
    }
    Student(double StuGrade){
        super.StuGrade = StuGrade;
    }
    void setGrade(double grade){
        super.StuGrade = grade;
    }
    String getGrade(){
        return "Student Grade:\t" + super.StuGrade;
    }
}

class Teacher extends Grade{
    Teacher(){
        super();
    }
    Teacher(double TeaGrade){
        super.TeaGrade = TeaGrade;
    }
    void setGrade(double grade){
        super.TeaGrade = grade;
    }
    String getGrade(){
        return "Teacher Grade:\t" + super.TeaGrade;
    }
}

class Course extends Grade{
    Course(){
        super();
    }
    Course(double CouGrade){
        super.CouGrade = CouGrade;
    }
    void setGrade(double grade){
        super.CouGrade = grade;
    }
    String getGrade(){
        return "Course Grade:\t" + super.CouGrade;
    }
}

public class GradeTest{
    public static void main(String args[]){
        System.out.println("Test Class Grade:");
        Grade g = new Grade(80, 90, 100);
        g.setGrade(70, 80, 90);
        System.out.println(g.getGrade());
        
        System.out.println("\nTest Class Student:");
        Student stu = new Student();
        stu.setGrade(60);
        System.out.println(stu.getGrade());

        System.out.println("\nTest Class Teacher:");
        Teacher tea = new Teacher();
        tea.setGrade(80);
        System.out.println(tea.getGrade());

        System.out.println("\nTest Class Course:");
        Course cou = new Course();
        cou.setGrade(100);
        System.out.println(cou.getGrade());
    }
}