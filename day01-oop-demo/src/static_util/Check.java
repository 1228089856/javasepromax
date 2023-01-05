package static_util;

import java.util.Random;

public class Check {

    public static void main(String[] args) {
        //开发一个验证码
        //1、定义一个变量记住验证码
        String code = "";
        //2、定义一个变量记住全部验证码字符
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random r = new Random();
        //3、定义一个训话生成几个随机数，去得到几个字符
        for (int i = 0; i < 5; i++) {
            //4、获取随机索引对应的字符，连接给code
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        System.out.println("验证码"+code);
    }
}
