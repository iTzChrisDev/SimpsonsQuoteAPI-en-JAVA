package views.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import views.customComponents.PanelRound;

public class CharacterCard extends JPanel {

    private JLabel lblQuote, lblCharacter, lblImg;
    private PanelRound pnl;

    public CharacterCard() {
        this.setOpaque(false);
        this.setLayout(new GridLayout());

        pnl = new PanelRound();
        pnl.setLayout(new BorderLayout(5, 5));
        pnl.setBorder(new EmptyBorder(5, 5, 5, 5));
        pnl.setBackground(new Color(50, 50, 50));
        pnl.setRound(15);

        initComponents();
        this.add(pnl);
    }

    private void initComponents() {
        lblQuote = new JLabel("NULL");
        lblQuote.setFont(new Font("Roboto", Font.PLAIN, 14));
        lblCharacter = new JLabel("NULL");
        lblCharacter.setHorizontalAlignment(JLabel.CENTER);
        lblCharacter.setFont(new Font("Roboto", Font.BOLD, 16));
        lblImg = new JLabel();
        lblImg.setHorizontalAlignment(JLabel.CENTER);
        lblImg.setVerticalAlignment(JLabel.CENTER);
        pnl.add(lblQuote, BorderLayout.SOUTH);
        pnl.add(lblCharacter, BorderLayout.NORTH);
        pnl.add(lblImg, BorderLayout.CENTER);
    }

    public void setInfoCharacter(String quote, String character, String imgPath) {
        lblQuote.setText("<html><p>" + quote + "</p></html>");
        lblCharacter.setText(character);
        try {
            URL url = new URL(imgPath);
            Image image = ImageIO.read(url);
            lblImg.setIcon(new ImageIcon(image.getScaledInstance(64, 128, Image.SCALE_SMOOTH)));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
