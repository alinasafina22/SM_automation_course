package hm_6;
//Опишите классы Самолет, Шаттл и НЛО. Проявите фантазию какие свойства и какое поведение можно описать
// для каждого класса. В каждом классе необходимо придумать и описать несколько нестатических методов (минимум 3) и
// несколько нестатических полей (минимум 6). Статические поля или методы добавляем по желанию.
// После этого - создайте класс ЛетающийАппарат, сделайте его родительским для всех трех классов,
// вынесите в родительский класс все общие поля и методы.
//После этого в отдельном классе создайте метод main, где создайте по экземпляру каждого из классов.
// После создания объектов - вручную проинициализируйте их поля и вызовите несколько методов.

abstract class FlyingMachine {
    public String name;
    public int maxPassangers;
    public int passengers;
    public int maxSpeed;
    public int maxHeight;
    // флаг говорит о том, пассажирское ли ЛУ
    public boolean isPassengers;
    public int speed;
    public int height;
    static int pilots = 2;
    public boolean isLand = false;


     public void takeOff(int height){
         String result;
         if (height + this.height <= maxHeight) {
             this.height = height;
             result = String.format("%s взлетел на высоту %s", name, height);
         }
         else {
             result= String.format("Ваша максимальная высота %s", maxHeight);
         }
         System.out.println(result);
     }
     // ЛА приземлился. Скрость и высота равна нулю
     public void landing(){
         speed = 0;
         height = 0;
         isLand = true;
         System.out.printf("%s приземлился%n", name);
     }
    // разгоняемся
     public void increaseSpeed(int speed){
         if (speed + this.speed <= maxSpeed){
             this.speed += speed;
         }
         else{
             System.out.printf("Вы не можете поднятся на высоту %s%n", speed);
         }
     }
     // получить статус устройства
     public void status(){
         if (isLand){
             System.out.println("Самолет приземлился");
             System.out.printf("Ваша высота %sм, ваша скорость %s, количество пассажиров %s, количество пилотов %s%n",
                     height, speed, passengers, pilots);
         }
         else{
             System.out.println("Самолет еще летит");
             System.out.printf("Ваша высота %sм, ваша скорость %s, количество пассажиров %s, количество пилотов %s%n",
                     height, speed, passengers, pilots);
         }
     }
    public void addPassengers(int countOfPassengers){
         if (isPassengers){
             if (countOfPassengers + passengers <= maxPassangers){
                 this.passengers += countOfPassengers;
             }
             else{
                 System.out.printf("Вы можете добавить только %s пассажиров%n", maxPassangers-passengers);
             }
         }
         else {
             System.out.println("Вы не можете добавить пассажиров в грузовой ЛА");
         }

    }
}
