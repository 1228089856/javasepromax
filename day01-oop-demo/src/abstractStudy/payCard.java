package abstractStudy;
/*
系统需求：
    某加油站推出了两种支付卡，一种是预存10000的金卡，后续加油享受8折优惠，另一种是预存5000的银卡，后续加油享受8.5折优惠
    请分别实现两种卡片进入收银系统后的逻辑，卡片需要包含主人名称，余额，支付功能
分析实现
    1、创建一张卡片父类：定义属性包括主人名称、余额、支付功能（具体实现交给子类）
    2、创建一张白金卡类：重写支付功能，按照原价的把这计算输出
    3、创建一张银卡类：重写支付功能，按照原价的8.5折计算输出
 */
public class payCard {
    public static void main(String[] args) {
        //目标：学习一下抽象类的基本使用，做父类，被继承，重写抽象方法
        GoldCard c = new GoldCard();
        c.setMoney(10000);
        c.setUserName("dlei");

        c.pay(300);
        System.out.println("剩余：" + c.getMoney());
    }
}
