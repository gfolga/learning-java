package com.gradusit;

/**
 * Created with IntelliJ IDEA.
 * User: Gustavo
 * Date: 10/10/14
 * Time: 10:08
 * To change this template use File | Settings | File Templates.
 */
public class test2 {
    public static void main(String args[]) {
        int i;
        i = returnsomething();
        System.out.println("i " + i);
    }
    public static int returnsomething() {
        int r;
        r = 1;
        return r;
    }
    public static int metwithargs(int myarg) {
        System.out.println("calling private method met2" + met2(30)) ;
        return myarg / 2;
    }
    private static int met2 (int b2){
        int r;
        r = b2 / 3 ;
        return r;
    }
}
