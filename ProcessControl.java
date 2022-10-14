import java.util.Scanner;
//通过import语句导入java.util.Scanner，import是导入某个类的语句，必须放到Java源代码的开头

public class ProcessControl {
    public static void main(String[] args) {
//        格式化输出，便于人类阅读
//        double d = 3.1415926;
//        System.out.printf("%.2f\n", d); // 显示两位小数3.14
//        System.out.printf("%.4f\n", d); // 显示4位小数3.1416

//        int n = 12345000;
//        System.out.printf("n=%d, hex=%08x", n, n); // 注意，两个%占位符必须传入两个数
//        %08x：表示为八位十六进制整数

//        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
//        System.out.print("Input your name: "); // 打印提示
//        String name = scanner.nextLine(); // 读取一行输入并获取字符串
//        System.out.print("Input your age: "); // 打印提示
//        int age = scanner.nextInt(); // 读取一行输入并获取整数
//        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
//        创建Scanner对象并传入System.in
//        System.out代表标准输出流，而System.in代表标准输入流。
//        直接使用System.in读取用户输入虽然是可以的，但需要更复杂的代码，而通过Scanner就可以简化后续的代码
//        Scanner会自动转换数据类型，因此不必手动转换

//        练习：输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入上次考试成绩：");
        int prev = sc.nextInt();
        System.out.println("请输入本次考试成绩：");
        int score = sc.nextInt();
        sc.close();
        double percent = ((double) score - (double) prev) / prev * 100;
        System.out.printf("成绩提高了%.2f%%", percent);
    }
}
