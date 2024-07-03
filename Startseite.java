package CalorieCalc;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;

/**
 * Hauptklasse für den Kalorienrechner GUI.
 * Erlaubt es dem Benutzer, verschiedene Parameter einzugeben und den Kalorienbedarf zu berechnen.
 */

public class Startseite extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private CardLayout cardLayout;
    
    private JButton btnBerechnen;

    private JLabel lblKalorien, lblProteine, lblFette, lblKohlenhydrate;
     
    /**
     * Startet die Anwendung.
     */
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Startseite frame = new Startseite();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Erstellt das Hauptfenster der Anwendung.
     */
    public Startseite() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        
        setContentPane(contentPane);
        cardLayout = new CardLayout(0, 0); 
        contentPane.setLayout(cardLayout);

     // Erstellung der Panels für verschiedene Eingaben und Ergebnisse

        
        
        // Startseite panel
        JPanel startseitePanel = new JPanel();
        contentPane.add(startseitePanel, "Startseite");
        startseitePanel.setLayout(null);

        JLabel lblWillkommen = new JLabel("Willkommen beim Kalorienrechner!");
        lblWillkommen.setBounds(135, 39, 219, 16);
        startseitePanel.add(lblWillkommen);

        JLabel lblStarten = new JLabel("Bitte drücken Sie auf \"Starten\"");
        lblStarten.setBounds(141, 66, 194, 16);
        startseitePanel.add(lblStarten);

        JButton btnStarten = new JButton("Starten");
        btnStarten.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "Geschlecht");
            }
        });
        btnStarten.setBounds(156, 118, 117, 29);
        startseitePanel.add(btnStarten);

        // Geschlecht panel
        JPanel geschlechtPanel = new JPanel();
        contentPane.add(geschlechtPanel, "Geschlecht");
        geschlechtPanel.setLayout(null);

        JLabel lblGeschlecht = new JLabel("Bitte wählen Sie Ihr Geschlecht aus");
        lblGeschlecht.setBounds(123, 60, 240, 16);
        geschlechtPanel.add(lblGeschlecht);

        JCheckBox chckbxMännlich = new JCheckBox("Männlich");
        chckbxMännlich.setBounds(89, 109, 128, 23);
        geschlechtPanel.add(chckbxMännlich);

        JCheckBox chckbxWeiblich = new JCheckBox("Weiblich");
        chckbxWeiblich.setBounds(250, 109, 128, 23);
        geschlechtPanel.add(chckbxWeiblich);

        
     // Button-Aktionen
        JButton btnGeschlechtWeiter = new JButton("Weiter");
        btnGeschlechtWeiter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "Alter");
            }
        });
        btnGeschlechtWeiter.setBounds(147, 160, 117, 29);
        geschlechtPanel.add(btnGeschlechtWeiter);

        // Alter panel
        JPanel alterPanel = new JPanel();
        contentPane.add(alterPanel, "Alter");
        alterPanel.setLayout(null);

        JLabel lblAlter = new JLabel("Bitte geben Sie Ihr Alter an");
        lblAlter.setBounds(134, 42, 181, 16);
        alterPanel.add(lblAlter);

        JSpinner spinnerAlter = new JSpinner();
        spinnerAlter.setModel(new SpinnerNumberModel(18, 1, 100, 1));
        spinnerAlter.setBounds(102, 84, 189, 61);
        alterPanel.add(spinnerAlter);

        
     // Button-Aktionen
        JButton btnAlterWeiter = new JButton("Weiter");
        btnAlterWeiter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "Größe");
            }
        });
        btnAlterWeiter.setBounds(140, 182, 117, 29);
        alterPanel.add(btnAlterWeiter);

        // Größe panel
        JPanel größePanel = new JPanel();
        contentPane.add(größePanel, "Größe");
        größePanel.setLayout(null);

        JLabel lblGröße = new JLabel("Bitte geben Sie Ihre Größe in cm an");
        lblGröße.setBounds(122, 39, 225, 16);
        größePanel.add(lblGröße);

        
        JSpinner spinnerGröße = new JSpinner();
        spinnerGröße.setModel(new SpinnerNumberModel(160, 1, 250, 1));
        spinnerGröße.setBounds(135, 78, 144, 51);
        größePanel.add(spinnerGröße);

     // Button-Aktionen
        JButton btnGrößeWeiter = new JButton("Weiter");
        btnGrößeWeiter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "Gewicht");
            }
        });
        btnGrößeWeiter.setBounds(151, 162, 117, 29);
        größePanel.add(btnGrößeWeiter);

        // Gewicht panel
        JPanel gewichtPanel = new JPanel();
        contentPane.add(gewichtPanel, "Gewicht");
        gewichtPanel.setLayout(null);

        JLabel lblGewicht = new JLabel("Bitte geben Sie Ihr Gewicht in kg an");
        lblGewicht.setBounds(121, 51, 237, 16);
        gewichtPanel.add(lblGewicht);

        JSpinner spinnerGewicht = new JSpinner();
        spinnerGewicht.setModel(new SpinnerNumberModel(60, 1, 300, 1));
        spinnerGewicht.setBounds(154, 88, 103, 50);
        gewichtPanel.add(spinnerGewicht);

        
     // Button-Aktionen
        JButton btnGewichtWeiter = new JButton("Weiter");
        btnGewichtWeiter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "Muskelanteil");
            }
        });
        btnGewichtWeiter.setBounds(140, 164, 117, 29);
        gewichtPanel.add(btnGewichtWeiter);

        // Muskelanteil panel
        JPanel muskelanteilPanel = new JPanel();
        contentPane.add(muskelanteilPanel, "Muskelanteil");
        muskelanteilPanel.setLayout(null);

        JLabel lblMuskelanteil = new JLabel("Wie schätzen Sie Ihren Muskelanteil ein?");
        lblMuskelanteil.setBounds(104, 59, 271, 16);
        muskelanteilPanel.add(lblMuskelanteil);

        JComboBox<String> comboBoxMuskelanteil = new JComboBox<String>();
        comboBoxMuskelanteil.setModel(new DefaultComboBoxModel<String>(new String[] {
                "wenig muskulös", "leicht definiert/athletisch", "muskulös/sehr trainiert" }));
        comboBoxMuskelanteil.setBounds(102, 110, 213, 27);
        muskelanteilPanel.add(comboBoxMuskelanteil);

        
     // Button-Aktionen
        JButton btnMuskelanteilWeiter = new JButton("Weiter");
        btnMuskelanteilWeiter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "Schlafdauer");
            }
        });
        btnMuskelanteilWeiter.setBounds(148, 172, 117, 29);
        muskelanteilPanel.add(btnMuskelanteilWeiter);

        // Schlafdauer panel
        JPanel schlafdauerPanel = new JPanel();
        contentPane.add(schlafdauerPanel, "Schlafdauer");
        schlafdauerPanel.setLayout(null);

        JLabel lblSchlafdauer = new JLabel("Bitte geben Sie in Stunden an, wie viel Sie täglich schlafen");
        lblSchlafdauer.setBounds(69, 56, 333, 16);
        schlafdauerPanel.add(lblSchlafdauer);

        
        JSpinner spinnerSchlafdauer = new JSpinner(new SpinnerNumberModel(8.0, 0.0, 24.0, 0.5));
        spinnerSchlafdauer.setBounds(113, 83, 194, 54);
        schlafdauerPanel.add(spinnerSchlafdauer);

        
     // Button-Aktionen
        JButton btnSchlafdauerWeiter = new JButton("Weiter");
        btnSchlafdauerWeiter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "Aktivitätslevel");
            }
        });
        btnSchlafdauerWeiter.setBounds(151, 176, 117, 29);
        schlafdauerPanel.add(btnSchlafdauerWeiter);

        // Aktivitätslevel panel
        JPanel aktivitätslevelPanel = new JPanel();
        contentPane.add(aktivitätslevelPanel, "Aktivitätslevel");
        aktivitätslevelPanel.setLayout(null);

        JLabel lblAktivitätslevel = new JLabel("Bitte geben Sie Ihren täglichen Aktivitätslevel an");
        lblAktivitätslevel.setBounds(88, 46, 326, 16);
        aktivitätslevelPanel.add(lblAktivitätslevel);

        JComboBox<String> comboBoxAktivitätslevel = new JComboBox<String>();
        comboBoxAktivitätslevel.setModel(new DefaultComboBoxModel<String>(new String[] {
                "vorwiegend sitzend", "sitzend/stehend", "stehend gehend", "sehr aktiv" }));
        comboBoxAktivitätslevel.setBounds(92, 95, 222, 27);
        aktivitätslevelPanel.add(comboBoxAktivitätslevel);

        
     // Button-Aktionen
        JButton btnAktivitätslevelWeiter = new JButton("Weiter");
        btnAktivitätslevelWeiter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "Freizeit");
            }
        });
        btnAktivitätslevelWeiter.setBounds(148, 182, 117, 29);
        aktivitätslevelPanel.add(btnAktivitätslevelWeiter);

        // Freizeit panel
        JPanel freizeitPanel = new JPanel();
        contentPane.add(freizeitPanel, "Freizeit");
        freizeitPanel.setLayout(null);

        JLabel lblFreizeit = new JLabel("Wie aktiv sind Sie in Ihrer Freizeit?");
        lblFreizeit.setBounds(115, 45, 240, 16);
        freizeitPanel.add(lblFreizeit);

        JComboBox<String> comboBoxFreizeit = new JComboBox<String>();
        comboBoxFreizeit.setModel(new DefaultComboBoxModel<String>(new String[] {
                "kaum aktiv (z.B. Netflix)", "leicht aktiv (z.B. Hausarbeit)",
                "moderativ aktiv (z.B. Spaziergänge)", "sehr aktiv (z.B. Gartenarbeit)" }));
        comboBoxFreizeit.setBounds(89, 95, 222, 27);
        freizeitPanel.add(comboBoxFreizeit);

        
     // Button-Aktionen
        JButton btnFreizeitWeiter = new JButton("Weiter");
        btnFreizeitWeiter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "Sport");
            }
        });
        btnFreizeitWeiter.setBounds(146, 166, 117, 29);
        freizeitPanel.add(btnFreizeitWeiter);

        // Sport panel
        JPanel sportPanel = new JPanel();
        contentPane.add(sportPanel, "Sport");
        sportPanel.setLayout(null);

        JLabel lblSport = new JLabel("Wie viel Sport machen Sie wöchentlich in Stunden?");
        lblSport.setBounds(87, 48, 312, 16);
        sportPanel.add(lblSport);

        JSpinner spinnerSport = new JSpinner(new SpinnerNumberModel(1.0, 0.0, 10.0, 0.5));
        spinnerSport.setBounds(139, 75, 151, 54);
        sportPanel.add(spinnerSport);

        
     // Button-Aktionen
        JButton btnSportWeiter = new JButton("Weiter");
        btnSportWeiter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "Ziel");
            }
        });
        btnSportWeiter.setBounds(151, 164, 117, 29);
        sportPanel.add(btnSportWeiter);

        // Ziel panel
        JPanel zielPanel = new JPanel();
        contentPane.add(zielPanel, "Ziel");
        zielPanel.setLayout(null);

        JLabel lblZiel = new JLabel("Was ist Ihr Ziel?");
        lblZiel.setBounds(173, 51, 113, 16);
        zielPanel.add(lblZiel);

        JComboBox<String> comboBoxZiel = new JComboBox<String>();
        comboBoxZiel.setModel(new DefaultComboBoxModel<String>(new String[] {
                "schnell abnehmen", "langsam abnehmen", "Gewicht halten", "Muskeln aufbauen" }));
        comboBoxZiel.setBounds(124, 95, 178, 27);
        zielPanel.add(comboBoxZiel);

     // Button-Aktionen
        JButton btnZielWeiter = new JButton("Weiter");
        btnZielWeiter.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
                cardLayout.show(contentPane, "Ergebnis");
            }
        });
        
        btnZielWeiter.setBounds(156, 174, 117, 29);
        zielPanel.add(btnZielWeiter);

        // Ergebnis panel
        JPanel ergebnisPanel = new JPanel();
        contentPane.add(ergebnisPanel, "Ergebnis");
        ergebnisPanel.setLayout(null);

        JLabel lblErgebnis = new JLabel("Ihr Kalorienbedarf:");
        lblErgebnis.setBounds(37, 73, 235, 16);
        ergebnisPanel.add(lblErgebnis);

        lblKohlenhydrate = new JLabel("Kohlenhydrate:");
        lblKohlenhydrate.setBounds(37, 114, 235, 16);
        ergebnisPanel.add(lblKohlenhydrate);

        lblProteine = new JLabel("Proteine:");
        lblProteine.setBounds(37, 156, 235, 16);
        ergebnisPanel.add(lblProteine);

        lblFette = new JLabel("Fette:");
        lblFette.setBounds(37, 197, 235, 16);
        ergebnisPanel.add(lblFette);

        lblKalorien = new JLabel("");
        lblKalorien.setBounds(156, 73, 117, 16);
        ergebnisPanel.add(lblKalorien);

        
     // Button-Aktionen und Berechnung
        btnBerechnen = new JButton("Berechnen");
        btnBerechnen.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        
        	        int alter = (int) spinnerAlter.getValue();
        	        int größe = (int) spinnerGröße.getValue();
        	        int gewicht = (int) spinnerGewicht.getValue();
        	        double schlafdauer = ((Number) spinnerSchlafdauer.getValue()).doubleValue();
        	        double sportStunden = ((Number) spinnerSport.getValue()).doubleValue();
        	        String geschlecht = chckbxMännlich.isSelected() ? "männlich" : "weiblich";
        	        String muskelanteil = comboBoxMuskelanteil.getSelectedItem().toString();
        	        String aktivitätslevel = comboBoxAktivitätslevel.getSelectedItem().toString();
        	        String freizeitAktivität = comboBoxFreizeit.getSelectedItem().toString();
        	        String ziel = comboBoxZiel.getSelectedItem().toString();

        	        KalorienErgebnis ergebnis = KalorienBedarfBerechner.berechneKalorienbedarf(alter, größe, gewicht, geschlecht,
        	                muskelanteil, aktivitätslevel, freizeitAktivität, schlafdauer, sportStunden, ziel);

        	        lblKalorien.setText(String.format("%.2f kcal", ergebnis.getKalorienbedarf()));
        	        lblProteine.setText(String.format("Proteine: %.2f g", ergebnis.getProteine()));
        	        lblFette.setText(String.format("Fette: %.2f g", ergebnis.getFette()));
        	        lblKohlenhydrate.setText(String.format("Kohlenhydrate: %.2f g", ergebnis.getKohlenhydrate()));
        	    }
        	});

        btnBerechnen.setBounds(298, 122, 117, 29);
        ergebnisPanel.add(btnBerechnen);
        
        
        
        
        
    	}
        
    }
        
    

