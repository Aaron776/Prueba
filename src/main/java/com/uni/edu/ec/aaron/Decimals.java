package com.uni.edu.ec.aaron;

public class Decimals {
    private double decimal1,decimal2;

    public Decimals() {
    }



    public Decimals(double decimal1, double decimal2) {
        this.decimal1 = decimal1;
        this.decimal2 = decimal2;
    }

    public double getDecimal1() {

        return decimal1;
    }

    public void setDecimal1(double decimal1) {

        this.decimal1 = decimal1;
    }

    public double getDecimal2() {

        return decimal2;
    }

    public void setDecimal2(double decimal2) {

        this.decimal2 = decimal2;
    }





    public double addDecimals(){

        return this.decimal1+this.decimal2;
    }
    public double addDecimals(double decimal3,double decimal4){
        double results= decimal3/decimal4;
        return results;
    }
     public double restDecimals(double decimal1,double decimal2){
        double results=decimal1-decimal2;
        return results;
     }


    }

