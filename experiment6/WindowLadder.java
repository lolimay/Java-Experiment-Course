import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowLadder extends JFrame implements ActionListener {
    private Ladder ladder;
    private JTextField textA, textB, textC;
    private JTextArea showArea;
    private JButton controlButton;
    // Fix warning:
    // The serializable class WindowLadder does not declare a
    // static final serialVersionUID field of type longJava(536871008)
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        WindowLadder window = new WindowLadder();
        window.init();
        window.setTitle("E21714049-梅世祺-计算三角形面积");
        window.setBounds(100, 100, 420, 260);
    }

    public void init() {
        this.ladder = new Ladder(2, 3, 4);
        this.textA = new JTextField(5);
        this.textB = new JTextField(5);
        this.textC = new JTextField(5);
        this.showArea = new JTextArea();
        this.controlButton = new JButton("计算面积");
        JPanel pNorth = new JPanel();
        pNorth.add(new JLabel("上底: "));
        pNorth.add(textA);
        pNorth.add(new JLabel("下底: "));
        pNorth.add(textB);
        pNorth.add(new JLabel("高: "));
        pNorth.add(textC);
        pNorth.add(controlButton);
        controlButton.addActionListener(this);
        this.add(pNorth, BorderLayout.NORTH);
        this.add(new JScrollPane(this.showArea), BorderLayout.CENTER);
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
            this.showArea.append("梯形的面积是:" + area + "\n");
        } catch (Error ex) {
            this.showArea.append(ex.toString());
        }
    }
}