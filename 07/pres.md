# Vorrechnen

## Kahoot

<https://kahoot.it>

## Vorrechnen ÜB 2

- A -- Musik
- B -- IBAN
- C -- Magische Quadrate

# Vererbung

## `extends`

Oft gibt es Klassen, die sehr ähnlich sind, sich aber in Details unterscheiden.
\pause

::: {.columns}
:::: {.column width=50%}

~~~
class Student {
    String subject;
    String name;
    public String toString() {
        return this.name;
    }
}
~~~

::::
\pause
:::: {.column}

~~~
class Professor extends Student {
    // subject from Student
    // name from Student
    public String toString() {
        return "Prof.Dr. " + this.name;
    }
}
~~~

::::
:::

## `Object` als Eltern aller Klassen

- implizit erbt man von Object, wenn man von nichts anderem erbt
\pause
- dabei erbt man `toString()`,`equals()` und `hashCode()`
\pause
- `toString()` implementieren bewirkt, dass die Methode von oben überschrieben wird

# Override und Co

## Kahoot 2

Kahoot :)

## Override

- Überschreibt man eine Methode, so markiert man diese mit `@Override`

~~~
Class A {
    @Override
    public String toString() {
        return "A";
    }
}
~~~

## Overload

- Beim Überladen von Methoden ändert man die Parameter

~~~
class Student {
    String subject;
    String name;
    public String toString() {
        return this.name;
    }
    public String greet() {return "Hello";}
    public String greet(Student other) {
        return "Hi " + other;
    }
    public String greet(Professor other) {
        return "Sehr geehrte " + other;
    }
}
~~~

## `instanceof` und Polymorphie

- `student instanceof Object` $\Rightarrow$ `true`
\pause
- `malte instanceof Professor` $\Rightarrow$ `false`
\pause
- **ACHTUNG!** `instanceof` nicht verwenden! Für Typunterscheidung immer Polymorphie verwenden!
\pause
- Poly*morphie*: Professor:innen sind hier Student:innen, die aber eine andere *Gestalt* haben
- Sie verhalten sich anders, können aber wie Student:innen behandelt werden: `Student s = new Professor();`

## `extends` als erweitern

- bis jetzt: Viel Polymorphie (also Änderung von Verhalten)
- erweitern: Professor:innen verdienen Geld: `int getMoney()`

## Aufgaben

- lass die Professor:in alle anderen Menschen gleich begrüßen
- implementiere selbst eine Liste, die Studenten verwaltet
- nutze `enum`, um eine Kommandozeileninteraktion umzusetzen

# Übungsblatt 3

## ÜB 3

Fragen?
