package CalorieCalc;

/**
 * Diese Klasse repräsentiert die Ergebnisse der Kalorienberechnung, einschließlich Kalorienbedarf,
 * Proteine, Fette und Kohlenhydrate.
 */

public class KalorienErgebnis {
    private double kalorienbedarf;
    private double proteine;
    private double fette;
    private double kohlenhydrate;

    /**
     * Konstruktor zur Initialisierung eines KalorienErgebnis-Objekts.
     * 
     * @param kalorienbedarf der berechnete Kalorienbedarf
     * @param proteine die berechnete Menge an Proteinen in Gramm
     * @param fette die berechnete Menge an Fetten in Gramm
     * @param kohlenhydrate die berechnete Menge an Kohlenhydraten in Gramm
     */
    
    public KalorienErgebnis(double kalorienbedarf, double proteine, double fette, double kohlenhydrate) {
        this.kalorienbedarf = kalorienbedarf;
        this.proteine = proteine;
        this.fette = fette;
        this.kohlenhydrate = kohlenhydrate;
    }

    /**
     * Gibt den berechneten Kalorienbedarf zurück.
     * 
     * @return der Kalorienbedarf in kcal
     */
    
    public double getKalorienbedarf() {
        return kalorienbedarf;
    }

    /**
     * Gibt die berechnete Menge an Proteinen zurück.
     * 
     * @return die Menge an Proteinen in Gramm
     */
    
    public double getProteine() {
        return proteine;
    }

    /**
     * Gibt die berechnete Menge an Fetten zurück.
     * 
     * @return die Menge an Fetten in Gramm
     */
    
    public double getFette() {
        return fette;
    }

    /**
     * Gibt die berechnete Menge an Kohlenhydraten zurück.
     * 
     * @return die Menge an Kohlenhydraten in Gramm
     */
    
    public double getKohlenhydrate() {
        return kohlenhydrate;
    }
}

