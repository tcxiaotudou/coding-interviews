package nowcoder.coding_interviews;

/**
 统计一个数字在升序数组中出现的次数。
 示例1

 输入
 [1,2,3,3,3,3,4,5],3

 返回值
 4
 */
public class JZ37 {

    public int GetNumberOfK(int [] array , int k) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                result ++;
            }
        }
        return result;
    }
}
