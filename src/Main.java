import java.sql.SQLOutput;
import java.util.Scanner;

// controlli per bound values nelle statistiche

public class Main {
    public static void main(String[] args) {

        char c = '.';

        while (c != 'e' && c != 'E') {

            System.out.println("\n-----BENVENUTO NEL MENU ARSENALE-----");
            System.out.println("X - Per creare un nuovo arsenale");
            System.out.println("Altro - Per uscire dal menu");
            System.out.print("Scelta: ");

            Scanner in = new Scanner(System.in);
            String scelta = in.next();

            if (scelta.equalsIgnoreCase("x")) {
                Inventario inventario = new Inventario();
                System.out.println("\nArsenale creato correttamente. Cosa vuoi fare?");

                char c2 = '.';

                do {
                    System.out.println("\nA - Aggiungi un arma");
                    System.out.println("B - Rimuovi un arma");
                    System.out.println("C - Mostra grafico statistiche");
                    System.out.println("D - Accedi ad un arma");
                    System.out.println(("E - Torna al menu arsenale"));
                    System.out.print("Scelta: ");

                    String input = in.next();
                    char cinput = input.charAt(0);

                    switch (cinput) {
                        case 'A':
                        case 'a':
                            Arma arma = new Arma();
                            arma.setup();
                            inventario.aggiungiArma(arma);
                            break;
                        case 'B':
                        case 'b':
                            inventario.rimuoviArma();
                            break;
                        case 'C':
                        case 'c':
                            inventario.plotAvg();
                            break;
                        case 'D':
                        case 'd':
                            if (inventario.getDimensione() == 0) {
                                System.out.println("Non ci sono armi nell'arsenale.\n");
                                break;
                            }
                            System.out.print("\nA quale arma vuoi accedere? (inserisci il nome): ");
                            in.nextLine();
                            String nome = in.nextLine();
                            Arma alias = inventario.cercaArma(nome);
                            System.out.println("Cosa vuoi fare con questa arma?");
                            System.out.println("C - Cambia una statistica");
                            System.out.println("D - Visualizza una statistica");
                            System.out.println("Altro - Per uscire");
                            System.out.print("Scelta: ");

                            String input2 = in.next();
                            char cinput2 = input2.charAt(0);

                            switch (cinput2) {
                                case 'C':
                                case 'c':
                                    alias.changeInfo();
                                    break;
                                case 'D':
                                case 'd':
                                    alias.getInfo();
                                default:
                                    break;
                            }

                            break;
                        case 'E':
                        case 'e':
                            break;
                        default:
                            System.out.println("Carattere non valido.");
                    }

                    System.out.println("B - Per continuare a gestire le armi dell'arsenale");
                    System.out.println("Altro - Per tornare al menu arsenale ");
                    System.out.print("Scelta: ");
                    String input3 = in.next();
                    c2 = input3.charAt(0);


                }while (c2 == 'B' || c2 == 'b');

            } else {
                System.out.println("Arrivederci");
                return;
            }

        };
    }
}
