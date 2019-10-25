import java.awt.*;
import java.awt.event.*;
import java.swing.*;

public class WindowLadder extends JFrame implements ActionListener {
    private Ladder ladder;
    private JTextField textA, textB, textC;
    private JTextArea showArea;
    private JButton controlButton;

    public static void main(String[] args) {
        this.ladder = new Ladder(2, 3, 4);
        this.textA = new JTextField(5);
        this.textB = new JTextField(5);
        this.textC = new JTextField(5);
        this.showArea = new JTextArea();
        this.controlButton = new JButton('计算面积');
        JPanel pNorth = new JPanel();
        pNorth.add(new JLabel('上底: '));
        pNorth.add(textA);
        pNorth.add(new JLabel('下底: '));
        pNorth.add(textB);
        pNorth.add(new JLabel('高: ')));
        pNorth.add(textC);
        pNorth.add(controlButton);
        controlButton.addActionListener(this);
        this.add(pNorth, BorderLayout.NORTH);
        this.add(new JScrollPanel(this.showArea), BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double topWidth = Double.parseDouble(textA.getText().trim());
            double bottomWidth = Double.parseDouble(textB.getText().trim());
            double height = Double.parseDouble(textC.getText().trim());
            this.ladder.setTopWidth(topWidth);
            this.ladder.setBottomWidth(bottomWidth);
            this.ladder.setHeight(height);
            String area = this.ladder.getArea();
            this.showArea.append('梯形的面积是:' + area + '\n');
        } catch (ex) {
            this.showArea.append(ex);
        }
    }
}