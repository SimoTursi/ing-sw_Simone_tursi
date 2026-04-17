# Ingegneria del Software — Design Patterns (Java 21)

Progetto educativo che dimostra i pattern di progettazione **Gang of Four** per il corso di Ingegneria del Software.

## Pattern implementati

### Chain of Responsibility (`src/chain_of_responsability/esercizio/`)
Sistema di escalation ticket di supporto tecnico.

- `Handler` — interfaccia base della catena
- `AbstractHandler` — implementazione comune
- `Bot` — gestisce ticket di livello ≤ 1
- `Operatore` — gestisce ticket di livello ≤ 2
- `Tecnico` — gestisce ticket di livello ≤ 3
- `TeamSviluppo` — gestisce tutti i ticket rimanenti

Entry point: `TestSuppTecLivelli`

### Mediator (`src/proxy/esempio/`)
Form Swing dove un `ConcreteMediator` coordina i componenti grafici. Il pulsante "Salva" si abilita solo quando i campi Nome e Cognome sono entrambi compilati.

Entry point: `TestMediator`

## Compilazione ed esecuzione

```bash
# Compilazione
javac -d out src/chain_of_responsability/esercizio/*.java src/chain_of_responsability/esercizio/figure/*.java
javac -d out src/proxy/esempio/*.java

# Esecuzione
java -cp out chain_of_responsability.esercizio.TestSuppTecLivelli
java -cp out proxy.esempio.TestMediator
```

## Requisiti

- Java 21
- IntelliJ IDEA (configurazione di progetto inclusa)
