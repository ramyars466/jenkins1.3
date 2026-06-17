package com.example;

import org.junit.Test;
import org.junit.Assert;

public class AppTest {
    @Test
    public void testAdd(){
        App app=new App();
        int result= app.add(2,3);
        System.out.println("running test of 2+3 is "+result);
        Assert.assertEquals(5,result);
    }
}
