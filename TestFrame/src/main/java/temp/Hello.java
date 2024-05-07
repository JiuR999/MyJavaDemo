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
            semaphore.acquire(); // ��ȡ�ź���

            if (availableTickets >= requestedTickets) {
                // ģ�������ӳ�
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //System.out.println(Thread.currentThread().getName() + " ������ " + requestedTickets + " ��Ʊ");
                availableTickets -= requestedTickets;

                return true;
            } else {
                System.out.println(Thread.currentThread().getName() + " ��Ʊʧ��");
                return false;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        } finally {
            semaphore.release(); // �ͷ��ź���
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
        //System.out.println(Thread.currentThread().getName() + " ��ʼ��Ʊ");
        if (success) {
            System.out.println(Thread.currentThread().getName() + " �ɹ�����Ʊ");
        } else {
            System.out.println(Thread.currentThread().getName() + " ��Ʊʧ��");
        }
    }
}

class TicketBookingSimulation {
    public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter(10);
        int passengerCount = 25;

        ExecutorService executorService = Executors.newFixedThreadPool(passengerCount); // �����̳߳�

        for (int i = passengerCount; i >= 1; i--) {
            executorService.execute(new Passenger(ticketCounter, 1));
        }

        executorService.shutdown(); // �ر��̳߳�
    }
}