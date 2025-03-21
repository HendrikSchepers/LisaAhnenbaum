import java.util.Scanner;
public class Verwaltung {


    private Scanner scanner;

    public static void main(String[] args) {

        new Verwaltung();
        System.out.println("Herzlich willkommen zu Zeichenketten verschluesselerer!");

    }

    public Verwaltung() {
        scanner = new Scanner(System.in);

//
          Ahnenbaum Lisa=   new Ahnenbaum();
          System.out.println("preordertravison:");
            Lisa.searcW();
            System.out.println("inordertravison:");
            Lisa.searcI();
            System.out.println("postordertravison:");
            Lisa.searcp();



    }
}