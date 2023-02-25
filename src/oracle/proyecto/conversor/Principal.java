package oracle.proyecto.conversor;

import java.awt.EventQueue;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
- Convertir de la moneda de tu país a Dólar
- Convertir de la moneda de tu país  a Euros
- Convertir de la moneda de tu país  a Libras Esterlinas
- Convertir de la moneda de tu país  a Yen Japonés
- Convertir de la moneda de tu país  a Won sul-coreano
 * */

public class Principal extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setBounds(100, 100, 517, 405);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Conversor");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(206, 11, 97, 38);
		getContentPane().add(lblNewLabel);

		JButton btnMoneda = new JButton("Conversor de Monedas");
		btnMoneda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Enviar al menu de Monedas
				Moneda mo = new Moneda();
				mo.setVisible(true);
				// Hacemos que este frame desaparezca
				Principal window = new Principal();
				window.setVisible(false);
			}
		});
		btnMoneda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMoneda.setBounds(168, 74, 158, 49);
		getContentPane().add(btnMoneda);

		JButton btnMedidas = new JButton("Conversor de Medidas");
		btnMedidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Enviar al menu de Medidas
				Unidades uni = new Unidades();
				uni.setVisible(true);
				// Hacemos que este frame desaparezca
				Principal window = new Principal();
				window.setVisible(false);
			}
		});
		btnMedidas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMedidas.setBounds(168, 149, 158, 49);
		getContentPane().add(btnMedidas);
	}
}
