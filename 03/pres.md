# Kontrollstrukturen

## Kontrollstrukturen 

## Verzweigung

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

TODO: Flowcharts

## Schleifen in Java

::: {.columns}
:::: {.column width=33%}

- solange-mach

::::

\pause

:::: {.column}

- mach-solange

::::

\pause

:::: {.column}

- mach-solange

::::
:::


## Aufgaben

Schreibe Code, der 

- von zwei Zahlen die größere ausgibt
- alle Zahlen bis 30 ausgibt, die durch 5 oder 3 teilbar sind
- der die Zahlen von $k$ bis $l$ summiert
- die Fakultät $n!$ berechnet
- das kleine $1 \times 1$ ausgibt

\pause

- den größten gemeinsamen Teiler von zwei Zahlen bestimmt

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

TODO: Jahreszeiten

# Übungsblatt

## Informationen zum ÜB

- erstes Blatt im Praktomaten abgeben!

\pause

- zweites Blatt morgen verfügbar

\pause

- bei Fragen bitte das Forum aufsuchen

##


~~~{=latex}
\includegraphics[keepaspectratio,height=1\textheight]{03/flowcharts_2x}
~~~