/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytest;

/**
 *
 * @author zamiljitu
 */
public class MyTest {

    public static void main(String[] args) {
        
        Calculation calc=new Calculation();
        calc.setVar1(5);
        
        System.out.println("Before: "+calc.var1);
        
        System.out.println("After: "+calc.getVar1());
    }   
}