import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CellCalc {

	public static void main(String[] args) {
	
	JFrame frame = new JFrame();
	frame.setBounds(50,50,400,500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.setLayout(null);
	frame.setVisible(true);
	
	
	
	
	int base = 75;
	
	JLabel rate = new JLabel("Hourly Rate:");
	rate.setBounds(100, 35 , 75, 100);
	frame.add(rate);
	
	JTextField inRate = new JTextField();
	inRate.setBounds(base*2, base, 75, 100 );
	frame.add(inRate);
	
	
	JLabel hours = new JLabel("Hours/Week:");
	hours.setBounds(base, base*2, 75, 100);
	frame.add(hours);
	
	JTextField inHours = new JTextField();	
	inHours.setBounds(base*2, base*2, 75, 100);
	frame.add(inHours);
	
	
	JLabel salary = new JLabel("Annual salary:");
	salary.setBounds(base, base*3, 75, 100);
	frame.add(salary);
	
	JButton calculate = new JButton("Calculate");
	calculate.setBounds(base*2, base * 3, 75, 100);
	frame.add(calculate);
	
	calculate.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e) {
		double drate =  Double.parseDouble(rate.getText());
		int ihours = Integer.parseInt(hours.getText());
		salary.setText(""+ihours *drate * 52);
			}
		}
	);
	
JCheckBox checker = new JCheckBox("Full Time");
	checker.setBounds(100, 35, 50, 10);
	frame.add(checker);
	checker.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e) {
		if (checker.isSelected()) {
			rate.setVisible(false);
			hours.setVisible(false);
			
				}
			}
		}
	);
	
	}
	
	
}
