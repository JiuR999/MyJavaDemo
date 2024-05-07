package shop;

public class ShopMain {
    public static void main(String[] args) {
        //客户
        Customer customer = new Customer();
        //模拟增加三个商品
        Item item1 = new Item("薯条","零食",5.0f,10,50);
        Item item2 = new Item("纸巾","日用品",4.0f,12,500);
        Item item3 = new Item("菜刀","厨具",18.5f,20,100);
        //模拟加入购物车
        customer.addShopCar(item2,10);
        customer.addShopCar(item3,1);
        //模拟付款选择付款方式
        customer.pay(ShopCar.TYPE_B);
        //模拟查询积分
        customer.queryReward();
        //模拟查询历史购买清单
        customer.queryHisItemList();
    }
}
