package pack1;
class Original{
    private int nPrivate = 1;
            int nDefault = 2;
    protected int nProtected = 3;
    public int nPublic = 4;
    void access(){
        System.out.println("**同一类中可以访问的成员：**");
        System.out.println("Private member = " + nPrivate);
        System.out.println("Default member = " + nDefault);
        System.out.println("Protected member = " + nProtected);
        System.out.println("Public member = " + nPublic);
    }
}
class Derived extends Original{
    void access(){
        System.out.println("**子类类中可以访问的成员：**");
        //System.out.println("Private member = " + nPrivate);
        System.out.println("Default member = " + nDefault);
        System.out.println("Protected member = " + nProtected);
        System.out.println("Public member = " + nPublic);
    }
}
class SamePackage{
    void access(){
        Original o = new Original();
        System.out.println("**同一包中可以访问的成员：**");
        //System.out.println("Private member = " + o.nPrivate);
        System.out.println("Default member = " + o.nDefault);
        System.out.println("Protected member = " + o.nProtected);
        System.out.println("Public member = " + o.nPublic);
    }
}

public class AccessControl1{
    public static void main(String[] args){
        Original o = new Original();
        o.access();
        Derived d = new Derived();
        d.access();
        SamePackage s = new SamePackage();
        s.access();
    }
}