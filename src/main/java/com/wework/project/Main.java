package com.wework.project;

import com.wework.project.service.PartitionService;
import com.wework.project.service.implementation.PartitionServiceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String [] args){

        PartitionService partitionService = new PartitionServiceImpl();

        Random random = new Random();
        int[] randomArray = IntStream.generate(random::nextInt)
                .limit(25)
                .toArray();
        List<Integer> test = Arrays.stream(randomArray).boxed().collect(Collectors.toList());
        List<List<Integer>> resultIterator = partitionService.partition(test,3);

        System.out.println(resultIterator);
    }
}
