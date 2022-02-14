package by.epam.jwd.less02;

public class Logic {

    public boolean task1(int x){
        return ((x / 1000) + (x / 100 % 10)) == ((x / 10 % 10) + (x % 10));
    }

    public boolean task2(int x, int y){
        return ((x<=2 && x>=-2) && (y<=4 && y>=0)) || ((x<=4 && x>=-4) && (y<=0 && y>=-3));
    }

    public int task3(int a, int b, int c){
        int min, max;

        max = Math.max(Math.max(a,b),c);
        min = Math.min(Math.min(a,b),c);

        return max + min;
    }
}
