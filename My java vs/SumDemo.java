class Sum 
{
    int a,b,c;
    void assign()
    {
        a=22;
        b=32;
    }
    void cal()
    {
        c=a+b;
    }
    void display()
    {
        System.out.println("the value of addition is:"+c);
    }
}//end of BLC
class SumDemo
{
    public static void main(String[] args)
    {
        Sum s=new Sum();
        s.assign();
        s.cal();
        s.display();
    }
}
