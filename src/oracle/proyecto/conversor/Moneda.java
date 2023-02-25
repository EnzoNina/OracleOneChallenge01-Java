package oracle.proyecto.conversor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Moneda extends JFrame {

	private JPanel contentPane;
	private JTextField txt_monedaPersonal;
	private JTextField txt_won;
	private JTextField txt_yen;
	private JTextField txt_libra;
	private JTextField txt_euro;
	private JTextField txt_dolar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Moneda frame = new Moneda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Moneda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Ingrese el valor a convertir:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(61, 25, 198, 31);
		contentPane.add(lblNewLabel);

		txt_monedaPersonal = new JTextField();
		txt_monedaPersonal.setColumns(10);
		txt_monedaPersonal.setBounds(269, 27, 218, 29);
		contentPane.add(txt_monedaPersonal);

		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Recogemos el valor de nuestra moneda
				double valorPersonal = Double.parseDouble(txt_monedaPersonal.getText());
				// Convertimos la moneda
				double valorDolar = valorPersonal * 0.26;
				double valorEuro = valorPersonal * 0.25;
				double valorLibra = valorPersonal * 0.22;
				double valorYen = valorPersonal * 35.36;
				double valorWon = valorPersonal * 341.14;
				// Establecemos en los textField
				txt_dolar.setText(String.valueOf("$" + valorDolar));
				txt_euro.setText(String.valueOf("€" + valorEuro));
				txt_libra.setText(String.valueOf("£" + valorLibra));
				txt_yen.setText(String.valueOf("¥" + valorYen));
				txt_won.setText(String.valueOf("₩" + valorWon));
			}
		});
		btnConvertir.setBounds(308, 67, 136, 31);
		contentPane.add(btnConvertir);

		JLabel lblValorEnDlares = new JLabel("Valor en Dólares:");
		lblValorEnDlares.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValorEnDlares.setBounds(61, 119, 198, 31);
		contentPane.add(lblValorEnDlares);

		JLabel lblValorEnEuros = new JLabel("Valor en Euros:");
		lblValorEnEuros.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValorEnEuros.setBounds(61, 159, 198, 31);
		contentPane.add(lblValorEnEuros);

		JLabel lblValorEnLibras = new JLabel("Valor en Libras Esterlinas:");
		lblValorEnLibras.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValorEnLibras.setBounds(61, 198, 198, 31);
		contentPane.add(lblValorEnLibras);

		JLabel lblValorEnYen = new JLabel("Valor en Yen Japonés:");
		lblValorEnYen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValorEnYen.setBounds(61, 240, 198, 31);
		contentPane.add(lblValorEnYen);

		JLabel lblValorEnWon = new JLabel("Valor en Won sul-coreano");
		lblValorEnWon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValorEnWon.setBounds(61, 283, 198, 31);
		contentPane.add(lblValorEnWon);

		txt_won = new JTextField();
		txt_won.setEditable(false);
		txt_won.setColumns(10);
		txt_won.setBounds(269, 285, 218, 29);
		contentPane.add(txt_won);

		txt_yen = new JTextField();
		txt_yen.setEditable(false);
		txt_yen.setColumns(10);
		txt_yen.setBounds(269, 243, 218, 29);
		contentPane.add(txt_yen);

		txt_libra = new JTextField();
		txt_libra.setEditable(false);
		txt_libra.setColumns(10);
		txt_libra.setBounds(269, 201, 218, 29);
		contentPane.add(txt_libra);

		txt_euro = new JTextField();
		txt_euro.setEditable(false);
		txt_euro.setColumns(10);
		txt_euro.setBounds(269, 161, 218, 29);
		contentPane.add(txt_euro);

		txt_dolar = new JTextField();
		txt_dolar.setEditable(false);
		txt_dolar.setColumns(10);
		txt_dolar.setBounds(269, 121, 218, 29);
		contentPane.add(txt_dolar);
	}

}
