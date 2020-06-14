package com.r.interview.output;

public class OrderOfInitialization {

    static{
        System.out.println("this static block appears first in the class. So, gets Executed First.");
    }

    private static String staticFieldsSecond = setsValueForStaticFields();
    private String instanceVariables = executedBeforeConstructor();

    private static String executedBeforeConstructor() {
        System.out.println("executedBeforeConstructor");
        return "executedBeforeConstructor";
    }

    private static String setsValueForStaticFields() {
        System.out.println("setsValueForStaticFields");
        return "static Field value";
    }

    static{
        System.out.println("Static block appears after the static fields in the class, gets Executed later.");
    }



    public OrderOfInitialization(String overrideValue) {
        System.out.println("override value");
        this.instanceVariables =  overrideValue;
    }

    public static void main(String[] args) {
        OrderOfInitialization var = new OrderOfInitialization("Override Value");
    }
}
