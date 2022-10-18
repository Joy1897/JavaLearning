public class ForLoop {
    public static void main(String[] args) {
//        除了while和do while循环，Java使用最广泛的是for循环。
//        for循环的功能非常强大，它使用计数器实现循环。
//        for循环会先初始化计数器，然后，在每次循环前检测循环条件，在每次循环后更新计数器。计数器变量通常命名为i。
//        我们把1到100求和用for循环改写一下：
//        int sum = 0;
//        for (int i=1; i<=100; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);

//        for循环的用法是：
//            for (初始条件; 循环检测条件; 循环后更新计数器) {
        // 执行语句
//    }

//        对一个整型数组的所有元素求和，可以用for循环实现：
//        int[] ns = { 1, 4, 9, 16, 25 };
//        int sum = 0;
//        for (int i=0; i < ns.length; i++) {
//            System.out.println("i = " + i + ", ns[i] = " + ns[i]);
//            sum += ns[i];
//        }
//        System.out.println("sum = " + sum);

//        使用for循环时，千万不要在循环体内修改计数器！
//        如果希望只访问索引为奇数的数组元素，应该把for循环改写为：
//        int[] ns = { 1, 4, 9, 16, 25 };
//        for (int i=0; i<ns.length; i=i+2) {//通过更新计数器的语句i=i+2就达到了这个效果，从而避免了在循环体内去修改变量i。
//            System.out.println(ns[i]);
//        }

//        使用for循环时，计数器变量i要尽量定义在for循环中：
//        int[] ns = { 1, 4, 9, 16, 25 };
//        for (int i=0; i<ns.length; i++) {
//            System.out.println(ns[i]);
//        }
// 无法访问i
//        int n = i; // compile error!

//        如果变量i定义在for循环外：
//        int[] ns = { 1, 4, 9, 16, 25 };
//        int i;
//        for (i=0; i<ns.length; i++) {
//            System.out.println(ns[i]);
//        }
// 仍然可以使用i
//        int n = i;
//        那么，退出for循环后，变量i仍然可以被访问，这就破坏了变量应该把访问范围缩到最小的原则。

//        for each循环
//        可以更简单地遍历数组
//        不使用for each循环：
//        int[] ns = { 1, 4, 9, 16, 25 };
//        for (int i=0; i<ns.length; i++) {
//            System.out.println(ns[i]);
//        }
//        使用for each循环：
//        int[] ns = { 1, 4, 9, 16, 25 };
//        for (int n : ns) {
//            System.out.println(n);
//        }
//        和for循环相比，for each循环的变量n不再是计数器，而是直接对应到数组的每个元素。
//        for each循环的写法也更简洁。
//        但是，for each循环无法指定遍历顺序，也无法获取数组的索引。

//        练习1
//        给定一个数组，请用for循环倒序输出每一个元素：
        int[] ns = {1, 4, 9, 16, 25};
        for (int i = ns.length - 1; i >= 0; i--) {
            System.out.println(ns[i]);
        }

//        练习2
//        利用for each循环对数组每个元素求和：
        int[] ns1 = {1, 4, 9, 16, 25};
        int sum = 0;
        for (int i = 0; i < ns1.length; i++) {
            // TODO
            sum += ns1[i];
        }
        System.out.print("Sum of the Array ns1: ");
        System.out.println(sum); // 55

//        练习3
//        圆周率π可以使用公式计算：
//        请利用for循环计算π：
        double pi = 0;
        int flag = 1;//想要知道for循环执行了几次，最简单直接的方法是引入一个新变量
        for (int i = 1; i < 999999; i += 2) {
            if (flag % 2 == 1) {
                pi += 1.0 / i;
            }
            else {
                pi -= 1.0 / i;
            }
            flag++;
        }
        System.out.println(pi * 4);
//        一个想法：可以在pi的小数点后的数字位数超过15位之后终止for循环
//        pi的结果最多可以显示到小数点后15位：3.141594653593692
    }
}
