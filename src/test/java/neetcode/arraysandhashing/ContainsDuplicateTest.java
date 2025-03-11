package neetcode.arraysandhashing;

import org.junit.Test;

import static neetcode.arraysandhashing.ContainsDuplicate.hasDuplicate;
import static org.junit.Assert.*;

public class ContainsDuplicateTest {

    @Test
    public void containsDuplicateTrue(){
        assertTrue(hasDuplicate(new int[]{1,2,3,3}));
    }

    @Test
    public void containsDuplicateFalse(){
        assertFalse(hasDuplicate(new int[]{1,2,3,4}));
    }
}
