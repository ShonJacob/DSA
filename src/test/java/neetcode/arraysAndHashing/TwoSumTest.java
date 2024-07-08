package neetcode.arraysAndHashing;

import org.junit.Test;

import static neetcode.arraysAndHashing.TwoSum.twoSumHashMap;
import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void validTwoSum(){
        assertArrayEquals(twoSumHashMap(new int[]{3,4,5,6}, 7), new int[]{0,1});
    }

    @Test
    public void validTwoSum2(){
        assertArrayEquals(twoSumHashMap(new int[]{4,5,6}, 10), new int[]{0,2});
    }
}
