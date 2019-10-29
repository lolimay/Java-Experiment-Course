import java.awt.*;
import javax.swing.*;
import javalesson.Trapezia;
import java.awt.event.*;

public class WindowTrapezia extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try{
			Trapezia trapezia = new Trapezia();
			double a=Double.parseDouble(textA.getText().trim());
			double b=Double.parseDouble(textB.getText().trim());
			double c=Double.parseDouble(textC.getText().trim());
			trapezia .setA(a);
			trapezia .setB(b);
			trapezia .setC(c);
			String area=trapezia .getArea();
			showArea.append("梯形: A=" + a + ", B="+b+", C="+c+" 面积=");
			showArea.append(area+"\n");
			
		}
		catch(Exception ex){
			showArea.append("\n"+ex+"\n");
			
		}
		
	}
	Trapezia trapezia ;
	JTextArea showArea;
	JTextField textA,textB,textC;
	JButton controlButton;
	public WindowTrapezia(){
    trapezia=new Trapezia();
	textA=new JTextField(5);
	textB=new JTextField(5);
	textC=new JTextField(5);
	showArea=new JTextArea();
	controlButton=new JButton("计算面积");
	JPanel pNorth=new JPanel();
	pNorth.add(new JLabel("上底A:"));
	pNorth.add(textA);
	pNorth.add(new JLabel("下底B:"));
	pNorth.add(textB);
	pNorth.add(new JLabel("高C:"));
	pNorth.add(textC);
	pNorth.add(controlButton);
	controlButton.addActionListener(this);
	add(pNorth,BorderLayout.NORTH);
	add(new JScrollPane(showArea),BorderLayout.CENTER);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
