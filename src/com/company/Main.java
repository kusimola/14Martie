package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean continuareIntrebare= true;
        List <String> nume = new ArrayList<>();
        List <Double> salariu = new ArrayList<>();

        while (continuareIntrebare == true) {
            System.out.println("Introdu numele");
            Scanner numeScan = new Scanner(System.in);
            String numeSalariat = numeScan.nextLine();
            nume.add(numeSalariat);

            System.out.println("Introdu salariul");
            Scanner salariuScan = new Scanner(System.in);
            Double salariuSalariat = salariuScan.nextLine();
            salariu.add(salariuSalariat);

            System.out.println("Doresti sa mai introduci alt nume? true/false");
            Scanner continuareScan = new Scanner(System.in);
            continuareIntrebare = continuareScan.nextBoolean();
        }

        System.out.println("Salariatii sunt: " + nume);
        System.out.println("Salariile sunt: " + salariu);


        double salariuMediuFormula = salariu.get();
        double salariuMediu = salariuMediuFormula;
        String salariuMediuNume = "";
        for(int i = 0; i<salariu.size(); i ++ ) {
            if ()
        }








    }
}
