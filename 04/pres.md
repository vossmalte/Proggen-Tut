# Kontrollstrukturen

## Wiederholung

Kahoot!

# Code

## Regeln für Programmieren

- Code auf Englisch
- Benennung
    - Variablen klein: `int result;`
    - Klassen Groß: `class CarFactory{}`
    - Konstanten GROSS: `static final double EULERS_NUMBER = 2.78;`
    - Methoden klein: `void startGame(){}`
- Checkstyle prüft automatisch die Einhaltung automatisch

## Checkstyle

- Checkstyle in Eclipse verwenden
- Automatisch Formatierung nutzen

# Methoden

## Methoden als Funktionen

~~~
static double convertToFahrenheit(double celsius) {
    double fahrenheit = celsius * 1.8 + 32.0;
    return fahrenheit; 
}
~~~

- Signatur: der Name und die Parameter\newline
   hier: `convertToFahrenheit(double)`
    - es kann nur eine Methode mit dieser Signatur geben
- Rückgabetyp: `double`
    - `return` gibt den Wert zurück
    - es kann auch Methoden geben, die nichts zurückgeben (`void`)

## Methoden als Fähigkeiten

~~~
void einzahlen(int geld) {
    this.kontostand += geld;
}
~~~

## static

- `static` bedeutet, dass diese Methode zur Klasse gehört
- auch Attribute können entweder zur Klasse oder zum Objekt gehören

\pause

- Utility-Klassen bestehen nur aus statischen Attributen und Methoden

## Methoden: Aufgaben

Schreibe eine Methode, die...

- die Funktion $f(x)=2x+3$ auswertet
- die Funktion $g(x,y)=x^2 + 2y^2 - 3y$ auswertet
- die Fakultät einer Zahl berechnet
- den Sinus berechnet:         $sin(x)=\sum_{n=0}^\infty (-1)^n \frac{x^{2n+1}}{(2n+1)!}$
- Bonus: prüft, ob eine Zahl prim ist (alle kleineren Zahlen testen)

<https://app.conceptboard.com/board/m9be-y474-050a-6ysf-t725>


# Konstruktoren

## Objekte erschaffen

- das Schlagwort für Konstruktoren ist `new`
- `new Car()` erzeugt ein neues Objekt vom Typ Car
\pause
- Konstruktor anpassen: \newline
  `Car() {this.ps = 300;}`

## Utility-Klassen

- sind rein statisch
- können nicht instanziiert werden
\pause
- Konstruktor verbieten: `private Utility() {}`

## Konstruktor parametrisieren

~~~
Auto(String marke, Motor m) {
    this.marke = marke;
    motor = m;
}
~~~

## Konstruktoren: Aufgaben

Erweitere die Klasse Auto um...

- einen Konstruktor, der jedem Auto eine Seriennummer zuweist.
- einen Standardkonstruktor, der ein generisches Auto erzeugt.

<https://app.conceptboard.com/board/nzcn-xay1-7kug-u895-a1ms>

# Abschluss

## OOP: Aufgabe

Modelliere und implementiere das Szenario:

- Personen haben ein Girokonto
- Ein Konto gehört zu einer Bank
- Die Bank vergibt Kontonummern
- Ein Konto kann ein- und auszahlen und die IBAN ausgeben

- 4 Personen haben 4 Konten bei zwei Banken

- Abgaben gerne per Mail, um Feedback zu erhalten!

## Übungsblätter

- Fragen zum neuen Übungsblatt?
- Korrektur des alten Blattes wird bald veröffentlicht
