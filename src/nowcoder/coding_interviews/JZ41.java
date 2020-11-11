package nowcoder.coding_interviews;

import java.util.ArrayList;

/**
 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,
 他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!

 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 */
public class JZ41 {

    /**
     * 滑动窗口
     * 顾名思义，首先是一个窗口，既然是一个窗口，就需要用窗口的左边界i和右边界j来唯一表示一个窗口，其次，滑动代表，窗口始终从左往右移动，
     * 这也表明左边界i和右边界j始终会往后移动，而不会往左移动。
     * @param sum
     * @return
     */

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int l = 1, r = 1;
        int temp = 0;
        while ( l <= sum / 2) {
            if (temp < sum) {
                temp = temp + r;
                r++;
            } else if (temp > sum) {
                temp = temp - l;
                l++;
            } else  {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = l; i < r; i++) {
                    list.add(i);
                }
                result.add(list);
                temp = temp - l;
                l++;
            }
        }
        return result;
    }
}
