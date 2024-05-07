import java.util.Random;

public class Game {
    private String name ;
    int sum ;
    private String styleName ;

    public Game() {
    }

    public Game(String name, int sum, String styleName) {
        this.name = name;
        this.sum = sum;
        this.styleName = styleName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }
    public void fight(Game fighter) {
        Random nameFight = new Random();
        int a = nameFight.nextInt(20) + 1;
        fighter.sum = fighter.sum - a;
        if(fighter.getSum()<=0){
            System.out.println(this.name + "KO" + fighter.getName());
        }else{
            System.out.println(this.name + "ʹ����" + this.styleName + "��" + fighter.getName() +
                    "�����" + a +"���˺�");
        }
    }
}
