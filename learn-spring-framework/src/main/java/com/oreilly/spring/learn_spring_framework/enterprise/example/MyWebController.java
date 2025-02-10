package com.oreilly.spring.learn_spring_framework.enterprise.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class MyWebController {
    @Autowired
    private BusinessService businessService;
    public long returnValueFromBusinessLayer(){
        return businessService.calculateSum();
    }
}
@Component
class BusinessService{

    private DataService dataService;
    @Autowired
    public void setDataService(DataService dataService) {       //Dependency Injection through Setter method
        this.dataService = dataService;
    }

    public long calculateSum(){
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get();
    }

}
@Component
class DataService{
    public List<Integer> getData(){
        return Arrays.asList(10,20,30);
    }
}
