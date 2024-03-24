package views;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import views.customComponents.PanelRound;

public class MainFrame extends JFrame {

    private PanelRound pnlMain;

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
        pnl.setLayout(new GridLayout());
        pnl.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.add(pnl);

        pnlMain = new PanelRound();
        pnlMain.setBorder(new EmptyBorder(10, 10, 10, 10));
        pnlMain.setLayout(new GridLayout(2, 2, 5, 5));
        pnlMain.setRound(20);
        pnlMain.setBackground(new Color(40, 40, 40));
        pnl.add(pnlMain);
    }
}
