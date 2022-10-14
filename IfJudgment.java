import java.util.Scanner;

public class IfJudgment {
    public static void main(String[] args) {
//        当条件n >= 60计算结果为true时，if语句块被执行，将打印"及格了"，否则，if语句块将被跳过
//        int n = 59;
//        if (n >= 60) {
//            System.out.println("及格了");
//        }
//        System.out.println("END");

//        当if语句块只有一行语句时，可以省略花括号{}
//        int n = 70;
//        if (n >= 60)
//            System.out.println("及格了");
//        System.out.println("END");

//        但是，省略花括号并不总是一个好主意。假设某个时候，突然想给if语句块增加一条语句时：
//        int n = 50;
//        if (n >= 60)
//            System.out.println("及格了");
//        System.out.println("恭喜你"); // 注意这条语句不是if语句块的一部分
//        System.out.println("END");
//        由于使用缩进格式，很容易把两行语句都看成if语句的执行块，但实际上只有第一行语句是if的执行块
//        在使用git这些版本控制系统自动合并时更容易出问题
//        所以不推荐忽略花括号的写法。

//        在串联使用多个if时，要特别注意判断顺序。正确的方式是按照判断范围从大到小或从小到大依次判断：
//        使用if时，还要特别注意边界条件

//        浮点数在计算机中常常无法精确表示，并且计算可能出现误差，因此，判断浮点数相等用==判断不靠谱
//        正确的方法是利用差值小于某个临界值来判断：
//        double x = 1 - 9.0 / 10;
//        if (Math.abs(x - 0.1) < 0.00001) {
//            System.out.println("x is 0.1");
//        } else {
//            System.out.println("x is NOT 0.1");
//        }

//        在Java中，判断值类型的变量是否相等，可以使用==运算符。
//        但是，判断引用类型的变量是否相等，==表示“引用是否相等”，或者说，是否指向同一个对象。
//        例如，下面的两个String类型，它们的内容是相同的，但是，分别指向不同的对象，用==判断，结果为false：
//        String s1 = "hello";
//        String s2 = "HELLO".toLowerCase();
//        System.out.println(s1);
//        System.out.println(s2);
//        if (s1 == s2) {
//            System.out.println("s1 == s2");
//        } else {
//            System.out.println("s1 != s2");
//        }

//        要判断引用类型的变量内容是否相等，必须使用equals()方法：
//        String s1 = "hello";
//        String s2 = "HELLO".toLowerCase();
//        System.out.println(s1);
//        System.out.println(s2);
//        if (s1.equals(s2)) {
//            System.out.println("s1 equals s2");
//        } else {
//            System.out.println("s1 not equals s2");
//        }

//        执行语句s1.equals(s2)时，如果变量s1为null，会报NullPointerException：
//        String s1 = null;
//        if (s1.equals("hello")) {
//            System.out.println("hello");
//        }

//        要避免NullPointerException错误，可以利用短路运算符&&：
//        String s1 = null;
//        if (s1 != null && s1.equals("hello")) {
//            还可以把一定不是null的对象"hello"放到前面：例如：if ("hello".equals(s)) { ... }。
//            System.out.println("hello");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Height (m): ");
        double height = scanner.nextDouble();
        System.out.print("Weight (kg): ");
        double weight = scanner.nextDouble();
        // FIXME:
        double bmi = weight / (height * height);
        // TODO: 打印BMI值及结果
        System.out.printf("Your BMI is: %.2f\n", bmi);
        if (bmi < 18.5){
            System.out.println("BMI结果: 过轻");
        }
        else if(bmi >= 18.5 && bmi < 25){
            System.out.println("BMI结果: 正常");
        }
        else if(bmi >= 25 && bmi < 28){
            System.out.println("BMI结果: 过重");
        }
        else if(bmi >=28 && bmi <= 32){
            System.out.println("BMI结果: 肥胖");
        }
        else if(bmi > 32){
            System.out.println("BMI结果: 非常肥胖");
        }
    }
}
