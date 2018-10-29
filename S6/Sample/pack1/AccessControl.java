package pack1;
class Original{
    private int nPrivate = 1;
            int nDefault = 2;
    protected int nProtected = 3;
    public int nPublic = 4;
    void access(){
        System.out.println(**同一类中可以访问的成员：**);
        System.out.println("Private member = " + nPrivate);
        System.out.println("Default member =");
    }

}