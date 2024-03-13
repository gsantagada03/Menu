
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        PiattoSpeciale piattoSpeciale = new PiattoSpeciale();
        Scanner sc = new Scanner(System.in);
        String risposta;

        //inizializzazione del software
        do {
            System.out.println("Vuoi ordinare?");
            risposta = sc.nextLine();
            if (risposta.equals("si")) {
                String tipidiPane[] = piattoSpeciale.getIngredientePrivato();
                for (int i = 0; i < tipidiPane.length; i++) {
                    System.out.println(tipidiPane[i]);
                }
                System.out.println("scegli il tipo di pane: ");
                String sceltaIngredientePrivato = sc.nextLine();
                //verifica se il tipo di pane è presente nell'array
                for (int i = 0; i < tipidiPane.length; i++) {
                    if (sceltaIngredientePrivato.equals(tipidiPane[i])) {
                        System.out.println("Hai scelto : " + sceltaIngredientePrivato);
                        break;
                    } else if (tipidiPane.length-1 == i && !(tipidiPane[i].equals(sceltaIngredientePrivato))) {
                        System.out.println("devi scegliere tra i tipi di pane nell'elenco, riscegli");
                        sceltaIngredientePrivato = sc.nextLine();
                        i = -1;
                    }
                }
                System.out.println("scegli gli ingredienti a tuo piacimento : ");
                String sceltaIngredientePubblico = sc.nextLine();
                piattoSpeciale.ingredientiPubblici.add(sceltaIngredientePubblico);

                //calcolo prezzo ingrediente pubblico, privato ed infine quello totale, il quale verrà stampato
                piattoSpeciale.calcolaPrezzoIngredientiPubblici(sceltaIngredientePubblico);
                piattoSpeciale.calcolaPrezzoIngredientiPrivati(sceltaIngredientePrivato);
                double totale = piattoSpeciale.calcolaPrezzoTotale(sceltaIngredientePubblico, sceltaIngredientePrivato);
                System.out.println("il totale è " + totale);
            }
        } while (risposta.equals("si"));

        sc.close();
    }
}