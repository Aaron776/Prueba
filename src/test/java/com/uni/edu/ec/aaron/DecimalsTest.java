package com.uni.edu.ec.aaron;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecimalsTest {
    private Decimals decimals;

    @Test
    public void addDecimalsText1() {
        this.decimals=new Decimals(15.5,13.5);
        assertEquals(29,this.decimals.addDecimals(),0.1);

    }

    @Test
    public void addDecimalsText2(){
        this.decimals=new Decimals();
        assertEquals(31.2,this.decimals.addDecimals(31.0,0.19),0.1);


    }
    @Test
    public void restDecimals(){
        this.decimals=new Decimals();
        assertEquals(2,this.decimals.addDecimals(15,14), 0.2);
    }
assert
}