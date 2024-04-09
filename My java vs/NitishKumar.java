class Box {
    double width;
    double height;
    double depth;
}
public class NitishKumar
{
    public static void main(String[] args)
    {
        //creating an object of Box class
        Box obj=new Box();
        //assigning values to obj instance variables
        obj.width=52;
        obj.height=56;
        obj.depth=15;
        //computing volume of Box
        double volume= obj.width*obj.height*obj.depth;
        System.out.println("volume of Box:"+volume);
    }
}
