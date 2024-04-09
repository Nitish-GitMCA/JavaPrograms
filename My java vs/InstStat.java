class InstStat 
{
    void f3()
    {
        System.out.println("f3 instsnce");
    }    
    void f1()
    {
    f3();
    InstStat.f2();
    System.out.println("f1 instance");
    }
    static void f2()
    {
        System.out.println("f2 ststic");
    }
    public static void main(String[] args)
    {
        System.out.println("i am from main() static");
        InstStat is=new InstStat();
        is.f3();
        is.f1();
        InstStat.f2();
    }
}

