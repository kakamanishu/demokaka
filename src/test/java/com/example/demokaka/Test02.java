package com.example.demokaka;

import org.apache.tomcat.jni.Time;

import java.math.BigDecimal;

public class Test02 {

    public static void main(String[] args) throws InterruptedException {
        double upTime;//方法的执行时间(秒)
        long startTime = System.currentTimeMillis(); //获取开始时间
        for (int i = 0; i < 10; i++) {
            i++;
        }
        Thread.sleep(2);
        long endTime = System.currentTimeMillis(); //获取结束时间
        upTime = new BigDecimal(endTime - startTime).divide(new BigDecimal(1000)).doubleValue();//耗时(秒)
        System.out.println(upTime);
    }
}