import java.util.Arrays;

public class ArrayType {
    public static void main(String[] args) {
        // 5位同学的成绩:
//        int n1 = 68;
//        int n2 = 79;
//        int n3 = 91;
//        int n4 = 85;
//        int n5 = 62;

//        但其实没有必要定义5个int变量。可以使用数组来表示“一组”int类型。代码如下：
        int[] ns = new int[5];
        ns[0] = 68;
        ns[1] = 79;
        ns[2] = 91;
        ns[3] = 85;
        ns[4] = 62;
        System.out.println(ns.length); // 5
//        用数组变量.length获取数组大小：

//        数组是引用类型，在使用索引访问数组元素时，如果索引超出范围，运行时将报错：
//        int n = 5;
//        System.out.println(ns[n]); // 索引n不能超出范围，应该为0-4

//        可以在定义数组时直接指定初始化的元素，这样就不必写出数组大小，而是由编译器自动推算数组大小。例如：
//        int[] ns = new int[] { 68, 79, 91, 85, 62 };
//        System.out.println(ns.length); // 编译器自动推算数组大小为5
//        还可以进一步简写为：
//        int[] ns = { 68, 79, 91, 85, 62 };

//        注意数组是引用类型，并且数组大小不可变
        int[] ns2;
        ns2 = new int[] { 68, 79, 91, 85, 62 };
        System.out.println(ns2.length); // 5
        ns2 = new int[] { 1, 2, 3 };
        System.out.println(ns2.length); // 3
//        数组大小变了吗？看上去好像是变了，但其实根本没变。
//        对于数组ns来说，执行ns = new int[] { 68, 79, 91, 85, 62 };时，它指向一个5个元素的数组：
//
//        ns
//      │
//      ▼
//┌───┬───┬───┬───┬───┬───┬───┐
//│   │68 │79 │91 │85 │62 │   │
//└───┴───┴───┴───┴───┴───┴───┘
//        执行ns = new int[] { 1, 2, 3 };时，它指向一个新的3个元素的数组：
//
//        ns ──────────────────────┐
//                              │
//                              ▼
//┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐
//│   │68 │79 │91 │85 │62 │   │ 1 │ 2 │ 3 │   │
//└───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘
//        但是，原有的5个元素的数组并没有改变，只是无法通过变量ns引用到它们而已。

        String[] names = {"ABC", "XYZ", "zoo"};
        System.out.println("names[1]的内存地址是：" + System.identityHashCode(names[1]));
        String s = names[1];
        System.out.println("s的内存地址是：" + System.identityHashCode(s));
        names[1] = "cat";
        System.out.println("names[1]的内存地址是：" + System.identityHashCode(names[1]));
        System.out.println("s的内存地址是：" + System.identityHashCode(s));
        System.out.println(s); // s是"XYZ"还是"cat"?
        System.out.println(Arrays.toString(names));
//      变量s的内存地址没变，始终指向names[1]的内存地址，故而s的值也不会变动
    }
}
