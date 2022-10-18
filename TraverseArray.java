import java.util.Arrays;

public class TraverseArray {
    public static void main(String[] args) {
//        可以使用for循环和for each进行数组的遍历

//        打印数组内容
//        直接打印数组变量，得到的是数组在JVM中的引用地址：
//        int[] ns = { 1, 1, 2, 3, 5, 8 };
//        System.out.println(ns); // 类似 [I@7852e922

//        这并没有什么意义，因为我们希望打印的数组的元素内容。因此，使用for each循环来打印它：
//        int[] ns = {1, 1, 2, 3, 5, 8};
//        for (int n : ns) {
//            System.out.print(n + ", ");
//        }

//        使用for each循环打印也很麻烦。幸好Java标准库提供了Arrays.toString()，可以快速打印数组内容：
        int[] ns = { 1, 1, 2, 3, 5, 8 };
        System.out.println(Arrays.toString(ns));

//        练习
        int[] ns1 = { 1, 4, 9, 16, 25 };
        // 倒序打印数组元素:
        for (int i = ns1.length - 1; i >= 0; i--) {
            System.out.println(ns1[i]);
        }
    }
}
