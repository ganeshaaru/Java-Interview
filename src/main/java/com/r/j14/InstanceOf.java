package com.r.j14;

public class InstanceOf {

    public static void main(String[] args){
        Object stringObject = "AnyString";

        if(stringObject instanceof String s){
            System.out.println("AnyString".equalsIgnoreCase(s));
        }
    }
}
