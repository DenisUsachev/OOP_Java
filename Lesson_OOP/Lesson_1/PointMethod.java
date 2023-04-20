package Work_1;

public class PointMethod {
    //создаем метод distance
    static double distance(int x1, int y1, int x2, int y2){
        //возвращаем 
        return Math.sqrt(Math.pow(x2 - x1, y2) + Math.pow(y2 - y1, y2));
    }

    public static void main(String[] args) {
        //Создали двухмерную точку
        int ax = 0;
        int ay = 0;
        int bx = 0;
        int by = 1;
        //Печать точек
        System.out.println(distance(ax, ay, bx, by));
    }
}
