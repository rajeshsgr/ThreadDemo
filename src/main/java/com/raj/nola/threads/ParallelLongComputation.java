package com.raj.nola.threads;

import java.util.ArrayList;
import java.util.List;
 
public class ParallelLongComputation {
 
    public static void main(String[] args) {
 
        long currentTime=System.currentTimeMillis();
        List<Integer> data=new ArrayList<Integer>();
        for (int i = 0; i < 100000; i++) {
            data.add(i);
        }
 
        long sum=data.stream()
                .parallel()
                .map(i ->(int)Math.sqrt(i))
                .map(number->performSummation(number))
                .reduce(0,Integer::sum);
 
        System.out.println(sum);
 
    }
 
    public static int performSummation(int number)
    {
        int sum=0;
        for (int i = 1; i < 1000000; i++) {
            int div=(number/i);
            sum+=div;
 
        }
        return sum;
    }
}
