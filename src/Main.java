import java.util.Scanner;
    public class Main {
        public static void main (String[]args){
            Scanner in =new Scanner(System.in);
            int scelta;
            String nome;
            do {
                System.out.println("\n--- Menu Squadra di Calcio ---");
                System.out.println("1. Aggiungi giocatore");
                System.out.println("2. Visualizza tutti i giocatori");
                System.out.println("3. Modifica dati di un giocatore");
                System.out.println("4. Cancella un giocatore");
                System.out.println("5. Visualizza giocatori con più di 5 goal");
                System.out.println("6. Visualizza nome del capitano");
                System.out.println("7. Assegna capitano casualmente");
                System.out.println("0. Esci");
                System.out.print("Scegli un'opzione: ");
                scelta = in.nextInt();
                in.nextLine();

                switch (scelta) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 0:
                        System.out.println("Uscita dal programma...");
                        break;
                    default:
                        System.out.println("Scelta non valida!");
                }
            } while (scelta != 0);

        }
    }
