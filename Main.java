public class Main {
    public static void main(String[] args){
        //变量
        int x = 1;
        System.out.println(x);

        x = 100;//变量x已经被定义，不能再次使用"int x = 100"的语句来定义
        System.out.println(x);//变量x的初始值是1，但是重新被赋值为100

        int n = 100;
        System.out.println("n = " + n); // 打印n的值

        n = 200; // 变量n赋值为200
        System.out.println("n = " + n); // 打印n的值

        int y = n; // 变量x赋值为n（n的值为200，因此赋值后x的值也是200）
        System.out.println("y = " + y); // 打印x的值

        y = y + 100; // 变量x赋值为x+100（x的值为200，因此赋值后x的值是200+100=300）
        System.out.println("y = " + y); // 打印x的值
        System.out.println("n = " + n); // 再次打印n的值，n应该是200还是300？

        //一些整型变量的定义
        byte b1 = -128;
        byte b2 = 127;
        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // 加下划线更容易识别
        int i4 = 0xff0000; // 十六进制表示的16711680
        int i5 = 0b1000000000; // 二进制表示的512
        long l = 9000000000000000000L; // long型的结尾需要加L
        /*
        各种整型能表示的最大范围如下：
        byte：-128 ~ 127
        short: -32768 ~ 32767
        int: -2147483648 ~ 2147483647
        long: -9223372036854775808 ~ 9223372036854775807
        */

        //浮点型，浮点数可表示的范围非常大，float类型可最大表示3.4x10^38，而double类型可最大表示1.79x10^308。
        float f1 = 3.14f;
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38，float类型加上f后缀
        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324

        //布尔型,理论上存储布尔类型只需要1 bit，但是通常JVM内部会把boolean表示为4字节整数。
        boolean bool1 = true;
        boolean bool2 = false;
        boolean isGreater = 5 > 3; // 计算结果为true
        System.out.println(isGreater);
        int age = 12;
        boolean isAdult = age >= 18; // 计算结果为false
        System.out.println(isAdult);

        //字符类型，表示一个字符；Java的char类型除了可表示标准的ASCII外，还可以表示一个Unicode字符
        //注意char类型使用单引号'，且仅有一个字符，要和双引号"的字符串类型区分开。
        char a = 'A';
        char zh = '中';
        System.out.println(a);
        System.out.println(zh);

        //引用类型，最常见的是String字符串
        String xx = "Hello!";

        //常量，通过加上final修饰符来进行常量的定义
        final double PI = 3.14; // PI是一个常量
        double r = 5.0;
        double area = PI * r * r;
        //PI = 300; // compile error!
        //常量在定义时进行初始化后就不可再次赋值，再次赋值会导致编译错误。
        //根据习惯，常量名通常全部大写。
        /*
        常量的作用是用有意义的变量名来避免魔术数字（Magic number）
        魔术数字（magic number）是程式设计中所谓的直接写在程式码里的具体数值（如“10”“123”等以数字直接写出的值）
        虽然程式作者写的时候自己能了解数值的意义，但对其他程式员而言，甚至制作者本人经过一段时间后，会难以了解这个数值的用途
        只能苦笑讽刺“这个数值的意义虽然不懂，不过至少程式会动，真是个魔术般的数字”而得名。
        */

        //var关键字，可以少写变量类型
        StringBuilder sb =  new StringBuilder();
        //var sb = new StringBuilder();
        //上面两条语句效力相同

        //变量作用范围
        //定义变量时，要遵循作用域最小化原则，尽量将变量定义在尽可能小的作用域，并且，不要重复使用变量名。
    }
}
