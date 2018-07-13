package com.mmall;

import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by VV on 2018/7/10
 */
public class Test {
    @org.junit.Test
    public void test(){
        System.out.println(0.05+0.01);
        System.out.println(1.0-0.42);
        System.out.println(4.015*100);
        System.out.println(123.3/100);
    }

    @org.junit.Test
    public void test1(){
        BigDecimal b1 = new BigDecimal(0.05);
        BigDecimal b2 = new BigDecimal(0.01);
        System.out.println(b1.add(b2));
    }

    @org.junit.Test
    public void test2(){
        BigDecimal b1 = new BigDecimal("0.05");
        BigDecimal b2 = new BigDecimal("0.01");
        System.out.println(b1.add(b2));
    }

    @org.junit.Test
    public void test3(){
        A a = new A();
        a.setDate(new Date());
        B b = new B();
        BeanUtils.copyProperties(a,b);
        System.out.println(b);
    }

    class A{
        private Date date;

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }
    }

    class B{
        private String date;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "B{" +
                    "date='" + date + '\'' +
                    '}';
        }
    }
}
