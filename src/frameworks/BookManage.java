package frameworks;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import book_basic_panel.InputComp;
import kr.or.dgit.book_project.dao.BookDao;
import kr.or.dgit.book_project.dto.Book;
import panel.BookManagePanel;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class BookManage extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton bAdd;
	private JButton bClear;
	private BookManagePanel pContent;
	private JScrollPane scrollPane;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookManage frame = new BookManage();
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
	public BookManage() {
		setTitle("도서관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 617);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

		pContent = new BookManagePanel();
		for (Component c : pContent.getComponents()) {
			if (c instanceof InputComp) {
				InputComp ic = (InputComp) c;
				ic.addFocusListener(l);
			}
		}
		contentPane.add(pContent);

		JPanel pBtn = new JPanel();
		bAdd = new JButton("추가");
		bAdd.addActionListener(this);
		pBtn.add(bAdd);

		bClear = new JButton("취소");
		pBtn.add(bClear);
		contentPane.add(pBtn);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bAdd) {
			pContent.clearAll();
			if (pContent.isValidCheck()) {
				bSave.setEnabled(true);
			}
		}
		if (e.getSource() == bClear) {
			// 도서관리 프로그램 종료.
			System.exit(0); // ??
		}

	}

}
