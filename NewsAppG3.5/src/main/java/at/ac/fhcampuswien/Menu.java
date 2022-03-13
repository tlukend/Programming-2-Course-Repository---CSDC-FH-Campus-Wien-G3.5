package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {
    //public class Menu extends AppController
private AppController controller;
    Scanner scan = new Scanner(System.in);
    private String invalidInput = "INVALID_USER_INPUT_MESSAGE";
    private String exitMessage = "EXIT_MESSAGE";
    String userInput;

    public boolean inputValidation() {
        //userInput = userInput.nextString();
        return true;
    }
public void start(){
    System.out.println("**********************");
    System.out.println("* Welcome to NewsApp *");
    System.out.println("***********************");
    System.out.println("Enter what you wanna do:");
    System.out.println("a: Get top headlines austria");
    System.out.println("b: Get all news about bitcoin");
    System.out.println("y: Count articles");
    System.out.println("q:Quite program");
    while (true){
        String select=scan.next();
        switch(select){
            case "q":
                System.out.println("Bey bey!");
                System.exit(0);
        }
    }

}

    //die Menu Klasse ist für die Ausgabe des Konsolenmenüs, sowie die Usereingaben zuständig.
    // Wurden die Usereingaben validiert, werden diese an die entsprechenden AppController
    // Funktionen weitergegeben (dh. die konkrete Logik vom AppController wird aufgerufen).
    // Dementsprechend enthält die Klasse eine Membervariable von AppController.
    // Weiters zwei konstante Membervariablen für invalide Usereingaben
    // (INVALID_USER_INPUT_MESSAGE) und den Verabschiedungstext (EXIT_MESSAGE)
}
