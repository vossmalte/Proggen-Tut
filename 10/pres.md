# ÜB

## Rekursion - Kahoot

## ÜB 5 - Plenumsdiskussion

- Welche Klassen sollte es geben?
\pause
- Welche Vererbungshierachie ist sinnvoll?

## Vorrechnen

- Wer möchte vorrechnen?

## Tutorium = Deine Zeit

- Deine Zeit -- Deine Fragen
\pause
- Wie trennt man Logik und IO sinnvoll?
- Warum trennt man überhaupt?
- Warum kann ich nicht einfach alles in eine Klasse schreiben?
- Warum soll ich static vermeiden?

# Java API

## Bibliotheken

- Man muss nicht alles selber machen.
- Bibliotheken wie `java.util` bieten schon viel.
- Nachlesen, wofür was ist.

# SOLID

## Single Responsibility

- eine Klasse -- eine Aufgabe

## Open/Closed

- **open** for extension
- **closed** for modification

## Liskov Substitution

- wird in Java automatisch gemacht

## Interface Segregation

- Interfaces stellen Forderungen
- Möglichst wenige Forderungen stellen!

## Dependency Inversion

- nicht von Details abhängig sein, sondern von Abstraktionen
- ändert man Details, so sollte man das high-level Modul nicht ändern müssen

## mehr zu SOLID

<https://stackify.com/solid-design-principles/>

## Aufgaben

Was ist besser?

`class FootballTeam extends ArrayList<Player>{...}`

vs

~~~
class FootballTeam {
    List<Player> players = new ArrayList<Player>();
    ...
}
~~~

# Sortieren

## Arrays / Listen sortieren

\pause

- Bubblesort
- Mergesort
- ...
