package com.songfz.project_excption;

public class ChainTest {

    public static void main(String[] args) {
        ChainTest chainTest = new ChainTest();
        chainTest.test2();
    }

    public static void test() throws DrunkException {
        throw new DrunkException("喝酒不开车");
    }

    public void test2() {
        try {
            ChainTest.test();
        } catch (DrunkException e) {
            RuntimeException runtimeException = new RuntimeException("司机一滴酒，亲人两行泪~~");
            runtimeException.initCause(e);
            throw runtimeException;
        }
    }
}
