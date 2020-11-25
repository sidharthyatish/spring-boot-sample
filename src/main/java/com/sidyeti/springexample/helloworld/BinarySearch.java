package com.sidyeti.springexample.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BinarySearch
{
    @Autowired
    private SortAlgorithm sortAlgorithm;
    
    int search(int[] nums, int x){
        //Sort the array
        sortAlgorithm.sort(nums);
        System.out.println("Searching for "+x+" in "+ Arrays.toString(nums));
        return 1;
    }
}
