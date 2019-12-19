package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("\tThis runner before scenario");
    }
    @After
    public void teatDown(){
        System.out.println("This comming After scenario\n");
        Driver.closeDriver();

    }

    @After("@sales_manager")
    public void tearDownSalesManager(){
        System.out.println("this comming after scenarion for sales manager\n");
    }

}


