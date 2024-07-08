package neetcode.arraysAndHashing;

import org.junit.Test;

import static neetcode.arraysAndHashing.ValidAnagram.isAnagram;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidAnagramTest {
    @Test
    public void isValidAnagram(){
        assertTrue(isAnagram("shon", "hons"));
    }

    @Test
    public void isNotValidAnagram(){
        assertFalse(isAnagram("shon", "shot"));
    }
}
