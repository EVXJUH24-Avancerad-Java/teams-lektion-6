---
author: Lektion 6
date: MMMM dd, YYYY
paging: "%d / %d"
---

# Teams lektion 6

Hej och välkommen!

## Agenda

1. Frågor och repetition
2. Quiz frågor om lambdas, streams och generics
3. Genomgång av övningar
4. Veckans koncept i todo-appen
5. Övningar och uppgifter med handledning
6. Snabb avstämning på inlämningsuppgift

---

# Fråga

Hur stora är mindre-medium stora commits?

# Svar

- 1-3 filer
- 5-40 rader kod

---

# Fråga

Skulle du kunna gå igenom igen när man ska använda abstraction?

# Svar

Generellt så är det svårt att svara på, men jag ska försöka.

Om vi pratar OOP abstraction, så är det så ofta som möjligt: 
- Kod som är mer än 5 rader lång kan brytas ut till en ny funktion
- Gör fält privata (abstraction + encapsulation)
- Använd interfaces för flexibilitet (får med abstraction automatiskt då)

Undvika det dock för simpla saker. Om man har en "Task" klass som endast har lite information och ingen logik så finns det ingen bra anledning till att göra den abstract eller att skapa ett interface.

Om vi pratar abstract, som i klasser och metoder, så är det svårt att svara på. Om en klass skall vara flexibel (som en Manager till exempel) så är det passande. Eller, om det skall finnas flera "varianter" som delar egenskaper, så är det också passande (e.g. animal -> cat, dog, wolf).

---

# Fråga

Måste man implementera reflection, streams, optionals osv i sin individuella uppgift för att få godkänt i kursen eller räcker det med inheritance, polymorphism, abstraction och encapsulation?

# Svar

Dessa koncept - reflection, streams, generics m.m - ingår endast i gruppuppgiften. För den individuella så implementeras de valfritt.

OOP (abstraction, encapsulation, inheritance & polymorphism) är det krav på.

---

# Fråga

Gör det nån skillnad om man avslutar ett program genom att lägga ändra på en boolean i en while-loop (ex: while (running) {...} och att avsluta programmet med 'system.exit"?

# Svar

Ja. En `System.exit` är en "brute-force" lösning. Ofta så vill man ha vad man kallar för "cleanup" kod, vilket är kod som körs vid slutet av ett program. Det kan exempelvis vara kod som sparar info till fil när programmet stoppas. Om man tvingar ett stop med `System.exit` så kan ingen "cleanup" kod köras.

Det kan vara värt att notera att detta inte spelar någon större roll i ett projekt man endast själv jobbar med. I kod som andra skall jobba med, som API:er exempelvis, så är det dock väldigt viktigt.

Det rekommenderas att ha en `while(running) {}` eller liknande, oavsett dock, då det generellt sätt är bättre (även om det kanske är mindre smidigt).

---

# Fråga

När ska vi gå igenom databas-introduktionen?

# Svar

Om vi får tid till det: den sista lektionen

---

# Lambda quiz

1. Vilka två större saker skiljer lambdas från vanliga metoder?
2. När måste man inte ha med `{}` i lambdas?
3. Hur skapar man en egen lambda-typ? 
4. Vad är en `Predicate<T>`?
5. Vad är en `Consumer<T>`?
6. Varför definieras inte typer i lambda parametrar (`(a, b) -> {}`)?

---

# Streams quiz

1. Hur kommer man åt en stream på en `List<T>`?
2. Vad gör metoden `filter`?
3. Vad gör metoden `map`?
4. Vad gör metoden `max`?
5. Vad kallas följande: `stream().filter().map().sort()`?

---

# Generics quiz

1. Vad/vilka saker kan man applicera generiska typer på?
2. Hur många generiska typer kan appliceras?
3. Vad är det mest använda namnet på en generisk typ?
4. Hur många generiska typer har `HashMap`?
5. Vad betyder det om man har `<X extends Y>`?
