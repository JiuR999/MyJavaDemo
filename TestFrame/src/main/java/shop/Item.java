package shop;

import java.util.Date;

public class Item {
    private String item_name;
    private String item_type;
    private float price;
    private int shelf_lif;
    private int quantity;
    private Date production_date;
    private String produc_location;
    private String consultation_tel;
    private int item_sum;
    private int buy_sum;
    private String buy_time;
    public void disItemInf(){
        System.out.println("商品名称:"+this.item_name+"商品类型:"+this.item_type+"购买数量:"+this.buy_sum
        +"购买时间:"+this.buy_time);
    }

    public Item(String item_name, String item_type, float price, int shelf_lif, int quantity) {
        this.item_name = item_name;
        this.item_type = item_type;
        this.price = price;
        this.shelf_lif = shelf_lif;
        this.quantity = quantity;
    }

    public String getBuy_time() {
        return buy_time;
    }

    public void setBuy_time(String  buy_time) {
        this.buy_time = buy_time;
    }

    public int getItem_sum() {
        return item_sum;
    }

    public void setItem_sum(int item_sum) {
        this.item_sum = item_sum;
    }

    public int getBuy_sum() {
        return buy_sum;
    }

    public void setBuy_sum(int buy_sum) {
        this.buy_sum = buy_sum;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getShelf_lif() {
        return shelf_lif;
    }

    public void setShelf_lif(int shelf_lif) {
        this.shelf_lif = shelf_lif;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getProduction_date() {
        return production_date;
    }

    public void setProduction_date(Date production_date) {
        this.production_date = production_date;
    }

    public String getProduc_location() {
        return produc_location;
    }

    public void setProduc_location(String produc_location) {
        this.produc_location = produc_location;
    }

    public String getConsultation_tel() {
        return consultation_tel;
    }

    public void setConsultation_tel(String consultation_tel) {
        this.consultation_tel = consultation_tel;
    }

}
