package com.wework.project.service;

import com.wework.project.service.implementation.PartitionServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;

public class PartitionServiceImplTest {

    private static List<Integer> intList;

    private PartitionService partitionService;

    @BeforeClass
    public static void setUpClass() {
        intList = Arrays.asList(1, 2, 3, 0, 4, 5, 6, 0, 7, 8);
    }

    @Before
    public void setUp(){
        partitionService = new PartitionServiceImpl();
    }

    @Test
    public void partitionTestTrue() {
        List<List<Integer>> result = partitionService.partition(intList, 3);
        List<Integer> lastPartition = result.get(3);
        List<Integer> expectedLastPartition = Arrays.asList(8);
        Assert.assertEquals("Result", 3, result.get(0).size());
        Assert.assertThat(lastPartition, equalTo(expectedLastPartition));

    }

    @Test(expected = IllegalArgumentException.class)
    public void partitionListNull() {
        partitionService.partition(null, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void partitionSizeLessThanZero() {
        partitionService.partition(intList, -1);
    }
}
