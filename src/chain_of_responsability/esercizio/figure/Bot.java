package chain_of_responsability.esercizio.figure;

import chain_of_responsability.esercizio.AbstractHandler;
import chain_of_responsability.esercizio.Ticket;


public class Bot extends AbstractHandler {
    @Override
    public boolean handle(Ticket t) {
        if(t.livello() <= 1) {
            System.out.println("Gestito da Bot Automatico");
            return true;
        } else
            return super.handle(t);
    }
}
