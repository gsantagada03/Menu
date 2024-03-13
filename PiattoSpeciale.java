import java.util.ArrayList;

public class PiattoSpeciale {
    public double prezzoFisso = 1;
    double prezzoTotale;

    // ingredienti private
    private String[] ingredientiPrivati = { "pane bianco", "pane integrale", "pane di segale" };

    // prezzo specifico ingredienti privati
    public double[] prezzoIngredientiPrivati = new double[ingredientiPrivati.length];

    // Ingredienti pubblici
    public ArrayList<String> ingredientiPubblici = new ArrayList<>();

    // prezzo specifico ingredienti pubblici
    public ArrayList<Double> prezzoIngredientiPubblici = new ArrayList<>();

    
    // get e set e relative verifiche
    public String[] getIngredientePrivato() {
        return ingredientiPrivati;
    }

    // metodo per calcolare i prezzi degli ingredienti pubblici
    public void calcolaPrezzoIngredientiPubblici(String sceltaIngredientePubblico) {
        for (int i = 0; i < ingredientiPubblici.size(); i++) {
            if (ingredientiPubblici.get(i).equals(sceltaIngredientePubblico)) {
                prezzoIngredientiPubblici.add(3.00);
            }
        }
    }

    // metodo per calcolare i prezzi degli ingredienti privati
    public void calcolaPrezzoIngredientiPrivati(String sceltaIngredientePrivato) {
        for (int i = 0; i < ingredientiPrivati.length; i++) {
            if (ingredientiPrivati[i].equals(sceltaIngredientePrivato)) {
                if (ingredientiPrivati[i].equals(sceltaIngredientePrivato)) {
                    prezzoIngredientiPrivati[i] = 2.00;
                }
            }
        }
    }

    // Metodo calcola prezzo totale
    public double calcolaPrezzoTotale(String sceltaIngredientePubblico, String sceltaIngredientePrivato) {
        for (int i = 0; i < ingredientiPubblici.size(); i++) {
            if (ingredientiPubblici.get(i).equals(sceltaIngredientePubblico)) {
                prezzoTotale += prezzoIngredientiPubblici.get(i);
            }
        }

        for (int i = 0; i < ingredientiPrivati.length; i++) {
            if (ingredientiPrivati[i].equals(sceltaIngredientePrivato)) {
                prezzoTotale += prezzoIngredientiPrivati[i];
            }
        }
        return prezzoTotale += prezzoFisso;
    }
}