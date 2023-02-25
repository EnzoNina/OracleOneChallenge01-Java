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

public class Unidades extends JFrame {

	private JPanel contentPane;
	private JTextField txtKilogramo;
	private JTextField txtTonelada;
	private JTextField txtMicrogramo;
	private JTextField txtMiligramo;
	private JTextField txtCentigramo;
	private JTextField txtGramos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Unidades frame = new Unidades();
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
	public Unidades() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblIngreseElValor = new JLabel("Ingrese el valor a convertir en Kilogramo:");
		lblIngreseElValor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIngreseElValor.setBounds(52, 11, 284, 31);
		contentPane.add(lblIngreseElValor);

		txtKilogramo = new JTextField();
		txtKilogramo.setColumns(10);
		txtKilogramo.setBounds(346, 14, 218, 29);
		contentPane.add(txtKilogramo);

		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Obtenemos el valor
				double kilo = Double.parseDouble(txtKilogramo.getText());
				// Cambiamos los valores
				double gramo = kilo * 1000;
				double centigramo = kilo * 100000;
				double miligramo = kilo * 1000000;
				double microgramo = kilo * 1000000000;
				double tonelada = kilo * 0.001;
				// Establecemos los valores en los text field
				txtGramos.setText(String.valueOf(gramo));
				txtCentigramo.setText(String.valueOf(centigramo));
				txtMiligramo.setText(String.valueOf(miligramo));
				txtMicrogramo.setText(String.valueOf(microgramo));
				txtTonelada.setText(String.valueOf(tonelada));
			}
		});
		btnConvertir.setBounds(385, 54, 136, 31);
		contentPane.add(btnConvertir);

		JLabel lblGramo = new JLabel("Valor en Gramos:");
		lblGramo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGramo.setBounds(127, 111, 198, 31);
		contentPane.add(lblGramo);

		JLabel lblValorcentigramo = new JLabel("Valor en Centigramo:");
		lblValorcentigramo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValorcentigramo.setBounds(127, 151, 198, 31);
		contentPane.add(lblValorcentigramo);

		JLabel lblValorMiligramo = new JLabel("Valor en Miligramo:");
		lblValorMiligramo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValorMiligramo.setBounds(127, 190, 198, 31);
		contentPane.add(lblValorMiligramo);

		JLabel lblValorEnMicrogramo = new JLabel("Valor en Microgramo:");
		lblValorEnMicrogramo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValorEnMicrogramo.setBounds(127, 232, 198, 31);
		contentPane.add(lblValorEnMicrogramo);

		JLabel lblValorEnTonelada = new JLabel("Valor en Tonelada");
		lblValorEnTonelada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValorEnTonelada.setBounds(127, 275, 198, 31);
		contentPane.add(lblValorEnTonelada);

		txtTonelada = new JTextField();
		txtTonelada.setEditable(false);
		txtTonelada.setColumns(10);
		txtTonelada.setBounds(346, 275, 218, 29);
		contentPane.add(txtTonelada);

		txtMicrogramo = new JTextField();
		txtMicrogramo.setEditable(false);
		txtMicrogramo.setColumns(10);
		txtMicrogramo.setBounds(346, 233, 218, 29);
		contentPane.add(txtMicrogramo);

		txtMiligramo = new JTextField();
		txtMiligramo.setEditable(false);
		txtMiligramo.setColumns(10);
		txtMiligramo.setBounds(346, 191, 218, 29);
		contentPane.add(txtMiligramo);

		txtCentigramo = new JTextField();
		txtCentigramo.setEditable(false);
		txtCentigramo.setColumns(10);
		txtCentigramo.setBounds(346, 151, 218, 29);
		contentPane.add(txtCentigramo);

		txtGramos = new JTextField();
		txtGramos.setEditable(false);
		txtGramos.setColumns(10);
		txtGramos.setBounds(346, 111, 218, 29);
		contentPane.add(txtGramos);
	}

}
