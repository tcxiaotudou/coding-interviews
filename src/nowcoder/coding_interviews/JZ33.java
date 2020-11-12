package nowcoder.coding_interviews;

/**
 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。
 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。

 输入
 7

 返回值
 8
 */
public class JZ33 {

    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) {
            return 0;
        }
        int p2 = 0, p3 = 0, p5 = 0;
        int[] result = new int[index];
        result[0] = 1;
        for (int i = 1; i < index; i++) {
            result[i] = Math.min(result[p2]*2, Math.min(result[p3]*3, result[p5]*5));
        }
    }
}
