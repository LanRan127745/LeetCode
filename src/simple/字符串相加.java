package simple;

// 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
public class 字符串相加 {
    public static void main(String[] args) {
        System.out.println(addStrings("1", "9"));
    }
    public static String addStrings(String num1, String num2) {
        // 定义两个指针，指向末尾
        int length1 = num1.length() - 1;
        int length2 = num2.length() - 1;
        int temp = 0;

        // 非线程安全，效率高
        StringBuilder str =  new StringBuilder();

        while(length1 >= 0 || length2 >= 0 || temp != 0){

            int result = 0;
            //char --> int 向大容量数据转换是自动类型转换
            //ASCII表中的字符0~9的对应的十进制位数为48-57
            //减去字符0对应的ASCII码（48）后就是对应的0-9

            int n1 = length1 >= 0 ? num1.charAt(length1) - '0' : 0;
            int n2 = length2 >= 0 ? num2.charAt(length1) - '0' : 0;

            result = (n1 + n2 + temp);
            str.insert(0, result % 10);
            temp = result / 10;
            length1--;
            length2--;
        }
        return str.toString();
    }
}
