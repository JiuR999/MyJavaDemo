public class Test1 {
    public static void main(String[] args) {
         Game Huowu = new Game("不知火舞",200,"飞天神扇");
        Game GongBenWuzang = new Game("宫本武藏",300,"二天一流");
        while ((Huowu.getSum()  >0) && (GongBenWuzang.getSum() > 0)){
            Huowu.fight(GongBenWuzang);
            if(GongBenWuzang.sum == 0) break;
            GongBenWuzang.fight(Huowu);
            //System.out.println(Huowu.getSum());
        }
    }
}
