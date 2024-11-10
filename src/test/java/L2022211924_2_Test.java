import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L2022211924_2_Test{
    Solution2 solution2 = new Solution2();
    @Test
    public void Testsolution1(){
        String s =  "abcabd";
        String result = solution2.removeDuplicateLetters(s);
        assertEquals("abcd",result);

    }
    @Test
    public void Testsolution2(){
        String s =  "bcabc";
        String result = solution2.removeDuplicateLetters(s);
        assertEquals("abc",result);

    }@Test
    public void Testsolution3(){
        String s =  "ababa";
        String result = solution2.removeDuplicateLetters(s);
        assertEquals("ab",result);

    }
}
