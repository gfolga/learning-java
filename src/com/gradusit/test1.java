

/**
 * Created with IntelliJ IDEA.
 * User: Gustavo
 * Date: 10/10/14
 * Time: 9:34
 * To change this template use File | Settings | File Templates.
 */
class test1 {
    public static void main(String args[]) {
        int myint;
        float myfloat;
        long mylong;
        double mydouble;
        float x;
        myint = 10;
        mylong = (long)( myint / 3);
        mydouble = mylong / 7;
        System.out.println("mylong " + mylong);
        System.out.println("mydobule " + mydouble);
        mydouble = 10.1111;
        System.out.println("mydobule " + mydouble);
        x = (long) myint;
        mylong = (long) x / 3;
        System.out.println("x " + x);
        System.out.println("mylong " + mylong);
        System.out.println("long ?" + 10.0 / 3);
        x = 1;
        System.out.println("x " + x);
        x = 10;
        System.out.println("x " + x);
        double z;
        z = 10.0 / 3.0;
        System.out.println("z  "  + z );
        float y;
        y = 10f / 3f;
        System.out.println("y  "  + y );

    }
}
