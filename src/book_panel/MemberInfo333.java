package book_panel;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

import book_basic_panel.InputComp;

public class MemberInfo333 extends JPanel {
	private JTextField textField;
	protected JPanel panel_10;

	/**
	 * Create the panel.
	 */
	public MemberInfo333() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panelM = new JPanel();
		add(panelM);
		panelM.setLayout(new GridLayout(1, 0, 10, 0));
		
		JPanel panel_1 = new JPanel();
		panelM.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 10));
		
		InputComp panel_3 = new InputComp();
		panel_3.setTitle("회원코드");
		panel_1.add(panel_3);
		
		InputComp panel_4 = new InputComp();
		panel_4.setTitle("성      명");
		panel_1.add(panel_4);
		
		InputComp panel_5 = new InputComp();
		panel_5.setTitle("전화번호");
		panel_1.add(panel_5);
		
		InputComp panel_6 = new InputComp();
		panel_6.setTitle("우편번호");
		panel_1.add(panel_6);
		
		InputComp panel_7 = new InputComp();
		panel_7.setTitle("주      소");
		panel_1.add(panel_7);
		
		JPanel panel = new JPanel();
		panelM.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 10));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JPanel panel_8 = new JPanel();
		panel.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel.add(panel_9);
		
		panel_10 = new JPanel();
		panel.add(panel_10);
		panel_10.setLayout(null);
		
		JPanel panel_11 = new JPanel();
		panel.add(panel_11);
		panel_11.setLayout(new GridLayout(1, 0, 0, 0));
		
		textField = new JTextField();
		panel_11.add(textField);
		textField.setColumns(10);

	}

}
