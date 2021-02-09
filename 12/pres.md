# Testen

## Tests

- zeigen Fehler auf
- lassen sich leicht wiederholen
- erhöhen die Qualität immens

\pause

- JUnit ist in Eclipse integriert

## JUnit - Kahoot

- Kahoot!

## JUnit

- testet Module und Klassen
- private Methoden lassen sich nicht testen (schwer)
- private Methoden sollen als Details auch nicht getestet werden
- wenn man denkt, dass man private Methoden testen sollte,
  dann haben sie so viel Verantwortung, dass sie eine eigene Klasse verdienen

## JUnit Annotationen

- '@Test' markiert einen Test
- '@BeforeClass' wird vor allen Tests in dieser Klasse durchgeführt (vgl '@AfterClass')
- '@Before' wird vor jedem einzelnen Test durchgeführt

## JUnit Assertions

- es gibt für quasi alles eine Assertion
- 'assertTrue()', 'assertEquals()', 'assertArrayEquals()'
- in Eclipse: tippe "assert" und autocomplete ('ctrl+space')

# Assertions

## Java Assertions

- können gut zum Debuggen verwendet werden
- werden mit 'java -ea Main' aktiviert (enable assertions)

# Methodik

## Bewertungsrichtlinien

- werden zur Verfügung gestellt

# ÜB

## Übung

- entwickle Tests für mein Programm
  - semantisch, syntaktisch
- wende die Bewertungsrichtlinien an
- behebe Bugs

- Public Test gibt es schon
