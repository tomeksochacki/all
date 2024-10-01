package examples;

public class Kangur {
private int nrKangura;

    public Kangur(int nrKangura) {
        this.nrKangura = nrKangura;
    }

    public void skok(){
        System.out.println(nrKangura);
        System.out.println("Wykonuje podskoki");
    }

    public int getNrKangura() {
        return nrKangura;
    }
}
