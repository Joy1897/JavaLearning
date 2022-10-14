public class WhileLoop {
    public static void main(String[] args) {
//        我们用while循环来累加1到100，可以这么写：
//        int sum = 0; // 累加的和，初始化为0
//        int n = 1;
//        while (n <= 100) { // 循环条件是n <= 100
//            sum = sum + n; // 把n累加到sum中
//            n ++; // n自身加1
//        }
//        System.out.println(sum); // 5050

//        注意到while循环是先判断循环条件，再循环，因此，有可能一次循环都不做。
//        下面的代码在 n = 100 时还会再做一次循环，所以会得到 5050 + 101 = 5151 的结果
//        对于循环条件判断，以及自增变量的处理，要特别注意边界条件
//        int sum = 0;
//        int n = 0;
//        while (n <= 100) {
//            n ++;
//            sum = sum + n;
//        }
//        System.out.println(sum);

//        如果循环条件永远满足，那这个循环就变成了死循环
//        如果循环条件的逻辑写得有问题，也会造成意料之外的结果：
//        int sum = 0;
//        int n = 1;
//        while (n > 0) {
//            sum = sum + n;
//            n ++;
//        }
//        System.out.println(n); // -2147483648
//        System.out.println(sum);
//        表面上看，上面的while循环是一个死循环
//        但是，Java的int类型有最大值，达到最大值后，再加1会变成负数，结果，意外退出了while循环。

//        练习
//        使用while计算从m到n的和：
        int sum = 0;
        int m = 20;
        int n = 100;
        // FIXME: 使用while计算M+...+N:
        while (m < n) {
            sum += m;
            m++;
        }
        System.out.println(sum);
    }
}
