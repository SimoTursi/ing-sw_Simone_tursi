package chain_of_responsability.esercizio;

public interface Handler {
    Handler setNext(Handler next);
    boolean handle(Ticket ticket);
}
