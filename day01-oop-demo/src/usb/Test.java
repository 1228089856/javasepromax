package usb;
/**
 * 需求：使用面向对象编程模拟：设计一个电脑对象，可以安装两个USB设备
 * 鼠标：被安装时可以完成接入、调用点击功能、拔出功能
 * 键盘：被安装时可以完成接入、调用打字功能、拔出功能
 * 分析：
 *  1、定义一个USB的接口（申明USB设备的规范必须是：可以接入和拔出）
 *  2、提供两个USB实现类代表鼠标和键盘，让其实现USB接口，并分别定义独有功能
 *  3、创建电脑对象，创建两个USB实现类对象，分辨安装到电脑中并触发功能的执行
 */
public class Test {
    public static void main(String[] args) {
        //a.创建电脑对象
        Computer c = new Computer("外星人");
        c.start();

        //b.创建鼠标对象，键盘对象
        USB u = new KeyBoard("双飞燕");
        c.installUSB(u);

        USB u1 = new Mouse("罗技鼠标");
        c.installUSB(u1);
    }
}
