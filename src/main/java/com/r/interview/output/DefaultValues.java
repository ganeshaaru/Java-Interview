package com.r.interview.output;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultValues {

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.intVariablesInitializedWithZero);
        System.out.println(test.booleanVariablesInitializedWithFalse);
        System.out.println(test.StringInitializedWithNull);
        System.out.println(test.ObjectInitializedWithNull);
        for (int i = 0; i < test.intArrWithDefaultZero.length; i++) {
            System.out.println("intArr "+ test.intArrWithDefaultZero[i]);
        }
        for (int i = 0; i < test.tstArrWithDefaultNull.length; i++) {
            System.out.println("tstArr "+test.tstArrWithDefaultNull[i]);
        }

        System.out.println(test.arrayListWithDefaultCapacityAsZeroInJava14.size());
    }


    static class Test{
        protected int intVariablesInitializedWithZero,y;
        protected boolean booleanVariablesInitializedWithFalse;
        protected String StringInitializedWithNull;
        protected Test ObjectInitializedWithNull;
        protected int[] intArrWithDefaultZero = new int[5];
        protected Test[] tstArrWithDefaultNull =  new Test[4];
        protected List<Test> arrayListWithDefaultCapacityAsZeroInJava14 = new ArrayList<>();// size 0, capacity 0 by default previously capacity was 10
        protected Map<String, Test> maps = new HashMap<>();

    }
}


