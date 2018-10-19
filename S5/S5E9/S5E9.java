public class S5E9{
    public static void main(String args[]){
        Person p = new Person("John", 'M', 12);
        System.out.println(p.getData());
        p.setData("Alice", 'W', 14);
        System.out.println(p.getData());

        Student s = new Student("Jack", 'M', 11, 123456, 13);
        System.out.println(s.getData());
        s.setData("Kim", 'W', 20, 20171105, 15);
        System.out.println(s.getData());
    }
}

class Person{
    String name;
    char sex;
    int age;
    Person(String name, char sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    void setData(String name, char sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    String getData(){
        return "name:"+ name + "\nsex:" + sex + "\nage:" + age;
    }

}

class Student extends Person{
    int sID;
    int classNo;
    Student(String name, char sex, int age, int sID, int classNo){
        super(name, sex, age);
        this.sID = sID;
        this.classNo = classNo;
    }
    void setData(String name, char sex, int age, int sID, int classNo){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sID = sID;
        this.classNo = classNo;
    }

    String getData(){
        return "name:"+ name + "\nsex:" + sex + "\nage:" + age
                + "\nsID:" + sID + "\nclassNo:" + classNo; 
    }
}