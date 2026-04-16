package proxy.esempio;

import javax.swing.*;
import java.awt.*;

public class TestMediator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JTextField nomeTextField = new JTextField(20);
        JTextField cognomeTextField = new JTextField(20);
        JTextField nicknameTextField = new JTextField(20);
        JButton salvaButton = new JButton("Salva");
        salvaButton.setEnabled(false);

        frame.add(new JLabel("Nome:"));
        frame.add(nomeTextField);
        frame.add(new JLabel("Cognome:"));
        frame.add(cognomeTextField);
        frame.add(salvaButton);

        ConcreteMediator mediator = new ConcreteMediator();
        mediator.setNome(nomeTextField);
        mediator.setCognome(cognomeTextField);
        mediator.setSave(salvaButton);

        nomeTextField.addActionListener( x -> mediator.notify(nomeTextField));
        cognomeTextField.addActionListener( x -> mediator.notify(cognomeTextField));
        salvaButton.addActionListener( x -> mediator.notify(salvaButton));

        frame.pack();
        frame.setVisible(true);
    }
}
