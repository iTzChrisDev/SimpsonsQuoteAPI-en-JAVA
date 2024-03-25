package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controllers.ControllerCharacter;
import views.customComponents.PanelRound;

public class MainFrame extends JFrame {

    PanelRound pnlMain, pnlHeader;
    ControllerCharacter ctrlChar;

    public MainFrame() {
        this.setSize(1080, 720);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Simpsons API");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("./src/main/resources/icon.png"));
        initComponents();
        ctrlChar = new ControllerCharacter();
        ctrlChar.createCards(pnlMain);
    }

    private void initComponents() {
        JPanel pnl = new JPanel();
        pnl.setLayout(new BorderLayout(5, 5));
        pnl.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.add(pnl);

        pnlHeader = new PanelRound();
        pnlHeader.setLayout(new BorderLayout(5, 5));
        pnlHeader.setRound(20);
        pnlHeader.add(new JTextField("text"), BorderLayout.CENTER);
        pnl.add(pnlHeader, BorderLayout.NORTH);

        pnlMain = new PanelRound();
        pnlMain.setBorder(new EmptyBorder(5, 5, 5, 5));
        pnlMain.setRound(20);
        pnlMain.setBackground(new Color(40, 40, 40));
        pnl.add(pnlMain, BorderLayout.CENTER);
    }

    public PanelRound getPanelCharacters() {
        return pnlMain;
    }
}
