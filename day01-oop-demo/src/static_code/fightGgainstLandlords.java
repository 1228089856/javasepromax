package static_code;

import java.util.ArrayList;

/*
需求：
    在启动游戏房间的时候，应该提前准备好54张牌，后续才可以直接使用这些牌数据
分析：
    1、该房间只需要一副牌
    2、定义一个静态的ArrayList集合存储54张牌对象，静态的集合只会加载一份
    3、在启动游戏房间前，应该将54张牌初始化好
    4、当系统启动的同时需要准备好54张牌数据，此时可以用静态代码块完成
 */
public class fightGgainstLandlords {

    /**
     * 1、定义一个静态的集合，这样这个集合只加载一次
     */
    public static ArrayList<String> cards = new ArrayList<>();

    /**
     * 2、在程序真正运行main方法前，把54张牌放进去，后续游戏可以直接使用了
     *
     */
    static {
        //3、正式做牌，放到集合中去
        //a、定义一个数组存储全部点数：类型确定了，个数确定了
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //b、定义一个数组存储全部的花色，类型确定了，个数确定了
        String[] colors = {"♥", "♦", "♠", "♣"};
        //c、遍历点数
        for (int i = 0; i < sizes.length; i++) {
            //size[i]
            //d、遍历花色
            for (int j = 0; j < colors.length; j++) {
                //colors[j]
                //一张牌
                String card = sizes[i] + colors[j];
                cards.add(card);
            }
        }
        //e、单独加入大小王
        cards.add("♕");
        cards.add("♔");
    }

    public static void main(String[] args) {
        //目标：模拟游戏启动前，初始化54张牌数据
        System.out.println("新牌" + cards);
    }
}
