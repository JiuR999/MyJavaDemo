package temp;

import java.util.concurrent.*;

class TicketCounter {
    private int availableTickets;
    private Semaphore semaphore;

    public TicketCounter(int totalTickets) {
        availableTickets = totalTickets;
        semaphore = new Semaphore(1);
    }

    public boolean bookTicket(int requestedTickets) {
        try {
            semaphore.acquire(); // 获取信号量

            if (availableTickets >= requestedTickets) {
                // 模拟网络延迟
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //System.out.println(Thread.currentThread().getName() + " 抢到了 " + requestedTickets + " 张票");
                availableTickets -= requestedTickets;

                return true;
            } else {
                System.out.println(Thread.currentThread().getName() + " 抢票失败");
                return false;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        } finally {
            semaphore.release(); // 释放信号量
        }
    }
}

class Passenger implements Runnable {
    private TicketCounter ticketCounter;
    private int requestedTickets;

    public Passenger(TicketCounter counter, int num) {
        ticketCounter = counter;
        requestedTickets = num;
    }

    @Override
    public void run() {
        boolean success = ticketCounter.bookTicket(requestedTickets);
        //System.out.println(Thread.currentThread().getName() + " 开始抢票");
        if (success) {
            System.out.println(Thread.currentThread().getName() + " 成功抢到票");
        } else {
            System.out.println(Thread.currentThread().getName() + " 抢票失败");
        }
    }
}

class TicketBookingSimulation {
    public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter(10);
        int passengerCount = 25;

        ExecutorService executorService = Executors.newFixedThreadPool(passengerCount); // 创建线程池

        for (int i = passengerCount; i >= 1; i--) {
            executorService.execute(new Passenger(ticketCounter, 1));
        }

        executorService.shutdown(); // 关闭线程池
    }
}