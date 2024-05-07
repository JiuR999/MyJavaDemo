package shop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopCar {
    static final int TYPE_A=1;
    static final int TYPE_B=2;
    static final int TYPE_C=3;
    static final int TYPE_A_REWARD=10;
    static final int TYPE_B_REWARD=20;
    static final int TYPE_C_REWARD=30;
    private int number;
    private int pay_method;
    private List<Item> itemList;
    private Date buyDate;
    public ShopCar(int number) {
        this.number = number;
        itemList = new ArrayList<>();
    }

    public float countSumPrice(){
        float sum = 0;
        for (Item item : itemList) {
            sum += item.getPrice();
        }
        return sum;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPay_method() {
        return pay_method;
    }

    public void setPay_method(int pay_method) {
        this.pay_method = pay_method;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
