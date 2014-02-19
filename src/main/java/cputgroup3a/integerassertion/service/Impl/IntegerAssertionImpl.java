/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.integerassertion.service.Impl;

/**
 *
 * @author kurvin
 */

import cputgroup3a.integerassertion.service.IntegerAssertion;

public class IntegerAssertionImpl implements IntegerAssertion {
    @Override
    public boolean isTrue(int a, int b)
    {
        if(a+b == 20){
            System.out.println("The boolean variable is: " + (a+b));
            return true;
        }
        else return false;
    }
    
    @Override
    public char compChar(char A){
        System.out.println("Character variable is: " + A);
        return A;
    }
    
    @Override
    public byte compByte(byte a){
        System.out.println("Byte is: " + a);
        return a;
    }
    
    @Override
    public int multiply(int a, int b){
        System.out.println("The calculation shoudl be equal to: " + (a*b));
        return (a * b);
    }
    
    @Override 
    public long addLong(long a, long b){
        System.out.println("The calculation sould be equal to: " + (a+b));
        return a + b;
    }
    
    @Override
    public short addShort(short a, short b){
        System.out.println("The calculation shoudl equal: " + a + b);
        return (short) (a + b);
    }
}
