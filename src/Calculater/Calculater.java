package Calculater;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;

public class Calculater {

	private JFrame frmCalculater;
	/**
	 * @wbp.nonvisual location=-17,4
	 */
	private final JPanel panel = new JPanel();
	/**
	 * @wbp.nonvisual location=-17,14
	 */
	private final JPanel panel_1 = new JPanel();
	private final JTextField input = new JTextField();
	private final JTextField lbl1 = new JTextField();
	private double answer, number;
	private int operator;

	/**
	 * Launch the application.
	 */
	public void calculater() {
		switch (operator) {
		case 1:
			answer = number + Double.parseDouble(input.getText());
		    input.setText(Double.toString(answer));
			break;

		case 2:
			answer = number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;

		case 3:
			answer = number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;

		case 4:
			try {
			answer = number / Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
					}catch(Exception e) {
						input.setText(e.toString());
					}
			
			
		    input.setText(Double.toString(answer));
		    break;
		case 5:
			answer =Math.pow(number,(Double.parseDouble(input.getText())));
			input.setText(Double.toString(answer));
			break;
		case 6:
			answer = (number * Double.parseDouble(input.getText())) / 100;
			input.setText(Double.toString(answer));
			break;
		case 7:
			answer =Math.pow(number,1/(Double.parseDouble(input.getText())));
			input.setText(Double.toString(answer));
			break;
			

		}

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculater window = new Calculater();
					window.frmCalculater.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculater() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Tahoma", Font.BOLD, 22));
		input.setBounds(0, 52, 402, 44);
		input.setColumns(10);
		frmCalculater = new JFrame();
		frmCalculater.getContentPane().setBackground(new Color(0, 0, 0));
		frmCalculater.setResizable(false);
		frmCalculater.setTitle("Calculater");
		frmCalculater.setBounds(100, 100, 433, 506);
		frmCalculater.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculater.getContentPane().setLayout(null);

		JPanel Control = new JPanel();
		Control.setBackground(new Color(192, 192, 192));
		Control.setBounds(10, 10, 402, 96);
		frmCalculater.getContentPane().add(Control);
		Control.setLayout(null);

		Control.add(input);

		JLabel lbl1 = new JLabel("");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lbl1.setBackground(new Color(255, 255, 255));
		lbl1.setBounds(31, 10, 396, 33);
		Control.add(lbl1);

		JButton buton8 = new JButton("8");
		buton8.setBackground(new Color(255, 128, 64));
		buton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + e.getActionCommand());
			}
		});
		buton8.setFont(new Font("Tahoma", Font.BOLD, 22));
		buton8.setBounds(113, 192, 93, 64);
		frmCalculater.getContentPane().add(buton8);

		JButton buton4 = new JButton("4");
		buton4.setBackground(new Color(255, 128, 64));
		buton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + e.getActionCommand());
			}
		});
		buton4.setFont(new Font("Tahoma", Font.BOLD, 22));
		buton4.setBounds(10, 260, 93, 64);
		frmCalculater.getContentPane().add(buton4);

		JButton buton9 = new JButton("9");
		buton9.setBackground(new Color(255, 128, 64));
		buton9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + e.getActionCommand());

			}
		});
		buton9.setFont(new Font("Tahoma", Font.BOLD, 22));
		buton9.setBounds(216, 192, 93, 64);
		frmCalculater.getContentPane().add(buton9);

		JButton buton7 = new JButton("7");
		buton7.setBackground(new Color(255, 128, 64));
		buton7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + e.getActionCommand());

			}
		});
		buton7.setFont(new Font("Tahoma", Font.BOLD, 22));
		buton7.setBounds(10, 192, 93, 64);
		frmCalculater.getContentPane().add(buton7);

		JButton buton5 = new JButton("5");
		buton5.setBackground(new Color(255, 128, 64));
		buton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + e.getActionCommand());
			}
		});
		buton5.setFont(new Font("Tahoma", Font.BOLD, 22));
		buton5.setBounds(113, 260, 93, 64);
		frmCalculater.getContentPane().add(buton5);

		JButton buton6 = new JButton("6");
		buton6.setBackground(new Color(255, 128, 64));
		buton6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + e.getActionCommand());

			}
		});
		buton6.setFont(new Font("Tahoma", Font.BOLD, 22));
		buton6.setBounds(216, 260, 93, 64);
		frmCalculater.getContentPane().add(buton6);

		JButton buton3 = new JButton("3");
		buton3.setBackground(new Color(255, 128, 64));
		buton3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + e.getActionCommand());

			}
		});
		buton3.setFont(new Font("Tahoma", Font.BOLD, 22));
		buton3.setBounds(216, 328, 93, 64);
		frmCalculater.getContentPane().add(buton3);

		JButton buton1 = new JButton("1");
		buton1.setBackground(new Color(255, 128, 64));
		buton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + e.getActionCommand());
			}
		});
		buton1.setFont(new Font("Tahoma", Font.BOLD, 22));
		buton1.setBounds(10, 328, 93, 64);
		frmCalculater.getContentPane().add(buton1);

		JButton buton2 = new JButton("2");
		buton2.setBackground(new Color(255, 128, 64));
		buton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + e.getActionCommand());
			}
		});
		buton2.setFont(new Font("Tahoma", Font.BOLD, 22));
		buton2.setBounds(113, 328, 93, 64);
		frmCalculater.getContentPane().add(buton2);

		JButton buton19 = new JButton("c");
		buton19.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(null);
				lbl1.setText(null);
				

			}
		});
		buton19.setForeground(new Color(0, 0, 0));
		buton19.setBackground(new Color(47, 79, 79));
		buton19.setFont(new Font("Tahoma", Font.BOLD, 34));
		buton19.setBounds(10, 398, 93, 64);
		frmCalculater.getContentPane().add(buton19);

		JButton buton18 = new JButton("pow");
		buton18.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operator = 5;
				calculater();
				input.setText("");
				lbl1.setText(number + e.getActionCommand());

			}
		});
		buton18.setFont(new Font("Tahoma", Font.BOLD, 22));
		buton18.setBounds(113, 118, 93, 64);
		frmCalculater.getContentPane().add(buton18);

		JButton buton17 = new JButton("%");
		buton17.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operator = 6;
				calculater();
				input.setText("");
				lbl1.setText(number + e.getActionCommand());

			}
		});
		buton17.setFont(new Font("Tahoma", Font.BOLD, 22));
		buton17.setBounds(216, 118, 93, 64);
		frmCalculater.getContentPane().add(buton17);

		JButton buton0 = new JButton("0");
		buton0.setBackground(new Color(255, 128, 64));
		buton0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + e.getActionCommand());

			}
		});
		buton0.setFont(new Font("Tahoma", Font.BOLD, 22));
		buton0.setBounds(113, 398, 93, 62);
		frmCalculater.getContentPane().add(buton0);

		JButton buton10 = new JButton("root");
		buton10.setBackground(SystemColor.inactiveCaption);
		buton10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operator = 7;
				calculater();
				input.setText("");
				lbl1.setText(number + e.getActionCommand());

			}
		});
		buton10.setFont(new Font("Tahoma", Font.BOLD, 22));
		buton10.setBounds(10, 118, 93, 64);
		frmCalculater.getContentPane().add(buton10);

		JButton buton11 = new JButton("AC");
		buton11.setBackground(new Color(112, 128, 144));
		buton11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(null);

			}
		});
		buton11.setFont(new Font("Tahoma", Font.BOLD, 22));
		buton11.setBounds(216, 398, 93, 64);
		frmCalculater.getContentPane().add(buton11);

		JButton buton12 = new JButton("=");
		buton12.setBackground(SystemColor.inactiveCaption);
		buton12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calculater();
			}
		});
		buton12.setFont(new Font("Tahoma", Font.BOLD, 44));
		buton12.setBounds(319, 389, 93, 73);
		frmCalculater.getContentPane().add(buton12);

		JButton buton13 = new JButton("+");
		buton13.setBackground(SystemColor.inactiveCaption);
		buton13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				number = Double.parseDouble(input.getText());
				operator = 1;

				input.setText("");
				lbl1.setText(number + e.getActionCommand());
				
				

			}
		});
		buton13.setFont(new Font("Tahoma", Font.BOLD, 29));
		buton13.setBounds(319, 328, 93, 58);
		frmCalculater.getContentPane().add(buton13);

		JButton buton14 = new JButton("-");
		buton14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operator = 2;

				input.setText("");
				lbl1.setText(number + e.getActionCommand());
			}
		});
		buton14.setFont(new Font("Tahoma", Font.BOLD, 51));
		buton14.setBounds(319, 260, 93, 58);
		frmCalculater.getContentPane().add(buton14);

		JButton buton15 = new JButton("/");
		buton15.setBackground(SystemColor.inactiveCaption);
		buton15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				input.setText("");
				operator = 4;
				lbl1.setText(number + e.getActionCommand());
			}
		});
		buton15.setFont(new Font("Tahoma", Font.BOLD, 22));
		buton15.setBounds(319, 192, 93, 58);
		frmCalculater.getContentPane().add(buton15);

		JButton buton16 = new JButton("*");
		buton16.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operator = 3;

				input.setText("");
				lbl1.setText(number + e.getActionCommand());

			}
		});
		buton16.setForeground(new Color(0, 0, 0));
		buton16.setBackground(SystemColor.inactiveCaption);
		buton16.setFont(new Font("Tahoma", Font.BOLD, 40));
		buton16.setBounds(319, 118, 93, 64);
		frmCalculater.getContentPane().add(buton16);
	}
}
