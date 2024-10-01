package examples;

public class Firma {
    public static void main(String[] args) {
        Pracownik[] pracownicy = new Pracownik[3];

        String[]names = {"Adam", "Marian", "Władysław"};
        String[]surnames = {"Trat", "Tratata", "Tratra"};
        int[]age = {34, 32, 31};

        for (int i = 0; i < pracownicy.length; i++) {
            pracownicy[i] = new Pracownik();
            pracownicy[i].setAge(age[i]);
            pracownicy[i].setName(names[i]);
            pracownicy[i].setSurname(surnames[i]);
            System.out.println(pracownicy[i].toString());
        }



        Pracownik pracownik1 = new Pracownik(34, "Tomasz", "Tomaszewski");
        Pracownik pracownik2 = new Pracownik(23, "Tomek", "Tomisławski");

        System.out.println("pracownik1: " + pracownik1.toString() + " \npracownik2: " + pracownik2.toString());
    }
}
