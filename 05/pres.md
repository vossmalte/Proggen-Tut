# Wiederholung

## Kahoot

<https://kahoot.it>

# ÜB

## Blatt 1

- lief sehr gut
- Gruppenarbeiten waren gut
- weiter so $\ddot\smile$
- Fragen zur Korrektur gerne per Mail

## Blatt 2

- Gibt es Fragen?
- Abgabe: 10.12.2020, 06:00 Uhr
- Bearbeitungshinweise beachten, insbesondere Checkstyle
- Programme testen

## Vorrechnen

- Ab nächster Woche: Vorrechnen
- Genaue Informationen siehe ILIAS
- Vorrechnen ist eine Alternative zur Präsenzübung

# Arrays

## Mengen

- Oft betrachtet man nicht nur ein einzelnes Element\newline sondern eine ganze Menge an Elementen
- In Java: Arrays

\pause

~~~
int[] squares = {1,4,9,16};         // direkte Definition

int[] xtimesx = new int[11];        // leere Initialisierung 
for (int i = 0; i < xtimesx.length; i++) {
    xtimesx[i] = i*i;               // Element schreiben
}

System.out.println(xtimesx[4]);     // Element lesen
~~~

## Arrays: Indizes

Welche Werte stehen nach der Ausführung im `array`?

~~~
int[] array = new int[10];
array[0] = 1
for (int i = 1; i < array.length; i++) {
    array[i] = array[i-1] + 2*i + 1;
}
~~~

\pause

Lösung: 1,4,9,16,...

## Arrays: Aufgaben

Schreibe eine Funktion, die...

- die ersten $n$ Fibonacci-Zahlen zurück gibt: $0,1,1,2,3,5,8,..$
- die Werte in einem Array aufsummiert
- die ungeraden Zahlen aus einem Array filtert

<https://app.conceptboard.com/board/gmh2-14yh-tq11-k59m-segz>

## Arrays: Details

- Arrays liegen in einem Block im Speicher
- Nutzen somit cache-ing für schnelle Ausführung
- sind in der Größe nicht veränderbar

## Arrays: Kahoot

<https://kahoot.it>

# Konstrukoren

## OOP: Aufgabe

Modelliere und implementiere das Szenario:

- Personen haben ein Girokonto
- Ein Konto gehört zu einer Bank
- Die Bank vergibt Kontonummern automatisch
- Die Bankleitzahl wird der Bank automatisch zugewiesen
- Ein Konto kann ein- und auszahlen und die "IBAN" ausgeben

- 4 Personen haben 4 Konten bei zwei Banken
