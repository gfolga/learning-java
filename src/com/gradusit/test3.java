package com.gradusit;

/**
 * Created with IntelliJ IDEA.
 * User: Gustavo
 * Date: 10/10/14
 * Time: 10:11
 * To change this template use File | Settings | File Templates.
 */
public class test3 {
    public static void main(String args[]) {
        int myr;
        myr = test2.returnsomething();
        System.out.println("calling test2.returnsomthing, myr is " + myr);

        int a1;
        int r1;
        a1 = 10 ;
        r1 = test2.metwithargs(a1);
        System.out.println("calling test2.metwithargs, r2 is " + r1);
    }
}
