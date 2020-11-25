package com.sidyeti.springexample.helloworld;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class BubbleSort implements SortAlgorithm
{
    @Override
    public void sort(int[] nums)
    {
        System.out.println("Sorting " + Arrays.toString(nums) + " using Bubble sort");
        Arrays.sort(nums);
    }
}
