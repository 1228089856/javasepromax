package staticDemo;

public class User {
    /**
     * 在线人数
     * 注意：static修饰的成员变量，静态成员变量，只在内存中一份
     */
    public static int onlineNumber = 161;
    /**
     * 实例成员变量： 无static修饰，属于每个对象的，必须使用对象名.访问
     */
    private String name;
    private int age;

    public static void main(String[] args) {
        //目标：理解static修饰成员变量的作用和访问特点。
        //1、类名.静态成员变量
        System.out.println(User.onlineNumber);

        //2、对象名.实例成员变量

        User u = new User();
        u.name = "张三";
        u.age = 21;
        u.onlineNumber++;
        System.out.println(u.onlineNumber);
    }
}
