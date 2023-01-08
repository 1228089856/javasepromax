package usb;

/**
 * 实现类
 */
public class Mouse implements USB{
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "成功链接电脑");
    }

    /**
     * 独有功能
     */
    public void dbClick(){
        System.out.println(name + "成功双击");
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
