package com.banking.testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvierExample {

    @Test(dataProvider = "dataProvider")
    public void getData(String email,String pwd){
        System.out.println(email+ " " +pwd);

    }


    @DataProvider(name = "dataProvider")
    public Object[][] data(){

        Object[][] data={{"abc@gmail.com","abc"},{"def@gmail.com","def"},{"ghi@gmail.com","ghi"} };

        return data;
    }
}
