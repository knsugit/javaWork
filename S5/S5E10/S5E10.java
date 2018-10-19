abstract class Person{
    String name;
    char sex;
    int age;
    abstract void setData(String name, char sex, int age);
    abstract String getDetail();
}

class Student extends Person{
    int sID;
    String speciality;
    Student(String name, char sex, int age, int sID, String speciality){
        super.name = name;
        super.sex = sex;
        super.age = age;
        this.sID = sID;
        this.speciality = speciality;
    }
    @Override
    void setData(String name, char sex, int age){}
    void setData(String name, char sex, int age, int sID, String speciality){
        super.name = name;
        super.sex = sex;
        super.age = age;
        this.sID = sID;
        this.speciality = speciality;
    }
    String getDetail(){
        return "name:" + name + "\nsex:" + sex + "\nage:" + age
                + "\nsID:" + sID + "\nspeciality:" + speciality;
    }
}

class Teacher extends Person{
    int tID;
    String department;
    Teacher(String name, char sex, int age, int tID, String department){
        super.name = name;
        super.sex = sex;
        super.age = age;
        this.tID = tID;
        this.department = department;
    }
    @Override
    void setData(String name, char sex, int age) {}
    void setData(String name, char sex, int age, int tID, String department){
        super.name = name;
        super.sex = sex;
        super.age = age;
        this.tID = tID;
        this.department = department;
    }
    String getDetail(){
        return "name:" + name + "\nsex:" + sex + "\nage:" + age
                + "\ntID:" + tID + "\ndepartment:" + department;
    }
}

public class S5E10{
    public static void main(String args[]){
        Student s = new Student("Mike", 'M', 13, 201722, "SE");
        System.out.println(s.getDetail());
        Teacher t = new Teacher("name", 'W', 25, 201733, "EE");
        System.out.println(t.getDetail());
    }
}