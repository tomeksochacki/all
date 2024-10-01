package examples;

public class Punkt {

    int a = 10;
    int b = 11;

    public int increase(int x) {
        x = x + 1;
        return x;
    }

    public int changeValueA(int x){
        return x = a + x;
    }

    public int changeValueB(int x){
        return x = b + x;
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public void printValueA(){
        System.out.println(a);
    }

    public void printValueB(){
        System.out.println(b);
    }

    ;

}
