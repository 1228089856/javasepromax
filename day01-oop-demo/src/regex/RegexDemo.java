package regex;

import java.util.Scanner;

/**
 * 需求：
 * 1、请编写程序模拟用户输入手机号码、验证格式正确，并给出提示，直到格式输入正确为止
 * 2、请编写程序模拟用户输入邮箱号码、验证格式正确，并给出提示，直到格式输入正确为止
 * 3、请编写程序模拟用户输入电话号码、验证格式正确，并给出提示，直到格式输入正确为止
 * 分析：
 * 定义方法，接收用户输入的数据，使用正则表达式完成检验，并给出提示
 */
public class RegexDemo {
    public static void main(String[] args) {
        //checkPhone();
        checkEmail();
        checkTel();
    }
    public static void checkTel() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入您的注册电话号码：");
            String tel = sc.next();

            //判断电话号码的格式是否正确
            if (tel.matches("0\\d{2,6}-?}\\d{5,20}")) {
                System.out.println("电话号码格式正确，注册完成");
                break;
            } else {
                System.out.println("格式有误");
            }
        }
    }
    public static void checkPhone() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入您的注册手机号码：");
            String phone = sc.next();

            //判断手机号码的格式是否正确
            if (phone.matches("1[3-9]\\d{9}")) {
                System.out.println("手机号码格式正确，注册完成");
                break;
            } else {
                System.out.println("格式有误");
            }
        }
    }

    public static void checkEmail() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入您的注册邮箱：");
            String email = sc.next();

            //判断邮箱的格式是否正确
            if (email.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")) {
                System.out.println("邮箱格式正确，注册完成");
                break;
            } else {
                System.out.println("格式有误");
            }
        }
    }
}
