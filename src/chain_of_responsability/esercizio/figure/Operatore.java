package chain_of_responsability.esercizio.figure;

import chain_of_responsability.esercizio.AbstractHandler;
import chain_of_responsability.esercizio.Ticket;

public class Operatore extends AbstractHandler {
    @Override
    public boolean handle(Ticket t) {
        if(t.livello() == 2) {
            System.out.println("Gestito da Operatore");
            return true;
        } else
            return super.handle(t);
    }
}
