package countNumberVoters;

import java.util.*;

/**
 * 需求：
 *  某个班级多名学生，现在需要组成秋游活动，班长提供了四个景点是{A,B,C,D},每个学生可以选择多个景点，请统计出最终哪个景点想去的人数最多
 * 分析：
 *  1、将80个学生选择的数据拿到程序中去，需要记住每个学生选择的情况
 *  2、定义Map集合用于存储最终统计的结果
 */
public class MapDemo {
    public static void main(String[] args) {
        //1、要求程序记录每个学生选择的情况
        //使用一个Map集合存储
        Map<String, List<String>> data = new HashMap<>();

        //2、把学生选择的数据存入进去
        List<String> selects = new ArrayList<>();
        Collections.addAll(selects,"A","C");
        data.put("张三",selects);

        List<String> selects1 = new ArrayList<>();
        Collections.addAll(selects1,"A","B");
        data.put("李四",selects1);

        List<String> selects2 = new ArrayList<>();
        Collections.addAll(selects2,"A","B","C");
        data.put("王五",selects2);

        System.out.println(data);


        //3、统计每个景点选择的人数
        Map<String,Integer> infos = new HashMap<>();

        //4、提取所有人选择的景点的API
        Collection<List<String>> values = data.values();

        for (List<String> value : values) {
            for (String s : value) {
                //有没有包含这个景点
                if (infos.containsKey(s)){
                    infos.put(s,infos.get(s)+1);
                }else {
                    infos.put(s,1);
                }
            }
        }
        System.out.println(infos);
    }
}
