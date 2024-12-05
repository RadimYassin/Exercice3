package Grammaire;


import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne à vérifier : ");
        String ch = scanner.nextLine();

        if (ch == null || ch.trim().isEmpty()) {
            System.out.println("La chaîne ne peut pas être vide");
            return;
        }

        TokenManager tm = new TokenManager(ch);
        Parseur parseur = new Parseur(tm);

        try {
            parseur.parse();
            System.out.println(ch + ": est Valide");
        } catch (RuntimeException exp) {
            System.out.println(ch + ": n'est pas Valide");
            System.out.println("Erreur : " + exp.getMessage());
        } finally {
            scanner.close();
        }
    }
}
