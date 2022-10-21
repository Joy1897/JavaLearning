public class CommandLineParameter {
    public static void main(String[] args) {
//        Java程序的入口是main方法，而main方法可以接受一个命令行参数，它是一个String[]数组。
//        这个命令行参数由JVM接收用户输入并传给main方法：

//        我们可以利用接收到的命令行参数，根据不同的参数执行不同的代码。例如，实现一个-version参数，打印程序版本号：
        for (String arg : args) {
            if ("-version".equals(arg)) {
                System.out.println("v 1.0");
                break;
            }
        }
//        上面这个程序必须在命令行执行，我们先编译它：
//        $ javac Main.java

//        然后，执行的时候，给它传递一个-version参数：
//        $ java Main -version

//        v 1.0
//        这样，程序就可以根据传入的命令行参数，作出不同的响应。
    }
}
