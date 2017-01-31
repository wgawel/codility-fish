package pl.gawly;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.stream.IntStream;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testZero1() {
        Assert.assertEquals(1, s.solution(new int[]{4}, new int[]{0}));
    }

    @Test
    public void testZero2() {
        Assert.assertEquals(1, s.solution(new int[]{4}, new int[]{1}));
    }

    @Test
    public void testEx1() {
        Assert.assertEquals(2, s.solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0}));
    }

    @Test
    public void testEx2() {
        Assert.assertEquals(4, s.solution(new int[]{1, 2, 3, 4, 5}, new int[]{0, 1, 0, 0, 0}));
    }

    @Test
    public void testEx3() {
        Assert.assertEquals(3, s.solution(new int[]{10, 3, 4, 1, 2}, new int[]{0, 1, 1, 0, 0}));
    }

    @Test
    public void testEx4() {
        Assert.assertEquals(3, s.solution(new int[]{10, 4, 3, 1, 2}, new int[]{0, 1, 1, 0, 0}));
    }

    @Test
    public void testEx5() {
        Assert.assertEquals(3, s.solution(new int[]{10, 6, 8, 5, 1, 2, 4}, new int[]{0, 1, 0, 1, 0, 0, 0}));
    }

    @Test
    public void testLarge1() {
        int[] a = IntStream.rangeClosed(1, 100000).toArray();
        int[] b = new int[100000];
        for (int i = 0; i < 50000; i++) {
            b[i] = 1;
        }
        Assert.assertNotNull(s.solution(a, b));
    }

    @Test
    @Ignore("Test only, if you have time")
    public void testLargeRandom() {
        int[] a = IntStream.rangeClosed(1, 100000).toArray();
        int[] b = new int[100000];
        for (int i = 0; i < 50000; i++) {
            b[i] = 1;
        }
        Assert.assertNotNull(s.solution(a, b));
    }
}
