interface Person{
    void setData(String name, char sex, String birthday);
    String getData();
}

class Student implements Person{
    String name;
    char sex;
    String birthday;
    int sID;
    String speciality;
    public void setData(String name, char sex, String birthday){}
    public void setData(String name, char sex, String birthday, int sID, String speciality){
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.sID = sID;
        this.speciality = speciality;
    }

    public String getData(){
        return "name:" + name + "\nsex:" + sex + "\nbirthday:" + birthday +
                "\nsID:" + sID + "\nspeciality:" + speciality;
    }
}

public class S6E8{
    public static void main(String args[]){
        Student s = new Student();
        s.setData("Tom", 'M', "1999-10-1", 201722, "CS");
        System.out.println(s.getData());
    }
}