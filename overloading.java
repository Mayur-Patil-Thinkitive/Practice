class overloading{
    void add()
    {
        int  a=10,b=20,c;
        c=a+b; 
        System.out.println(c);
    }
    void add(int x,int y)
    {
        int c;
        c=x+y; 
        System.out.println(c);
    }
    void add(int x,double y)
    {
        double c;
        c=x+y; 
        System.out.println(c); 
    }

    public static void main(String[] args) {
        overloading a = new overloading();
        a.add();
        a.add(45,78);
        a.add(45,78.22);
    }
}