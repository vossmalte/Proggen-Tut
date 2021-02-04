# Folien fürs Tut

## Folien erzeugen

mit Pandoc erstellen:

`pandoc -t beamer --slide-level 2 --listings 00/pres.md -o main.tex`

Dies erzeugt die `main.tex` mit den Inhalten aus Tutorium 00.
Diese ist in `presentation.tex` eingebunden.

Die Folien mit Titelfolie lassen sich nun mit `pdflatex presentation.tex` erzeugen.
