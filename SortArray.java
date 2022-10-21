import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
//        冒泡法排序
//        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
//        // 排序前:
//        System.out.println(Arrays.toString(ns));
//        for (int i = 0; i < ns.length - 1; i++) {
//            for (int j = 0; j < ns.length - i - 1; j++) {
//                if (ns[j] > ns[j+1]) {
////                    注意到交换两个变量的值必须借助一个临时变量
////                    int x = 1;
////                    int y = 2;
////
////                    int t = x; // 把x的值保存在临时变量t中, t现在是1
////                    x = y; // x现在是2
////                    y = t; // y现在是t的值1
//                    // 交换ns[j]和ns[j+1]:
//                    int tmp = ns[j];
//                    ns[j] = ns[j+1];
//                    ns[j+1] = tmp;
//                }
//            }
//        }
//        // 排序后:
//        System.out.println(Arrays.toString(ns));

//        实际上，Java的标准库已经内置了排序功能，我们只需要调用JDK提供的Arrays.sort()就可以排序
//        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
//        Arrays.sort(ns);
//        System.out.println(Arrays.toString(ns));
//        必须注意，对数组排序实际上修改了数组本身（修改了"指向"）
//        当我们调用Arrays.sort(ns);后，变量ns指向的数组内容已经被改变了。

//        练习
//        请思考如何实现对数组进行降序排序：
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };

        // 排序前:
        System.out.println(Arrays.toString(ns));
        // TODO:
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] < ns[j + 1]) {
                    int tmp = ns[j + 1];
                    ns[j + 1] = ns[j];
                    ns[j] = tmp;
                }
            }
        }

        // 排序后:
        System.out.println(Arrays.toString(ns));
        if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}

