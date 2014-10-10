package other;

/**
 * Created with IntelliJ IDEA.
 * User: Gustavo
 * Date: 10/10/14
 * Time: 10:08
 * To change this template use File | Settings | File Templates.
 */
public class class2 {

    public static int m2(int myarg) {
        System.out.println ("arg in m2: " + myarg) ;
        int temp2;

        temp2 = class1.m1(myarg);
        int p = (2 / temp2);
        System.out.println ("arg in temp2: " + temp2) ;
        return p ;
    }
}
