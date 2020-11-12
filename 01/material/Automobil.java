class Automobil {
	// bitte Namen auf englisch schreiben.
	String farbe;
	Marke marke;
	float preis;
	int anzahlTueren;
	int anzahlRaeder;
	String antriebsart;
	// ps ist kein aussagekraefitger Name
	// mögliche Loesung: pferdestaerke
	// oder: Kommentar
	double ps;	// Pferdestaerke
	String modell;

	public static void main(String[] args) {
		Marke bmw = new Marke();
		bmw.name = "BMW";
		bmw.werkOrt = "Muenchen";
		
		Automobil a = new Automobil();
		a.farbe = "rot";
		a.preis = 10000;
		a.marke = bmw;

		System.out.println("Die Farbe ist " + a.farbe);
		System.out.println("Der Herstellungsort ist " + a.marke.werkOrt);
	}
	
}
