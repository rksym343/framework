package book_view_panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import javax.swing.JButton;
import book_panel.MemberInfo;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Font;

public class InformDetailPanel extends informSizePanel {

	protected JButton btnDel;
	protected JLabel lblTitle;
	protected JPanel panel_2;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;

	/**
	 * Create the panel.
	 */
	public InformDetailPanel() {
		setBounds(new Rectangle(0, 0, 650, 450));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 650, 41);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(10);
		flowLayout.setHgap(20);
		add(panel);
		
		lblTitle = new JLabel("New label");
		lblTitle.setFont(new Font("굴림", Font.BOLD, 18));
		lblTitle.setBounds(new Rectangle(20, 20, 0, 0));
		panel.add(lblTitle);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 51, 650, 389);
		add(panel_1);
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 650, 319);
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		panel_2.setLayout(new BorderLayout(0, 0));
		panel_2.setLayout(new BorderLayout(0, 0));
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		panel_9 = new JPanel();
		panel_9.setBounds(0, 329, 650, 50);
		panel_1.add(panel_9);
		panel_9.setLayout(new GridLayout(1, 1, 0, 0));
		
		panel_8 = new JPanel();
		panel_9.add(panel_8);
		
		panel_7 = new JPanel();
		panel_9.add(panel_7);
		
		JPanel panel_6 = new JPanel();
		panel_9.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnDel = new JButton("버튼");
		panel_6.add(btnDel);
		
		panel_4 = new JPanel();
		panel_9.add(panel_4);
		
		panel_5 = new JPanel();
		panel_9.add(panel_5);

	}
	
	public void setOption(String title, String button){
		lblTitle.setText(title);
		btnDel.setText(button);
	}

}
