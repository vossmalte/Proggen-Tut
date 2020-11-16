# Teams

## Teams für ÜB

- viele Teams haben sich bereits gefunden
- hat jemand noch kein Team?

# OOP

## OOP: Aufgabe

Modelliere eine Video-Streaming-Plattform.

[//]: # create a start of a block
::: block

### Beachte

Nutzer müssen ein Geburtsdatum angeben, um ihr Alter zu verifizieren.
Filme haben ein Lizenzende, ab dem der Film nicht mehr verfügbar ist.
:::
-> join conceptboard <https://app.conceptboard.com/board/y4bd-g8c7-6k0k-d71b-nzz7>

\pause

### Wichtig

Das Datum wird eine eigene Klasse, die von Nutzer und Film verwendet wird.

# Datentypen

## Primitive Datentypen

- ganze Zahlen `int, byte, short, long`
- Text: `String`
- Kommazahlen: `double, float`
- Wahrheitswerte: `boolean`

## Ganzzahlen - Zahlenbereich

- `int` hat 32 bit \pause - besteht aus 32 mal `1` oder `0`
    - Wie viele Kombinationen aus `0` und `1` gibt es? \pause
    - $2^{32} = 2^{10} \cdot 2^{10} \cdot 2^{10} \cdot 4 \approx 4 \text{ Milliarden}$ \pause
    - erstes Bit als Vorzeichen \pause
    - Größte Zahl: $2^31$ \pause
    - 32 Bit Betriebssysteme können nur 4 Gigabyte RAM haben

# Operatoren

## Operatoren - Aufgabe

- Mit Operatoren kann man Daten verknüpfen: `1+2`
- `+,-,*,/`
\pause
- `==, <, >, >=, <=,`
\pause
- teste, welche Ergebnisse jeweils herauskommen:
    - `9/2`
    - `1 + 1/2`
    - `5 * 0.5`
    - `7 + "Hallo "`
    - `1 < "Welt"`
    - `0.1f == 0.1d`
    - `1 == "Welt"`
- testen, z.B. mit `System.out.println(1+2)`
- <https://app.conceptboard.com/board/8ed1-oak7-kpo9-6rz4-50ym>

## Logische Operatoren

- `&&`: und
- `||`: oder
- `^`: entweder oder
- `!`: nicht

## Aufgabe

Was ist das Ergebnis dieses Ausdrucks?

`!(a && !b) ^ ((c || !c) && (c && !a))`
mit `a = true`, `b = true`, und `c = false`

<https://app.conceptboard.com/board/ofns-9h4o-s5ni-s0ud-66s0>

# Kontrollstrukturen

## Kontrollstruktur

Was kontrollieren Kontrollstrukturen?
\pause
\hspace{2cm} Bedingungen
\pause

Was passiert nach der Kontrolle?
\pause
\hspace{2cm} Entscheiden, wie es weitergeht.

In Java:

~~~
// Kontrolliere Bedingung
if (teiler == 0) {
    // Weg A
    System.out.println("Man darf nicht durch 0 teilen!");
} else {
    // Weg B
    ergebnis = zahl / teiler;
}
~~~

## Aufgabe: if-else

::: {.columns}
:::: {.column}
Graph von $f(x)$

~~~{=latex}
\includegraphics[keepaspectratio,width=\textwidth]{02/graphKontroll.png}
~~~

::::
:::: {.column}

### In $y$ soll $f(x)$ gespeichert werden

~~~
double x = ...;  // some value
double y;   // save result here
// insert code here
System.out.println(y)
~~~

::::
:::

# 1. ÜB

## Übungsblatt - HowTo

- Aufgabenstellung genau lesen
- Organisatorische Hinweise beachten
- Nicht abschreiben (automatische Plagiatsprüfung)
- Richtlinien zur Gruppenarbeit beachten

Tipps:

- Rechtzeitig anfangen
- Mit Kommilitonen ideell / konzeptionell austauschen
- im Praktomaten testen

## 1. Übungsblatt

- Abgabe: 26.11. morgens früh
- teils Gruppen-, teils Einzelarbeit
