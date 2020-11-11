package nowcoder.coding_interviews;

import java.util.ArrayList;
import java.util.Arrays;

/**
 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class JZ42 {

    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        if (array == null || array.length == 0) {
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(array);
        int start = 0, result = 0;
        int end = array.length - 1;
        while (start < end) {
            result = array[start] + array[end];
            if (result > sum) {
                end --;
            } else if (result < sum) {
                start ++;
            } else {
                list.add(array[start]);
                list.add(array[end]);
                return list;
            }
        }
        return new ArrayList<>();
    }
}
