package chain_of_responsability.esercizio.figure;

import chain_of_responsability.esercizio.AbstractHandler;
import chain_of_responsability.esercizio.Ticket;

public class Tecnico extends AbstractHandler {
    @Override
    public boolean handle(Ticket t) {
        if(t.livello() == 3) {
            System.out.println("Gestito da Tecnico");
            return true;
        } else
            return super.handle(t);
    }
}
