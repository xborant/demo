package sample.algorithm.sort;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortTest
{
    @Test
    public void test()
    {
        int[] data = { 1, 45, 65, 4, 5, 98, 7 };
        System.out.println(Arrays.toString(data));
        MergeSort.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
