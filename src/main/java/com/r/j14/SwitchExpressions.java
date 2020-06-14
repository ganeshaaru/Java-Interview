package com.r.j14;

public class SwitchExpressions {
    public static void main(String[] args) {
        System.out.println(getValueFromSwitch("a"));
        System.out.println(getValueFromSwitch("b"));
    }

    private static int getValueFromSwitch(String s) {
        return switch (s){
            case "a" -> 1;
            case "c", "b" -> 2;
            default -> throw new IllegalStateException("Unexpected value: " + s);
        };
    }
}
