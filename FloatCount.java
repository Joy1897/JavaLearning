public class FloatCount {
    public static void main(String[] args){
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        // 观察x和y是否相等:
        System.out.println(x);
        System.out.println(y);

        //由于浮点数存在运算误差，所以比较两个浮点数是否相等常常会出现错误的结果。正确的比较方法是判断两个浮点数之差的绝对值是否小于一个很小的数：
        // 比较x和y是否相等，先计算其差的绝对值:
        double r = Math.abs(x - y);
        // 再判断绝对值是否足够小:
        if (r < 0.00001) {
            // 可以认为相等
            System.out.println("equal!");
        } else {
            // 不相等
            System.out.println("not equal!");
        }

        //如果参与运算的两个数其中一个是整型，那么整型可以自动提升到浮点型：
//        int n = 5;
//        double d = 1.2 + 24.0 / n; // 6.0
//        System.out.println(d);

        //强制转型
        //可以将浮点数强制转型为整数。在转型时，浮点数的小数部分会被丢掉。如果转型后超过了整型能表示的最大范围，将返回整型的最大值。例如：
        /*
        int n1 = (int) 12.3; // 12
        int n2 = (int) 12.7; // 12
        int n2 = (int) -12.7; // -12
        int n3 = (int) (12.7 + 0.5); // 13
        int n4 = (int) 1.2e20; // 2147483647
         */

        //如果要进行四舍五入，可以对浮点数加上0.5再强制转型：
//        double d = 2.6;
//        int n = (int) (d + 0.5);
//        System.out.println(n);


    }
}
