package nowcoder.coding_interviews;

import java.util.TreeSet;

/**
 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
public class JZ40 {

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                set.remove(array[i]);
            } else {
                set.add(array[i]);
            }
        }
        num1[0] = set.first();
        num2[0] = set.last();
    }
}
