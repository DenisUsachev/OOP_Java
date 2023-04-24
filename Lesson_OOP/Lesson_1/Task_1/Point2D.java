package Lesson_1.Task_1;
/** как это делается  */

public class Point2D {
    private int x, y;  //называется поле

    /**  Мы можем переиспользование ранее описанных конструкторов: */ 
    public Point2D(int valueX, int valueY) { //3. передает в x, y. 
        x = valueX;
        y = valueY;
    }

    /**
     * // 2.передаем в value где он подствляет наше значение
     * @param value
     */
     public Point2D(int value){ 
        this(value, value);
    }

    /**
     * // 1.берем значение
     */
    public Point2D(){ 
        this(0);
    }


//  ПЕРЕГРУЗКА КОНСТРУКТОРА ПОТОМУ ЧТО Point2D исполуется 3 раза (1)
     public Point2D(int valueX, int valueY) { 
        x = valueX;
        y = valueY;
    }

    public Point2D(){  //(2-ая перегрузка)
        x = y = 0;
    }

    public Point2D(int value){  //(3-тья перегрузка)
        x = value;
        y = value;
    }
  
    /**  доступ для чтения  */ 
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    /** доступ для записи  */ 
    public void setX(int value){
        this.x = value;
    }
    
    public void setY(int value){
        this.y = value;
    }

    /**
     * вывод в консоль, как можно сделать
     *  */ 
    public String getInfo(){ 
        return String.format("x: %d; y: %d", x, y);
    }


    /**
     * наилуший шаблон для правильного вывода в консоль
     *  */ 
    @Override // переопределяет поведение сделанное до нас разработчиками

    public String toString() { // переопределяем метод toString под тот который нужен
        return String.format("x: %d; y: %d", x, y); // %d - для int , %s - String
    }
}

