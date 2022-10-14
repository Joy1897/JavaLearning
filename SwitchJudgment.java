import java.util.Scanner;

public class SwitchJudgment {
    public static void main(String[] args) {
        int option = 1;
        switch (option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
//            如果option的值没有匹配到任何case，例如option = 99
//            那么，switch语句不会执行任何语句。这时，可以给switch语句加一个default，当没有匹配到任何case时，执行default：
            default:
                System.out.println("Not selected");
                break;
        }

//        使用switch时，注意case语句并没有花括号{}，而且，case语句具有“穿透性”，漏写break将导致意想不到的结果：
//        switch (option) {
//            case 1:
//                System.out.println("Selected 1");
//            case 2:
//                System.out.println("Selected 2");
//            case 3:
//                System.out.println("Selected 3");
//            default:
//                System.out.println("Not selected");
//        }
//        当option = 2时，将依次输出"Selected 2"、"Selected 3"、"Not selected"
//        原因是从匹配到case 2开始，后续语句将全部执行，直到遇到break语句。因此，任何时候都不要忘记写break。

//        如果有几个case语句执行的是同一组语句块，可以这么写：
//        int option = 2;
//        switch (option) {
//            case 1:
//                System.out.println("Selected 1");
//                break;
//            case 2:
//            case 3:
//                System.out.println("Selected 2, 3");
//                break;
//            default:
//                System.out.println("Not selected");
//                break;
//        }

//        switch语句还可以匹配字符串。字符串匹配时，是比较“内容相等”。例如：
//        String fruit = "apple";
//        switch (fruit) {
//            case "apple":
//                System.out.println("Selected apple");
//                break;
//            case "pear":
//                System.out.println("Selected pear");
//                break;
//            case "mango":
//                System.out.println("Selected mango");
//                break;
//            default:
//                System.out.println("No fruit selected");
//                break;
//        }

//        使用switch时，如果遗漏了break，就会造成严重的逻辑错误，而且不易在源代码中发现错误
//        Java 12开始，
//        switch语句升级为更简洁的表达式语法，
//        使用类似模式匹配（Pattern Matching）的方法，保证只有一种路径会被执行，并且不需要break语句：
//        String fruit = "apple";
//        switch (fruit) {
//            case "apple" -> System.out.println("Selected apple");
//            case "pear" -> System.out.println("Selected pear");
//            case "mango" -> {
//                System.out.println("Selected mango");
//                System.out.println("Good choice!");
//            }
//            default -> System.out.println("No fruit selected");
//        }

//        使用新的switch语法，不但不需要break，还可以直接返回值。使得代码更简洁
//        String fruit = "apple";
//        int opt = switch (fruit) {
//            case "apple" -> 1;
//            case "pear", "mango" -> 2;
//            default -> 0;
//        }; // 注意赋值语句要以;结束
//        System.out.println("opt = " + opt);

//        yield
//        但是，如果需要复杂的语句，我们也可以写很多语句，放到{...}里，然后，用yield返回一个值作为switch语句的返回值：
//        String fruit = "orange";
//        int opt = switch (fruit) {
//            case "apple" -> 1;
//            case "pear", "mango" -> 2;
//            default -> {
//                int code = fruit.hashCode();//HashCode经常用于确定对象的存储地址
//                yield code; // switch语句返回值
//            }
//        };
//        System.out.println("opt = " + opt);

//        练习
        Scanner sc = new Scanner(System.in);
        System.out.println("please choice:");
        System.out.println(" 1: Rock");
        System.out.println(" 2: Scissors");
        System.out.println(" 3: Paper");
        // 用户输入:
        int choice = sc.nextInt();
        // 计算机随机数 1, 2, 3:
        int random = 1 + (int) (Math.random() * 3);
        switch (choice) {
            // TODO:
            case 1 -> {
//                System.out.print(random == choice ? "平局" : (random == 2 ? "胜利" : "失败"));
                System.out.println("你选择出石头！");
                if (choice == random) {
                    System.out.println("电脑出的是石头，平局！");
                } else if (random == 2) {
                    System.out.println("电脑出的是剪刀，你赢了！");
                } else if (random == 3) {
                    System.out.println("电脑出的是布，你输了！");
                }
            }
            case 2 -> {
                System.out.println("你选择出剪刀！");
                if (choice == random) {
                    System.out.println("电脑出的是剪刀，平局！");
                } else if (random == 3) {
                    System.out.println("电脑出的是布，你赢了！");
                } else if (random == 1) {
                    System.out.println("电脑出的是石头，你输了！");
                }
            }
            case 3 -> {
                System.out.println("你选择出布！");
                if (choice == random) {
                    System.out.println("电脑出的是布，平局！");
                } else if (random == 1) {
                    System.out.println("电脑出的是石头，你赢了！");
                } else if (random == 2) {
                    System.out.println("电脑出的是剪刀，你输了！");
                }
            }
            default -> System.out.println("请输入1,2或者3！");
        }
    }
}

