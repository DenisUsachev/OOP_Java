package Lesson_1.Task_1;

public class Program {
    /**
     *Стадия от расписанного - до того к чему стремлюсь
     *создаем метод distance
     *    */ 
    static double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2 - x1, y2) + Math.pow(y2 - y1, y2)); // Math.sqrt - возвращает квадратный корень из аргумента
        }                                                                 // Math.pow - возвращает значение x2- x-1  в степень y2 = by
  
    public static void main(String[] args) {
        //Создали двухмерную точку
        int ax = 0; // "a" по оси "x"
        int ay = 0; // "a" по оси "y"
        int bx = 0; // "b" по оси "x"
        int by = 1; // "b" по оси "y"
        //Печать точек
        System.out.println(distance(ax, ay, bx, by));
    }
        static double distance(Point2D a, Point2D b){
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
    

        // С помощью первого метода может просто положить точки в new Point2D
        Point2D a = new Point2D(0, 2);
          //Можем указывать с помощью второго метода  присвание
        a.x = 0;
        a.y = 0;
        System.out.println(a.toString());  //автоматам вызывается метод toString() - изменили его в конструкторе под себя(1)

        Point2D b = new Point2D(10);
        b.x = 10;
        b.y = 10;
        System.out.println(b.getInfo());  //выставили параметр, который выводит в консоль необходимый текст (2)
        
        /* 
        Для того, чтобы в консоль выводилось, то что нам надо мы можем:
        1. Явно метод toString настроить его под задачу (и не придётся тогда явно указывать метод toString)
        */
        
        Point2D a = new Point2D(0, 2);

        System.out.println(a.getX());
        System.out.println(a.getY());

        Point2D b = new Point2D(0);
        System.out.println(b);


        var dis = Point2D.distance(a,b);
        System.out.println(dis);
        
}