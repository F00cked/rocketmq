package com.service.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject9y6k {

        Project9y6kDelegate project9y6kDelegate = new Project9y6kDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project9y6kDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}