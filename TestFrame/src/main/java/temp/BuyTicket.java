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
            System.out.println(Thread.currentThread().getName() + "成功出票，剩余票数为" + tickets);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return true;
        }else {
            System.out.println(Thread.currentThread().getName() + "余票不足，停止售票！");
            return false;
        }
    }

    public static  void main(String[] args){

        BuyTicket buyTicket = new BuyTicket();
        for(int i=4;i>=1;i--){
            Thread t = new Thread(buyTicket,i+"窗口-");
            t.start();
        }

    }

}