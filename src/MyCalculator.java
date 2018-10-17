import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.lang.Math;
import javax.swing.JOptionPane;


public class MyCalculator extends JFrame implements ActionListener {

	
	 private static final long serialVersionUID = 1L;
	
	 JPanel contentPane;
     JTextField textField_1;
     JTextField textField;
     JTextField textField_2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalculator frame = new MyCalculator();
					JOptionPane.showMessageDialog(null, "Fill the First Field only for trigonometrical functions, exp(), ln(),sqrt", "INFO", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "The symbol ^ is the power,the base the First Number and the Second Number is the exponent", "INFO", JOptionPane.INFORMATION_MESSAGE); 
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MyCalculator() {
		
		/* the container */
		super("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/*----------------*/
		
		/*The Text Fields*/
		textField = new JTextField();
		textField.setBounds(222, 8, 170, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(222, 50, 170, 34);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(222, 97, 170, 34);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		/*---------------*/
		
		/*The buttons*/
		JButton btnAdd = new JButton("ADD"); // Button Add
		btnAdd.setBounds(38, 144, 97, 25);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(textField.getText());
				double number1 = Double.parseDouble(textField_1.getText());
				
				String result = String.valueOf(number+number1);
				textField_2.setText(result);
			}
		});
		contentPane.add(btnAdd);
		
		JButton btnSub = new JButton("SUB"); // Button Sub
		btnSub.setBounds(138, 144, 97, 25);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(textField.getText());
				double number1 = Double.parseDouble(textField_1.getText());
				
				String result = String.valueOf(number-number1);
				textField_2.setText(result);
			}
		});
		contentPane.add(btnSub);
		
		JButton btnDiv = new JButton("DIV"); // Button Division
		btnDiv.setBounds(343, 144, 97, 25);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(textField.getText());
				double number1 = Double.parseDouble(textField_1.getText());
				
				String result = String.valueOf(number/number1);
				textField_2.setText(result);
			}
		});
		contentPane.add(btnDiv);
		
		JButton btnMul = new JButton("MUL"); // Button Multiplication
		btnMul.setBounds(241, 144, 97, 25);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(textField.getText());
				double number1 = Double.parseDouble(textField_1.getText());
				
				String result = String.valueOf(number*number1);
				textField_2.setText(result);
			}
		});
		contentPane.add(btnMul);
		
		JButton btnSqrt = new JButton("sqrt"); // Button Square
		btnSqrt.setBounds(138, 182, 97, 25);
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(textField.getText());
				
				String result = String.valueOf(Math.sqrt(number));
				textField_2.setText(result);
			}
		});
		contentPane.add(btnSqrt);
		
		JButton btnSin = new JButton("sin()"); // Button SIN
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(textField.getText());
				String result = String.valueOf(Math.sin(number));
				textField_2.setText(result);
			}
		});
		btnSin.setBounds(343, 184, 97, 25);
		contentPane.add(btnSin);
		
		JButton btnCos = new JButton("cos()"); // Button COS
		btnCos.setBounds(241, 182, 97, 25);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(textField.getText());
				
				String result = String.valueOf(Math.cos(number));
				textField_2.setText(result);
			}
		});
		contentPane.add(btnCos);
		
		JButton btnExp = new JButton("exp()"); // Button exponential
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(textField.getText());
				String result = String.valueOf(Math.exp(number));
				textField_2.setText(result);
			}
		});
		btnExp.setBounds(38, 182, 97, 25);
		contentPane.add(btnExp);
		
		JButton btnLn = new JButton("ln()"); // Button ln
		btnLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(textField.getText());
				
				String result = String.valueOf(Math.log(number));
				textField_2.setText(result);
			}
		});
		btnLn.setBounds(548, 144, 97, 25);
		contentPane.add(btnLn);
		
		JButton btnPow = new JButton("^"); // Button power
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1 = Double.parseDouble(textField.getText());
				double number2 = Double.parseDouble(textField_1.getText());
				
				String result = String.valueOf(Math.pow(number1, number2));
				textField_2.setText(result);
			}
		});
		btnPow.setBounds(445, 144, 97, 25);
		contentPane.add(btnPow);
		
		JButton btnTan = new JButton("tan()"); // Button tan
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(textField.getText());
				
				String result = String.valueOf(Math.tan(number));
				textField_2.setText(result);
			}
		});
		btnTan.setBounds(445, 184, 97, 25);
		contentPane.add(btnTan);
		
		JButton btnCosh = new JButton("cosh()"); // Button cosh
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(textField.getText());
				
				String result = String.valueOf(Math.cosh(number));
				textField_2.setText(result);
			}
		});
		btnCosh.setBounds(548, 184, 97, 25);
		contentPane.add(btnCosh);

		
		JButton btnSinh = new JButton("sinh()"); // Button sinh
		btnSinh.setBounds(38, 220, 97, 25);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(textField.getText());
				
				String result = String.valueOf(Math.sinh(number));
				textField_2.setText(result);
			}
		});
		contentPane.add(btnSinh);
		
		JButton btnTanh = new JButton("tanh()"); // Button tanh
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(textField.getText());
				
				String result = String.valueOf(Math.tanh(number));
				textField_2.setText(result);
			}
		});
		btnTanh.setBounds(138, 220, 97, 25);
		contentPane.add(btnTanh);
		
		JButton btnAsin = new JButton("asin()"); // Button asin
		btnAsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(textField.getText());
				
				String result = String.valueOf(Math.asin(number));
				textField_2.setText(result);
			}
		});
		btnAsin.setBounds(241, 220, 97, 25);
		contentPane.add(btnAsin);
		
		JButton btnAcos = new JButton("acos()"); // Button acos
		btnAcos.setBounds(343, 220, 97, 25);
		btnAcos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(textField.getText());
				
				String result = String.valueOf(Math.acos(number));
				textField_2.setText(result);
			}
		});
		contentPane.add(btnAcos);
		
		JButton btnAtan = new JButton("atan()"); // Button atan
		btnAtan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(textField.getText());
				
				String result = String.valueOf(Math.atan(number));
				textField_2.setText(result);
			}
		});
		btnAtan.setBounds(445, 222, 97, 25);
		contentPane.add(btnAtan);
		
		JButton btn– = new JButton("\u03C0"); // Button 
		btn–.setBounds(548, 222, 97, 25);
		btn–.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String result = String.valueOf(Math.PI);
				textField.setText(result);
			}
		});
		contentPane.add(btn–);
		
		JButton btnC = new JButton("C"); // Button C
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnC.setBounds(273, 268, 150, 44);
		contentPane.add(btnC);
	 
		/*---------------------------*/

		/*The labels*/
		JLabel lblFirstNumber = new JLabel("FIRST NUMBER");
		lblFirstNumber.setBounds(90, 8, 104, 34);
		contentPane.add(lblFirstNumber);
		
		JLabel lblSecondNumber = new JLabel("SECOND NUMBER");
		lblSecondNumber.setBounds(90, 55, 104, 25);
		contentPane.add(lblSecondNumber);
		
		JLabel lblResult = new JLabel("RESULT");
		lblResult.setBounds(90, 106, 97, 16);
		contentPane.add(lblResult);
		/*---------------------*/
		
	}

public void actionPerformed(ActionEvent e) {}
	
}