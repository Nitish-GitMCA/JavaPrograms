public class Box {
    private int length,breadth, height;
    public void setDimension( int l, int b, int h)
    {
        length = l; breadth = b; height = h;
    }
    public void showDimension()
    {
        System.out.println("Lenth="+length);
        System.out.println("Breadth="+breadth);
        System.out.println("Height="+height);
    }
    public static void main(String[] args)
    {
        Box smallBox = new Box();
        smallBox.setDimension(20,10,30);
        smallBox.showDimension();
    }
}
