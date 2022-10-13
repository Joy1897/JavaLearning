public class CharAndString {
    public static void main(String[] args) {
//        字符类型
//        字符类型char是基本数据类型，它是character的缩写。一个char保存一个Unicode字符：

        int n1 = 'A'; // 字母“A”的Unicodde编码是65
        int n2 = '中'; // 汉字“中”的Unicode编码是20013
        System.out.println(n1);
        System.out.println(n2);

//        还可以直接用转义字符+Unicode编码来表示一个字符：
// 注意是十六进制:
//        char c3 = '\u0041'; // 'A'，因为十六进制0041 = 十进制65
//        char c4 = '\u4e2d'; // '中'，因为十六进制4e2d = 十进制20013

//        字符串类型
//        和char类型不同，字符串类型String是引用类型，我们用双引号"..."表示字符串。一个字符串可以存储0个到任意个字符：

//        如果字符串本身恰好包含一个"字符怎么表示？
//        例如，"abc"xyz"，编译器就无法判断中间的引号究竟是字符串的一部分还是表示字符串结束。这个时候，我们需要借助转义字符\：
//        String s = "abc\"xyz"; // 包含7个字符: a, b, c, ", x, y, z

//        四位十六进制最多表示到65535，不能通过Unicode编码表示114514了
//        char animal_senpai = '\u1bf52';

//        字符串连接
//        Java的编译器对字符串做了特殊照顾，可以使用+连接任意字符串和其他数据类型，这样极大地方便了字符串的处理。例如：
//        String s1 = "Hello";
//        String s2 = "world";
//        String s = s1 + " " + s2 + "!";
//        System.out.println(s);
//        用+连接字符串和其他数据类型，会将其他数据类型先自动转型为字符串，再连接：
//        int age = 25;
//        String ss = "age is " + age;
//        System.out.println(ss);

//        多行字符串
//        从Java 13开始，字符串可以用"""..."""表示多行字符串（Text Blocks）了。举个例子：
//        String sql = """
//                   SELECT * FROM
//                     users
//                   WHERE id > 100
//                   ORDER BY name DESC
//                   """;
//        System.out.println(sql);

//        不可变特性
//        变的不是字符串，而是变量的“指向”。
        String s = "hello";
        String t = s;
        s = "world";
        System.out.println(t); // t是"hello"还是"world"?
        System.out.println(s);

//        空值null
//        引用类型的变量可以指向一个空值null，它表示不存在，即该变量不指向任何对象。例如：
//
//        String s1 = null; // s1是null
//        String s2 = s1; // s2也是null
//        String s3 = ""; // s3指向空字符串，不是null
//        注意要区分空值null和空字符串""，空字符串是一个有效的字符串对象，它不等于null。

        int a = 72;
        int b = 105;
        int c = 65281;

        // FIXME:
//        因为用+连接字符串和其他数据类型，会将其他数据类型先自动转型为字符串，再连接，所以添加了空串""
//        使abc强制转化为char类型，可以通过Unicode表示字符
        String res = "" + (char)a + (char)b + (char)c;
        System.out.println(res);


    }
}
