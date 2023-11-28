package hw_8;

import java.util.Random;

//Надо проверить валидность билета каждого посетителя
//в случае валидности билета, в зависимости от сектора - вывести посетителю на экран текстовую подсказку
//как добраться до нужного сектора.
//Для проверки работоспособности вашего терминала - случайно сгенерируйте несколько билетом,
//последовательно обработайте каждый.
public class SelfCheckout {

    public static void main(String[] args) {
        Ticket[] tickets = generateTickets();
        for (Ticket ticket: tickets){
            if(ticket.isTicketValid()){
                switch (ticket.sector){
                    case A1, A2:
                        System.out.println("Здравствуйте, сохраняйте билет до конца матча");
                        System.out.println("Ваш сектор " + ticket.sector.getName());
                        break;
                    case A3, B1, B2, B3:
                        System.out.println("Здравствуйте, хорошего матча");
                        System.out.println("Ваш сектор " + ticket.sector.getName());
                        break;
                    case VIP:
                        System.out.println("Здравствуйте " + ticket.owner + " хорошего матча");
                        System.out.println("Ваш сектор " + ticket.sector.getName());
                        break;
                }
            }
            else {
                System.out.println("проблема с билетом");
            }
        }
    }

    public static Ticket[] generateTickets(){
        Random random = new Random();
        String[] fio = new String[] {"Alice", "Alex", "Kevin", "Marko", "Polo"};
        Ticket[] tickets = new Ticket[6];
        for (int i = 0; i<5; i++){
            tickets[i] = new Ticket(fio[i], i, Sector.getRandomSector(), random.nextInt(100));
            // здесь можно поставить в последнем параметре 300 и тогда рандомно будут вылетать проблемы с билетом
        }
        // это негативная проверка, чтобы всегда была проблема с билетом
        tickets[5] = new Ticket("Chris", -1, Sector.getRandomSector(), -4);
        return tickets;
    }
}
