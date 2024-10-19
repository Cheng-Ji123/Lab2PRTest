import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    // 测试目的：检查两个小数的乘积
    // 测试用例：num1 = "2", num2 = "3"，期望结果 = "6"
    @Test
    public void testMultiplySmallNumbers() {
        assertEquals("6", solution.multiply("2", "3"));
    }

    // 测试目的：检查乘以0的情况
    // 测试用例：num1 = "0", num2 = "1234"，期望结果 = "0"
    @Test
    public void testMultiplyWithZero() {
        assertEquals("0", solution.multiply("0", "1234"));
    }

    // 测试目的：检查较长数字的相乘结果
    // 测试用例：num1 = "123456789", num2 = "987654321"，期望结果 = "121932631112635269"
    @Test
    public void testMultiplyVeryLargeNumbers() {
        assertEquals("121932631112635269", solution.multiply("123456789", "987654321"));
    }
}