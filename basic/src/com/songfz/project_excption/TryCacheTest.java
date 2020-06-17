package com.songfz.project_excption;

public class TryCacheTest {

    public static void main(String[] args) {

        TryCacheTest tryCacheTest = new TryCacheTest();
        int a = tryCacheTest.test();
        System.out.println(a);
    }
//    divider
    public int test() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                result = result + result / divider;
                divider--;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("循环执行异常了");
            return -1;
        } finally {
            System.out.println("finally");
        }
    }
}
