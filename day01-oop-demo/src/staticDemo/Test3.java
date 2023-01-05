package staticDemo;


public class Test3 {
    /**
     * 静态成员
     */
    public static int onlineNumber = 10;
    public static void test2(){
        System.out.println("==test2==");
    }

    /**
     * 实例成员
     */
    private String name;
    public void run(){
        System.out.println(name+ "跑得快");
    }
    //3、静态方法中不可以出现this关键字
    public static void test3(){
       // System.out.println(this);//this代表当前对象！！
    }
    //2、实例方法可以访问静态成员，也可以访问实例成员
    public void go(){
        System.out.println(onlineNumber);
        System.out.println(Test3.onlineNumber);
        test2();
        Test3.test2();
        System.out.println(name);
        run();
    }
    //1、静态方法只能访问静态成员，不能直接访问实例成员
    public static  void test(){
        System.out.println(onlineNumber);
        System.out.println(Test3.onlineNumber);
        test2();
        Test3.test2();
        Test3 t= new Test3();
        //System.out.println(name);//不能直接访问实例成员，报错
        System.out.println(t.name);//可以间接访问实例成员
        // run();//不能直接访问实例成员
    }
    public static void main(String[] args) {
        //目标: 理解static 访问相关的语法，面试笔试题，或者以后理解程序很重要的知识（拓展）
    }
}
