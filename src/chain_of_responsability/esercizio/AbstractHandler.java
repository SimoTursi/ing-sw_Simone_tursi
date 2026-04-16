package chain_of_responsability.esercizio;

public abstract class AbstractHandler implements Handler{
    private Handler next;

    @Override
    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public boolean handle(Ticket t){
        if (next != null) return next.handle(t);
        return false;
    }

}
