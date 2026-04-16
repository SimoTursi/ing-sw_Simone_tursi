package chain_of_responsability.esercizio.figure;

import chain_of_responsability.esercizio.AbstractHandler;
import chain_of_responsability.esercizio.Ticket;

public class TeamSviluppo  extends AbstractHandler {
    @Override
    public boolean handle(Ticket t) {
        if(t.livello() == 4) {
            System.out.println("Gestito da Team di Sviluppo");
            return true;
        } else
            return super.handle(t);
    }
}
