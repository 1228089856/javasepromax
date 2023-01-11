package withdrawMoney;

public class Account {
    private String cardId;
    private  double money;

    public Account() {
    }



    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        //1、判断账户是否够钱
        if (this.money >= money){
            //2、取钱
            System.out.println(name + "取钱成功，吐出" + money);
            //3、更新余额
            this.money -= money;
            System.out.println(name +"取钱后剩余："+ this.money);
        }else {
            System.out.println("余额不足");
        }
    }
}
