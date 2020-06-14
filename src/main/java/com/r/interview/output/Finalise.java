package com.r.interview.output;

public class Finalise {

    /*
    *
    *  Deprecated from Java 9
    *  1. Called only once on the object by JVM when there is no reference to this object
    *  2. Exceptions are ignored and finalization process is halted
    *  3.
    *
    * */

    public static void main(String[] args) {

    }

    //Read the doc
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
