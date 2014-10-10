package com.gradusit;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Gustavo
 * Date: 10/10/14
 * Time: 11:57
 * To change this template use File | Settings | File Templates.
 */
public class test8 {
    public static void main(String args[])
        throws java.io.IOException {
            char mychar = 'K';
            char input1;
            System.out.print("Adivine la letra, ingrese un caracter: ");
            input1 = (char) System.in.read();
            if (input1 == mychar)
            {
                System.out.println("Adivino!");
            }
            else
            {
               System.out.println("Siga intentnado!");
            }

    }
}
