public class FloatCountPractice {
    public static void main(String[] args){//如果main方法不传入"String[] args"参数则无法运行这个Java Class文件
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        // 求平方根可用 Math.sqrt():
        // System.out.println(Math.sqrt(2)); ==> 1.414
        // TODO:根据一元二次方程的求根公式，计算出一元二次方程的两个解
        double sqrt = Math.sqrt(b * b - 4 * a * c);//推荐使用变量包裹这个公式
        double r1 = (-b + sqrt) / (2 * a);
        double r2 = (-b - sqrt) / (2 * a);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");
    }
}
