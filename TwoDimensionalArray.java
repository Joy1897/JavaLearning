import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
//        int[][] ns = {
//                { 1, 2, 3, 4 },
//                { 5, 6, 7, 8 },
//                { 9, 10, 11, 12 }
//        };
//        System.out.println(ns.length); // 3,ns包含3个数组
//        int[] arr0 = ns[0];
//        System.out.println(arr0.length); // 4,
//         arr0获取了ns数组的第0个元素。因为ns数组的每个元素也是一个数组，因此，arr0指向的数组就是{ 1, 2, 3, 4 }

//        访问二维数组的某个元素需要使用array[row][col]，例如：
//        System.out.println(ns[1][2]); // 7

//        要打印一个二维数组，可以使用两层嵌套的for循环：
//        或者使用Java标准库的Arrays.deepToString()：
//        for (int[] arr : ns) {
//            for (int n : arr) {
//                System.out.print(n);
//                System.out.print(',');
//            }
//            System.out.println();
//        }
//        System.out.println(Arrays.deepToString(ns));

//        三维数组
//        三维数组就是二维数组的数组。可以这么定义一个三维数组：
//        int[][][] ns1 = {
//                {
//                        {1, 2, 3},
//                        {4, 5, 6},
//                        {7, 8, 9}
//                },
//                {
//                        {10, 11},
//                        {12, 13}
//                },
//                {
//                        {14, 15, 16},
//                        {17, 18}
//                }
//        };
//        如果我们要访问三维数组的某个元素，例如，ns[2][0][1]，只需要顺着定位找到对应的最终元素15即可。
//        理论上，我们可以定义任意的N维数组。但在实际应用中，除了二维数组在某些时候还能用得上，更高维度的数组很少使用。

//        练习
//        使用二维数组可以表示一组学生的各科成绩，请计算所有学生的平均分：
        int[][] scores = {
                { 82, 90, 91 },
                { 68, 72, 64 },
                { 95, 91, 89 },
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        // TODO:
        double average = 0;
        int stu_num = 0;
        for (int[] arr : scores) {
            for (int n : arr) {
                stu_num++;
                average += n;
            }
        }

        average = average / stu_num;

        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}
