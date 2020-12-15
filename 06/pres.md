# Letztes ÜB

## Vorrechnen

- Webcam notwendig
- Authentifizierung notwendig
- Abgabe in Eclipse offen, Bildschirm teilen

## Übungsaufgaben

- Wer nicht vorrechnet, hört aufmerksam zu oder macht Übungsaufgaben
\pause
- Ein Fitnessstudio hat Geräte. Bei der Verwendung verschleißen die Geräte
    - Ausdauergeräte um 0.5% pro Minute
    - Kraftgeräte um 3% pro Verwendung
- Verschlissene Geräte müssen gewartet werden und können nicht zum Training genutzt werden
- Bei Kraftgeräten kann das Gewicht eingestellt werden
- <https://app.conceptboard.com/board/k1qx-abt3-mdmo-a1rx-p30q>

# Konvertierung

## Typumwandlung 1

### Typumwandlung für primitive Datentypen

~~~
double d = 123.7;
int i = (int) d;
System.out.println(i);
~~~

\pause
$\Rightarrow$ `123`

## Typumwandlung 2

### Typumwandlung für Klassen

~~~
Car myCar = new Car();
Object o = (Object) myCar;
~~~

\pause

- Dabei geht der Zugriff auf member des Objektes (z.B. horsepower) verloren
- Nach Object kann man immer konvertieren
- `System.out.println` nutzt das aus: `toString()`

## Typumwandlung: Aufgaben

~~~
Car myCar = new Car();
Object o = (Object) myCar;
Car yourCar = (Car) o;
Car herCar = (Car) (new Object());
System.out.println(o);

byte b = (byte) 128;
char c = (char) 65;
~~~

# Datenkapselung

## Daten verwalten

- Klassen sind die Hüter ihrer Daten (member) \pause
- Klassen können den Zugriff gewähren oder verweigern \pause
- Verweigern: `private`
- Gewähren: `public`  \pause
- Faustregel: So viel `private` wie möglich, so viel `public` wie nötig

## Zugriff verwalten: Getter & Setter

- Faustregel: **alle** Attribute einer Klasse sind `private` \pause
- Falls Zugriff dennoch nötig, verwenden wir Getter und Setter

~~~
class Student {
    private int ects;
    public int getEcts() {return this.ects;}
    private void setEcts(int e) {this.ects = e;}
    public void incrementEcts(int new) {
        if (new < 1) System.out.println("Man darf keine Punkte abziehen.");
        else this.ects += new;
    }
}
~~~

# Listen

## Abstrakte Datenstrukturen

- Nachteil Arrays: fixe Größe \pause
- Idee: Eine Liste, die man immer erweitern kann \pause
- Umsetzung:
  - Start: Zeigt auf das erste Element der Liste (das Element ist sein Attribut) \pause
  - Element: Hat den Wert als Attribut und zeigt auf das nächste Element \pause
  - Ende: Das letzte Element zeigt auf nichts (`null`) \pause
- in Java: `java.util.ArrayList`
- Aufgabe: Implementiere selbst eine Liste \pause
  - einfügen, alle ausgeben, einfügen an Stelle, ...
