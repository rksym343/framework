package frameworks;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import panel.ReturnManageContent;

public class ReturnManage extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReturnManage frame = new ReturnManage();
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
	public ReturnManage() {
		setTitle("반납관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		ReturnManageContent panel = new ReturnManageContent();
		contentPane.add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\uB3C4\uC11C\uCF54\uB4DC", "\uB3C4\uC11C\uBA85", "\uD68C\uC6D0\uCF54\uB4DC", "\uD68C\uC6D0\uBA85", "\uB300\uC5EC\uC77C"
			}
		));
		scrollPane.setViewportView(table);
	}

}
