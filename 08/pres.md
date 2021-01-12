# Interfaces

## Kahoot: Vererbung und Exceptions

Kahoot!

## Interface

- ähnlich zu Vererbung
- geben Unterklassen eine Struktur vor
- Unterklassen müssen die Methoden implementieren

## USB-Schnittstelle

::: {.columns}
:::: {.column width=50%}

~~~
interface USB {
    public void onConnect();
}
~~~

\pause

~~~
class USB_Stick implements USB {
    int size = 80000000; // Byte

    @Override
    public void onConnect(){
        // open files
        System.run("explorer.exe");
    }
}
~~~

::::
:::: {.column}

\pause

~~~
class Iphone implements USB {
    // every year
    private void slowDown() {
        this.processorSpeed *= 0.8;
    }

    @Override
    public void onConnect() {
        System.run("itunes.exe");
    }

}
~~~

::::
:::

# Exceptions

## Fehler

- Fehler passieren
- Fehler müssen behandelt werden
- Klassiker: `a=3;b=0; c=a/b`

## Werfen und Fangen

- Werfen: `throw new IllegalArgumentException("not possible");`
- fangen:

    ~~~
    try {
        riskyBusiness("404");
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
    ~~~

## Faulheiten

- spezifisch sein:
  - nicht `catch(Exception e)` um alles abzufangen
  - sondern wissen, welche Art von Fehler auftreten kann
\pause
- kleinschrittig sein
  - nicht:

    ~~~
        public static void main(String[] args) {
            try {
                // everything
            } catch(SomeException e) {
                // handle
            }
        }
    ~~~

  - sondern möglichst wenig im `try` aufrufen

## Quatsch nicht zulassen

- `ArrayIndexOutOfBoundsException` nicht fangen, sondern vorher fragen `i < array.length`
- `ArithmeticException` ebenso verhindern

## Sinnvolle Exceptions

- siehe ÜB: IO und Logik sollten getrennt werden
- in einer IO weiß nicht, was Logik alles kann, gibt also einfach alles weiter
- Logik beschwert sich mit passenden Exceptions über Fehleingaben

## Kahoot: Exceptions

Kahoot!

# ÜB

## 3. ÜB

- ein paar haben schon 50 Punkte erreicht!
- achtet auf Trennung von IO und Logik
- achtet auf OOP-Modellierung (_wichtig!!_)
- sinnvolle Bezeichner wählen
- JavaDoc schreiben
- CheckStyle beachten

## 4. ÜB

- Fragen?
- Hinweis: Ein- und Ausgabe exakt prüfen
- Ausblick Abschlussaufgaben: Methodik wird immer wichtiger

## 5. ÜB

- Auftrag bis zum nächsten Tutorium: Modellieren, um mögliche Schwierigkeiten zu besprechen

## Übungsschein

- Bitte im Campus Management System anmelden!

## Übungsaufgabe: Doppelt verkettete Liste

- die Liste weiß, welches das erste und das letzte Element ist
- ein Element kennt seinen Vorgänger und Nachfolger
- mögliche Methoden: `insert, size, contains, insertAt`

## Vorrechnen

Vorrechnen
