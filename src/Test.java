public class Test {
    int add(int a,int b)
    {
        return a+b;
    }
}
 class B {
    public static void main(String argv[])
    {
        try {
            Float f=new Float("3.0");
            int x=f.intValue();
            byte b=f.byteValue();
            double h=f.doubleValue();
            System.out.println(x+b+h);  //output: 9.0
        }
        catch (Exception e)
        {
            System.out.println();
        }
    }
}
