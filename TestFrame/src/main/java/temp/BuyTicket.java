package temp;

public class BuyTicket extends Thread{
    public static int tickets=1000;

    @Override
    public void run() {
        while (sale()) {
        }
    }
    synchronized public static boolean sale(){

        if(tickets>0){
            tickets--;
            System.out.println(Thread.currentThread().getName() + "�ɹ���Ʊ��ʣ��Ʊ��Ϊ" + tickets);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return true;
        }else {
            System.out.println(Thread.currentThread().getName() + "��Ʊ���㣬ֹͣ��Ʊ��");
            return false;
        }
    }

    public static  void main(String[] args){

        BuyTicket buyTicket = new BuyTicket();
        for(int i=4;i>=1;i--){
            Thread t = new Thread(buyTicket,i+"����-");
            t.start();
        }

    }

}