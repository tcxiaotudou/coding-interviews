package nowcoder.coding_interviews;

/**
 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class JZ48 {

    public int Add(int num1,int num2) {
        int result, carry;
        do {
            result = num1 ^ num2;
            carry = (num1 & num2) << 1;
            num1 = result;
            num2 = carry;
        } while (carry != 0);
        return result;
    }
}
