package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import views.components.CharacterCard;
import views.customComponents.PanelRound;

public class MainFrame extends JFrame {

    private PanelRound pnlMain, pnlHeader;

    public MainFrame() {
        this.setSize(800, 600);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Simpsons API");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("./src/main/resources/icon.png"));
        initComponents();
    }

    private void initComponents() {
        JPanel pnl = new JPanel();
        pnl.setLayout(new BorderLayout(5, 5));
        pnl.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.add(pnl);

        pnlHeader = new PanelRound();
        // pnlHeader.setBorder(new EmptyBorder(10, 10, 10, 10));
        pnlHeader.setLayout(new BorderLayout(5, 5));
        pnlHeader.setRound(20);
        pnlHeader.add(new JTextField("text"), BorderLayout.CENTER);
        pnl.add(pnlHeader, BorderLayout.NORTH);

        pnlMain = new PanelRound();
        pnlMain.setBorder(new EmptyBorder(5, 5, 5, 5));
        pnlMain.setLayout(new GridLayout(2, 2, 5, 5));
        pnlMain.setRound(20);
        pnlMain.setBackground(new Color(40, 40, 40));
        pnl.add(pnlMain, BorderLayout.CENTER);

        for (int i = 0; i < 20; i++) {
            pnlMain.add(new CharacterCard());
        }
    }
}
