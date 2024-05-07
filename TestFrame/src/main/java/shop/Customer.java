package shop;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {
    private String name;
    private String adddress;
    private String account;
    private String gender;
    private String telephone;
    private int reward;
    private ShopCar shopCar;
    private List<Item>  hisItem;
    public void pay(int pay_method){
        shopCar.setPay_method(pay_method);
        if (shopCar.getPay_method() == ShopCar.TYPE_A) {
            reward += ShopCar.TYPE_A_REWARD;
        } else if (shopCar.getPay_method() == ShopCar.TYPE_B) {
            reward += ShopCar.TYPE_B_REWARD;
        }else if (shopCar.getPay_method() == ShopCar.TYPE_C) {
            reward += ShopCar.TYPE_C_REWARD;
        }else{
            System.out.println("付款方式异常！");
        }
        /**
         * 如果未付款…………
         */
        //付款成功
        System.out.println("支付"+shopCar.countSumPrice()+"元");
        //将购买的商品加入记录表
        addToHisList();
    }

    private void addToHisList() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String s_date = dateFormat.format(System.currentTimeMillis());
        for(Item it : shopCar.getItemList()){
            it.setBuy_time(s_date);
        }
        hisItem.addAll(shopCar.getItemList());
    }

    public void addShopCar(Item item,int sum){
        item.setBuy_sum(sum);
        shopCar.getItemList().add(item);
    }
    public void queryHisItemList(){
        for (Item item : this.hisItem) {
            item.disItemInf();
        }
    }
    public void queryReward(){
        System.out.println("您剩余积分:"+this.reward);
    }

    public Customer() {
        shopCar = new ShopCar((int) (System.currentTimeMillis()%1000000));
        this.hisItem = new ArrayList<>();
    }
}
