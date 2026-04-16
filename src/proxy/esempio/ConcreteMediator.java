package proxy.esempio;

import javax.swing.*;
import java.text.MessageFormat;

public class ConcreteMediator implements Mediator{
    private JTextField nome;
    private JTextField cognome;
    private JButton save;


    public void setNome(JTextField nome){
        this.nome = nome;
    }
    public void setCognome(JTextField cognome){
        this.cognome = cognome;
    }
    public void setSave(JButton save){
        this.save = save;
    }


    @Override
    public void notify(JComponent widget) {
        if (widget == nome || widget == cognome){
            if(!nome.getText().isBlank() && !cognome.getText().isBlank())
                save.setEnabled(true);
            else
                save.setEnabled(false);
        }
        else if (widget == save){
            String msg = MessageFormat.format(
                    "Nome: {0} \nCognome: {1}", nome.getText(),cognome.getText()
            );
            JOptionPane.showMessageDialog(null, msg);

        }
    }
}
