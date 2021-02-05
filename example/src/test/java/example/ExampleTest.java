package example;

import org.junit.Test;

/**
 * @author Lin1c
 * @date 2021/1/22 2:36 下午
 */
public class ExampleTest {
    @Test
    public void testComputeScore() {
        String type = "type1";
        Double score = 1D;
        Double sum = 0D;

        Example example = new Example();
        example.computeScore(type, score, sum);
        System.out.println(sum);
    }
}
