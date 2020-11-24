# Kontrollstrukturen

## Kontrollstrukturen - Allgemein

Was kontrollieren Kontrollstrukturen?
\pause
\hspace{2cm} Bedingungen
\pause

Was passiert nach der Kontrolle?
\pause
\hspace{2cm} Entscheiden, wie es weitergeht.

## Verzweigung

- Ver**zweig**ungen grafisch:

\pause

~~~{=latex}
\includegraphics[keepaspectratio,height=0.7\textheight]{03/if-flowchart}
~~~

## if-Anweisung

- führt Code aus, wenn eine Bedingung erfüllt ist
- `if-else`: entscheidet, welcher Code ausgeführt wird

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

## Verschachtelte Verzweigungen

~~~{=latex}
\includegraphics[keepaspectratio,height=0.9\textheight]{03/cascading-if-flowchart}
~~~

## switch-case

- switched je nach Wert zu einem Fall
- mögliche "Schalter" in Java: int, boolean, String, enum

::: {.columns}
:::: {.column width=50%}

~~~
switch(note) {
    case 1:
        System.out.println("sehr gut");
        break;
    case 2:
        System.out.println("gut");
        break;
    ...
}
~~~

::::

\pause

:::: {.column}

- ein `default`-Fall ist sinnvoll
- Fälle müssen _immer_ mit `break` verlassen werden

::::
:::

## Schleifen

- Schleifen wiederholen Code, wenn die Bedingung erfüllt ist
- die Bedingung wird bei jedem Durchlauf geprüft
\pause
- grafisch beispielsweise so:

~~~{=latex}
\includegraphics[keepaspectratio,height=0.5\textheight]{03/while-loop-flowchart}
~~~

## Schleifen in Java

::: {.columns}
:::: {.column width=33%}

- solange-mach

~~~
while(bed) {
    // do stuff
}
~~~

::::

\pause

:::: {.column width=33%}

- mach-solange

~~~
do {
    // do stuff
} while(bed);
~~~

::::

\pause

:::: {.column width=33%}

- Schrittschleife

~~~
for(int i = 0; i<42; i++) {
    // do stuff with i
}
~~~

::::
:::

## Aufgaben

Schreibe Code, der

- von zwei Zahlen die größere ausgibt
- alle Zahlen bis 30 ausgibt, die durch 5 oder 3 teilbar sind
- der die Zahlen von $k$ bis $l$ summiert
- die Fakultät $n!$ berechnet
- das kleine $1 \times 1$ ausgibt

Lösungen auf conceptboard posten: <https://app.conceptboard.com/board/drgb-ch1k-z4d7-zkcb-ftbs>

\pause

- den größten gemeinsamen Teiler von zwei Zahlen bestimmt
    - Euklidischer Algorithmus: $ggT(x,x)=x$
    - $a>b$: $ggT(a,b)=ggT(a-b,b)$

# IDE

## Eclipse

- Eclipse ist eine Entwicklungsumgebung (IDE)
- Eine IDE unterstützt beim Programmieren
- zeigt mögliche Fehler an
- bietet Autovervollständigung (`Strg + Leertaste`)
- organisiert Dateien / Klassen

\pause

- man darf auch eine andere IDE verwenden

## Wichtige Features

- neue Klasse
- Programm ausführen
- Kommandozeilenparameter

# OOP

## enum

- `enum` ist eine abgeschlossene Menge

\pause

::: {.columns}
:::: {.column width=20%}

~~~
enum Himmelsrichtung {
        Norden,
        Nordost,
        Osten,
        Suedost,
        Sueden,
        Suedwest,
        Westen,
        Nordwest
}
~~~

::::
:::: {.column}

- Im Osten geht die Sonne auf, im Süden ist ihr Mittagslauf, im Westen wird sie untergehen, im Norden ist sie nie zu sehen.
- Nutze `switch-case`, um zu einer Himmelsrichtung eine Uhrzeit auszugeben.

::::
:::

# Übungsblatt

## Informationen zum ÜB

- erstes Blatt im Praktomaten abgeben!

\pause

- zweites Blatt morgen verfügbar

\pause

- bei Fragen bitte das Forum aufsuchen

## Ende

~~~{=latex}
\includegraphics[keepaspectratio,height=1\textheight]{03/flowcharts_2x}
~~~
