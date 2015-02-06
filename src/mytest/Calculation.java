/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytest;

import java.util.ArrayList;

/**
 *
 * @author zamiljitu
 */
public class Calculation {
    
    int var1=0;
    ArrayList<Integer> aList=new ArrayList<>();

    public Calculation()
    {
        
    }

    public ArrayList<Integer> getaList() {
        return aList;
    }

    public void setaList(ArrayList<Integer> aList) {
        this.aList = aList;
    }

    public int getVar1() {
        return var1*2;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }
}