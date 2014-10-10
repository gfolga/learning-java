package com.gradusit;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Gustavo
 * Date: 10/10/14
 * Time: 12:12
 * To change this template use File | Settings | File Templates.
 */
public class test9 {
    public static void main(String args[])
        throws java.io.IOException{
            char Inp;

            Inp = (char) System.in.read();

        switch (Inp){
            case 'A':
                System.out.println("Input es A");
                break;
            case 'B':
                System.out.println("Input es B");
                break;
            default:
                System.out.println("Input es (leyendo variable) " + Inp);
        }

    }
}
