public class Test1 {
    public static void main(String[] args) {
         Game Huowu = new Game("��֪����",200,"��������");
        Game GongBenWuzang = new Game("�������",300,"����һ��");
        while ((Huowu.getSum()  >0) && (GongBenWuzang.getSum() > 0)){
            Huowu.fight(GongBenWuzang);
            if(GongBenWuzang.sum == 0) break;
            GongBenWuzang.fight(Huowu);
            //System.out.println(Huowu.getSum());
        }
    }
}
