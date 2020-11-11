package nowcoder.coding_interviews;

/**
 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class JZ47 {

    public int Sum_Solution(int n) {

//        if (n == 1) {
//            return 1;
//        }

        boolean x = n > 1 && (n += Sum_Solution(n - 1)) > 0;

        return n;
    }

    public static void main(String[] args) {
        JZ47 jz47 = new JZ47();
        System.out.println(jz47.Sum_Solution(10));
    }
}
