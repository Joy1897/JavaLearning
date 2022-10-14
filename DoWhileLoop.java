public class DoWhileLoop {
    public static void main(String[] args) {
//        在Java中，while循环是先判断循环条件，再执行循环。而另一种do while循环则是先执行循环，再判断条件，条件满足时继续循环，条件不满足时退出。它的用法是：
//        do {
//            执行循环语句
//        } while (条件表达式);
//        可见，do while循环会至少循环一次。

//        int sum = 0;
//        int n = 1;
//        do {
//            sum = sum + n;
//            n ++;
//        } while (n <= 100);
//        System.out.println(sum);

//        练习
//        使用do while循环计算从m到n的和。
        int sum = 0;
        int m = 20;
        int n = 100;
        // 使用do while计算M+...+N:
        do {
            sum += m;
            m++;
        } while (m < n);
        System.out.println(sum);
    }
}
