package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;

public class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2629203158139711598L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel matrixView = new JPanel();
		contentPane.add(matrixView, BorderLayout.WEST);
		
		JButton button00 = new JButton("0");
		buttonGroup.add(button00);
		
		JButton button11 = new JButton("0");
		
		JButton button02 = new JButton("0");
		
		JButton button10 = new JButton("0");
		
		JButton button01 = new JButton("0");
		
		JButton button12 = new JButton("0");
		
		JButton button20 = new JButton("0");
		
		JButton button21 = new JButton("0");
		
		JButton button22 = new JButton("0");
		
		JLabel lblCurrentMatrix = new JLabel("Current Matrix");
		
		JButton btnDone = new JButton("Done");
		GroupLayout gl_matrixView = new GroupLayout(matrixView);
		gl_matrixView.setHorizontalGroup(
			gl_matrixView.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_matrixView.createSequentialGroup()
					.addComponent(button00)
					.addGap(5)
					.addComponent(button11)
					.addGap(5)
					.addComponent(button02))
				.addGroup(gl_matrixView.createSequentialGroup()
					.addComponent(button10)
					.addGap(5)
					.addComponent(button01)
					.addGap(5)
					.addComponent(button12))
				.addGroup(gl_matrixView.createSequentialGroup()
					.addComponent(button20)
					.addGap(5)
					.addComponent(button21)
					.addGap(5)
					.addComponent(button22))
				.addComponent(btnDone)
				.addGroup(Alignment.TRAILING, gl_matrixView.createSequentialGroup()
					.addContainerGap(32, Short.MAX_VALUE)
					.addComponent(lblCurrentMatrix)
					.addGap(25))
		);
		gl_matrixView.setVerticalGroup(
			gl_matrixView.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_matrixView.createSequentialGroup()
					.addGap(10)
					.addComponent(lblCurrentMatrix)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_matrixView.createParallelGroup(Alignment.LEADING)
						.addComponent(button00)
						.addComponent(button11)
						.addComponent(button02))
					.addGap(5)
					.addGroup(gl_matrixView.createParallelGroup(Alignment.LEADING)
						.addComponent(button10)
						.addComponent(button01)
						.addComponent(button12))
					.addGap(5)
					.addGroup(gl_matrixView.createParallelGroup(Alignment.LEADING)
						.addComponent(button20)
						.addComponent(button21)
						.addComponent(button22))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnDone)
					.addContainerGap(200, Short.MAX_VALUE))
		);
		matrixView.setLayout(gl_matrixView);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.EAST);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{40, 0};
		gbl_panel_1.rowHeights = new int[]{14, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblMatrices = new JLabel("Matrices");
		GridBagConstraints gbc_lblMatrices = new GridBagConstraints();
		gbc_lblMatrices.insets = new Insets(0, 0, 5, 0);
		gbc_lblMatrices.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblMatrices.gridx = 0;
		gbc_lblMatrices.gridy = 0;
		panel_1.add(lblMatrices, gbc_lblMatrices);
		
		JButton btnA = new JButton("A");
		GridBagConstraints gbc_btnA = new GridBagConstraints();
		gbc_btnA.gridx = 0;
		gbc_btnA.gridy = 1;
		panel_1.add(btnA, gbc_btnA);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblOperations = new JLabel("Operations");
		panel.add(lblOperations);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JLabel lblOrderOfOperations = new JLabel("Order of Operations");
		panel_2.add(lblOrderOfOperations);
	}
}
