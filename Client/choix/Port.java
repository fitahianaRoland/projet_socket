package choix;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import choix.*;

public class Port extends JFrame {
    JPanel panel = new JPanel();
    JLabel text = new JLabel("PORT :");
    JTextField input = new JTextField(15);
    JButton bouton = new JButton("ok");

    int reponse = 0;

    public Port() {
        this.setSize(400, 100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        panel.add(text);
        panel.add(input);
        panel.add(bouton);
        this.add(panel);

        bouton.addActionListener(e -> {
            int rep = Integer.valueOf((input.getText()));
            setReponse(rep);
            this.dispose();
            System.out.println(rep);
            choix c = new choix();
            c.setPort(rep);

        });
        this.setVisible(true);
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getText() {
        return text;
    }

    public void setText(JLabel text) {
        this.text = text;
    }

    public JTextField getInput() {
        return input;
    }

    public void setInput(JTextField input) {
        this.input = input;
    }

    public JButton getBouton() {
        return bouton;
    }

    public void setBouton(JButton bouton) {
        this.bouton = bouton;
    }

    public int getReponse() {
        return reponse;
    }

    public void setReponse(int reponse) {
        this.reponse = reponse;
    }
}
