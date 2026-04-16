package chain_of_responsability.esercizio;

import chain_of_responsability.esercizio.figure.Bot;
import chain_of_responsability.esercizio.figure.Operatore;
import chain_of_responsability.esercizio.figure.TeamSviluppo;
import chain_of_responsability.esercizio.figure.Tecnico;

public class TestSuppTecLivelli {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(123,"Guasto schermo", 3);
        Handler handler = new Bot();
        handler.setNext(new Operatore())
                .setNext(new Tecnico())
                .setNext(new TeamSviluppo());
        handler.handle(ticket);
    }
}