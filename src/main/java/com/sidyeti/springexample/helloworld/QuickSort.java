package com.sidyeti.springexample.helloworld;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
@Primary
public class QuickSort implements SortAlgorithm
{
    @Override
    public void sort(int[] nums)
    {
        System.out.println("Sorting "+ Arrays.toString(nums)+" using quick sort");
        Arrays.sort(nums);
    }
}
