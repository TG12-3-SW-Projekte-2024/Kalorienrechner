package CalorieCalc;

/**
 * Diese Klasse enthält Methoden zur Berechnung des Kalorienbedarfs und der Makronährstoffe.
 */

public class KalorienBedarfBerechner {

	 /**
     * Berechnet den Kalorienbedarf basierend auf den gegebenen Parametern.
     * 
     * @param alter das Alter des Benutzers
     * @param größe die Körpergröße des Benutzers in cm
     * @param gewicht das Körpergewicht des Benutzers in kg
     * @param geschlecht das Geschlecht des Benutzers ("männlich" oder "weiblich")
     * @param muskelanteil die Einschätzung des Muskelanteils des Benutzers
     * @param aktivitätslevel das tägliche Aktivitätslevel des Benutzers
     * @param freizeitAktivität die Aktivität des Benutzers in der Freizeit
     * @param schlafdauer die durchschnittliche tägliche Schlafdauer des Benutzers in Stunden
     * @param sportStunden die wöchentliche Sportstunden des Benutzers
     * @param ziel das Ziel des Benutzers ("schnell abnehmen", "langsam abnehmen", "Gewicht halten", "Muskeln aufbauen")
     * @return ein KalorienErgebnis-Objekt mit berechnetem Kalorienbedarf, Proteinen, Fetten und Kohlenhydraten
     */
	
    public static KalorienErgebnis berechneKalorienbedarf(int alter, int größe, int gewicht, String geschlecht,
            String muskelanteil, String aktivitätslevel, String freizeitAktivität, double schlafdauer, double sportStunden,
            String ziel) {

        // Geschlecht prüfen und BMR berechnen
        double bmr;
        boolean isMale = geschlecht.equalsIgnoreCase("männlich");
        if (isMale) {
            bmr = 10 * gewicht + 6.25 * größe - 5 * alter + 5;
        } else {
            bmr = 10 * gewicht + 6.25 * größe - 5 * alter - 161;
        }

        // Aktivitätslevel berücksichtigen
        double activityFactor;
        switch (aktivitätslevel) {
            case "vorwiegend sitzend":
                activityFactor = 1.2;
                break;
            case "sitzend/stehend":
                activityFactor = 1.375;
                break;
            case "stehend gehend":
                activityFactor = 1.55;
                break;
            case "sehr aktiv":
                activityFactor = 1.725;
                break;
            default:
                activityFactor = 1.2;
        }

        // Kalorienbedarf berechnen
        double kalorienbedarf = bmr * activityFactor;

        // Proteine, Fette und Kohlenhydrate berechnen
        double proteine = berechneProteine(kalorienbedarf);
        double fette = berechneFette(kalorienbedarf);
        double kohlenhydrate = berechneKohlenhydrate(kalorienbedarf, proteine, fette);

        // KalorienErgebnis-Objekt erstellen und zurückgeben
        KalorienErgebnis ergebnis = new KalorienErgebnis(kalorienbedarf, proteine, fette, kohlenhydrate);
        return ergebnis;
    }

    /**
     * Berechnet die benötigte Menge an Proteinen basierend auf dem Kalorienbedarf.
     * 
     * @param kalorienbedarf der berechnete Gesamtkalorienbedarf
     * @return die benötigte Menge an Proteinen in Gramm
     */
    
    public static double berechneProteine(double kalorienbedarf) {
        return kalorienbedarf * 0.2 / 4;
    }

    /**
     * Berechnet die benötigte Menge an Fetten basierend auf dem Kalorienbedarf.
     * 
     * @param kalorienbedarf der berechnete Gesamtkalorienbedarf
     * @return die benötigte Menge an Fetten in Gramm
     */
    
    public static double berechneFette(double kalorienbedarf) {
        return kalorienbedarf * 0.3 / 9;
    }

    /**
     * Berechnet die benötigte Menge an Kohlenhydraten basierend auf dem Kalorienbedarf,
     * den Proteinen und den Fetten.
     * 
     * @param kalorienbedarf der berechnete Gesamtkalorienbedarf
     * @param proteine die benötigte Menge an Proteinen in Gramm
     * @param fette die benötigte Menge an Fetten in Gramm
     * @return die benötigte Menge an Kohlenhydraten in Gramm
     */
    
    public static double berechneKohlenhydrate(double kalorienbedarf, double proteine, double fette) {
        double proteinCalories = proteine * 4;
        double fatCalories = fette * 9;
        double remainingCalories = kalorienbedarf - proteinCalories - fatCalories;
        return remainingCalories / 4;
    }
}
