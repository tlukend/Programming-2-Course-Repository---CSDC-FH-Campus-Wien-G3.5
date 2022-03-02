package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);

    String invalidInput = "INVALID_USER_INPUT_MESSAGE";
    String exitMessage = "EXIT_MESSAGE";

    //AppController.

    //die Menu Klasse ist für die Ausgabe des Konsolenmenüs, sowie die Usereingaben zuständig.
    // Wurden die Usereingaben validiert, werden diese an die entsprechenden AppController
    // Funktionen weitergegeben (dh. die konkrete Logik vom AppController wird aufgerufen).
    // Dementsprechend enthält die Klasse eine Membervariable von AppController.
    // Weiters zwei konstante Membervariablen für invalide Usereingaben
    // (INVALID_USER_INPUT_MESSAGE) und den Verabschiedungstext (EXIT_MESSAGE)
}