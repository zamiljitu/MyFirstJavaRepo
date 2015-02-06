/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
        
        ArrayList<Integer> bList=new ArrayList<>();
        bList.add(10);
        bList.add(20);
        bList.add(30);
        bList.add(40);
        bList.add(50);
        calc.setaList(bList);
        
        System.out.println("Befor: "+bList.size());
        System.out.println("After: "+calc.aList.size());
    }   
}