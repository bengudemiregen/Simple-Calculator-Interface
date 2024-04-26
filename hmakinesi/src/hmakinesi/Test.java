package hmakinesi;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test extends JFrame {
	
	 private JTextArea buyukMetin; 
	private double sayi1, sayi2;
	private char islem;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable()
		{
			public void run() 
			{
				try {
					Test frame = new Test();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test() {
		setTitle("Hesap Makinesi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 621);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Buton3 = new JButton("3");
		Buton3.setBounds(228, 250, 91, 72);
		contentPane.add(Buton3);
		

		JButton Buton1 = new JButton("1");
		Buton1.setBounds(26, 250, 91, 72);
		contentPane.add(Buton1);
		
		JButton Buton2 = new JButton("2");
		Buton2.setBounds(127, 250, 91, 72);
		contentPane.add(Buton2);
		
		JButton Buton4 = new JButton("4");
		Buton4.setBounds(26, 338, 91, 72);
		contentPane.add(Buton4);
		
		JButton Buton5 = new JButton("5");
		Buton5.setBounds(127, 338, 91, 72);
		contentPane.add(Buton5);
		
		JButton Buton6 = new JButton("6");
		Buton6.setBounds(228, 338, 91, 72);
		contentPane.add(Buton6);
		
		JButton Buton7 = new JButton("7");
		Buton7.setBounds(26, 419, 91, 72);
		contentPane.add(Buton7);
		
		JButton Buton8 = new JButton("8");
		Buton8.setBounds(127, 420, 91, 72);
		contentPane.add(Buton8);
		
		JButton Buton9 = new JButton("9");
		Buton9.setBounds(228, 419, 91, 72);
		contentPane.add(Buton9);
		
		JButton Buton0 = new JButton("0");
		Buton0.setBounds(26, 501, 91, 72);
		contentPane.add(Buton0);
		
		JButton ButonEsittir = new JButton("=");
		ButonEsittir.setBounds(127, 502, 192, 72);
		contentPane.add(ButonEsittir);
		ButonEsittir.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
				
				sayi2=Double.parseDouble(textField.getText());
				Double sonuc;
				
				switch(islem)
				{
				case '+': sonuc = sayi1 + sayi2; break;
				case '-': sonuc = sayi1 - sayi2; break;
				case 'X': sonuc = sayi1 * sayi2; break;
				case '/': sonuc = sayi1 / sayi2; break;
				default: sonuc=0d; JOptionPane.showMessageDialog(rootPane, "İŞLEM YOK");
				}
				
				buyukMetin.append(sayi1 + " " + islem + " " + sayi2 + " = " + sonuc + "\n");
				
				sayi1 = sonuc;
				textField.setText(sonuc+"");
			}
		});
		
		JButton ButonArti = new JButton("+");
		ButonArti.setBounds(344, 250, 91, 72);
		contentPane.add(ButonArti);
		ButonArti.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        islem = '+';
		    }
		});

		
		JButton ButonEksi = new JButton("-");
		ButonEksi.setBounds(344, 338, 91, 72);
		contentPane.add(ButonEksi);
		ButonEksi.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        islem = '-';
		    }
		});
		
		JButton ButonCarpi = new JButton("X");
		ButonCarpi.setBounds(344, 419, 91, 72);
		contentPane.add(ButonCarpi);
		ButonCarpi.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        islem = 'X'; 
		    }
		});
		
		JButton ButonBolu = new JButton("/");
		ButonBolu.setBounds(344, 501, 91, 72);
		contentPane.add(ButonBolu);
		ButonBolu.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        islem = '/';
		    }
		});
		
		JButton ButonClearAll = new JButton("CA");
		ButonClearAll.setBounds(344, 68, 91, 163);
		contentPane.add(ButonClearAll);
		
		JButton ButonClear = new JButton("C");
		ButonClear.setBounds(344, 29, 91, 29);
		contentPane.add(ButonClear);
		ButonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		
		buyukMetin = new JTextArea();
		buyukMetin.setBounds(26, 68, 293, 160);
		contentPane.add(buyukMetin);
		
		textField = new JTextField();
		textField.setBounds(26, 34, 284, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Buton0.addActionListener(this::sayiGir);
		Buton1.addActionListener(this::sayiGir);
		Buton2.addActionListener(this::sayiGir);
		Buton3.addActionListener(this::sayiGir);
		Buton4.addActionListener(this::sayiGir);
		Buton5.addActionListener(this::sayiGir);
		Buton6.addActionListener(this::sayiGir);
		Buton7.addActionListener(this::sayiGir);
		Buton8.addActionListener(this::sayiGir);
		Buton9.addActionListener(this::sayiGir);
	}
	
public void sayiGir(ActionEvent e) {
	  JButton tiklananButon = (JButton) e.getSource();
	    String tus = tiklananButon.getText();

	    if (islem == 0) { // İşlem sembolü henüz belirlenmediyse
	        textField.setText(textField.getText() + tus);
	        sayi1 = Double.parseDouble(textField.getText()); // sayi1'e girilen sayıyı ata
	    } 
	    else 
	    {
	        textField.setText(""); // textField'ı temizle
	        textField.setText(textField.getText() + tus);
	        sayi2 = Double.parseDouble(textField.getText()); // sayi2'ye girilen sayıyı ata
	    }
}
}
