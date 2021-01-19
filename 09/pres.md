# Rekursion

## Probleme rekursiv lösen

- Fibonacci: $F_{n+2} = F_{n+1} + F_n$ mit $F_0 = 0, F_1 = 1$

\pause

~~~
int fib(int n) {
    if (n < 2) {
        return n;
    } else {
        return fib(n-1) + fib(n-2);
    }
}
~~~

## Callstack

- rekursive Aufrufe landen auf einem Stapel
- `StackOverFlowError` wird ausgelöst, wenn der Stapel voll ist
\pause
- selber einen SOFE auslösen:

  ~~~
  int doSOFE(int n) {
      if (n == 0) {
          return 0;
      } else {
          return 1+doSOFE(1);
      }
  }
  ~~~

## Rekursion: Aufgaben

- Fakultät rekursiv berechnen: $n! = n*(n-1)!$
- größter gemeinsamer Teiler: $\text{ggT}(a,a)=a; \text{ggT}(a,b)=\text{ggT}(b-a,a);$

## Rekursiv vs. iterativ

- jedes iterative Problem ist rekursiv lösbar
- nicht jedes rekursive Problem lässt sich iterativ lösen
- wenn sich Iteration anbietet, ist das geschickter, weil es keinen aufwändigen Callstack gibt

# Generics

## Generische Datentypen

- `ArrayList` ist generisch, denn es ist eine Liste für alle Datentypen:
  - `ArrayList<Car>` ist eine Liste für Autos

## Generische Datentypen spezifizieren

- Für eine sortierte Liste müssen die Elemente vergleichbar sein:
  `class SortedList<T implements Comparable<T>>{...}`
- somit verfügt `T` auf jeden Fall über `compareTo(...)`

## Generics: Aufgaben

- Schreibe eine Klasse `Tupel`, die einen ersten und zweiten Eintrag hat $(A,B)$
- mögliche Methoden: `getFirst(), setSecond(...)`
  \pause
  `class Tupel<S,T>{...}`
  \pause
- weitere Ideen:
  - man kann den Tupel mit einem anderen addieren
  - wie baut man daraus schnell einen Dreiertupel?

# ÜB

## Übungsblatt 5

- Welche Elemente haben Gemeinsamkeiten?
- Welche Klassen sollte es geben?
\pause
- Eigene Testklasse schreiben

## Vorrechnen

Vorrechnen von Blatt 4
