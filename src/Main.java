import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
        static giocatore [] squadra;
        public static void main (String[]args){
            Scanner in =new Scanner(System.in);
            int scelta;
            int goal = 0;
            int indice = 0;
            int n;
            String visualizza="";
            String nome;
            boolean capitano;
            System.out.println("di quanti giocatori è compota la sqaudra?");
            n=in.nextInt();
            squadra = new giocatore[n];
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
        System.out.println("inserisci un nome per il giocatore");
            nome =in.nextLine();
            System.out.println("inserisci true se è capitano false se non lo è  ");
            capitano=in.nextBoolean();
            System.out.println("inserisci quanti goal ha segnato");
            goal = in.nextInt();
            aggiuntagiocatore(indice,nome,goal,capitano);
            indice++;
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
        public void aggiuntagiocatore(int indice,String nome,int goal,boolean capitano){
            squadra [indice] = new giocatore(capitano,goal,nome);

        }
        public String visualizza(int n,String visualizza){
            for (int i=0;i<n;i++){
                visualizza = visualizza + squadra[i].getNome();
            }
            return visualizza;
        }
    }
