import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Interfejs extends JFrame implements ActionListener {

	JPanel panel = new JPanel();
	JButton oblicz = new JButton("OBLICZ");
	JTextField liczba1 = new JTextField("", 20);
	JTextField liczba2 = new JTextField("", 20);
	JTextArea poleWynik = new JTextArea();

	public Interfejs() {
		super("Kalkulator systemów");

		setSize(400, 200);
		setResizable(false);
		setLocation(150, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(panel);
		panel.setLayout(new GridLayout(2, 3, 10, 10));
		panel.add(liczba1);
		panel.add(liczba2);
		panel.add(oblicz);
		panel.add(poleWynik);

		oblicz.addActionListener(this);

		{

		}

		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		

		poleWynik.setText(DaneWejscia.wynik(Integer.valueOf(liczba1.getText()),Integer.valueOf(liczba2.getText())));

	}
}
