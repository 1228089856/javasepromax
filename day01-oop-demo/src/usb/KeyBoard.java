package usb;

/**
 * 实现类
 */
public class KeyBoard implements USB{
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "成功链接电脑");
    }

    /**
     * 独有功能
     */
    public void keyDown(){
        System.out.println(name + "成功敲击");
    }
    @Override
    public void unconnect() {
        System.out.println(name + "成功从电脑中拔出");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
