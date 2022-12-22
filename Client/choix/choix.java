package choix;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import client_socket.*;

public class choix extends JFrame {
    JPanel panel = new JPanel();
    JLabel text = new JLabel("taper IP : ");
    JTextField input = new JTextField(15);
    JButton bouton = new JButton("ok");
    String reponse = "";
    int port = 0;

    public choix() {
        this.setSize(400, 100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        panel.add(text);
        panel.add(input);
        panel.add(bouton);
        this.add(panel);

        bouton.addActionListener(e -> {
            reponse = input.getText();
            setReponse(reponse);
            this.dispose();
            try {
                new ClientSocket(reponse, port);
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            this.dispose();
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

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

}
