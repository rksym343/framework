package book_basic_panel;

import java.awt.Component;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.JComboBox;

public class ComboBoxPanel<T> extends CompPanel {

	private JComboBox<T> comboBox;

	public ComboBoxPanel() {
		pValue.setLayout(new GridLayout(1, 0, 0, 0));

		comboBox = new JComboBox();
		pValue.add(comboBox);

	}

	public JComboBox<T> getComboBox() {
		return comboBox;
	}

	public T getCombT() {
		return (T) comboBox.getSelectedItem();
	}

	public void setComboBox(T item) {
		comboBox.addItem(item);
		comboBox.setSelectedIndex(0);
	}

	public void setSelected(int i) {
		comboBox.setSelectedIndex(i);
	}

	public void setSelectedTT(T item) {
		comboBox.setSelectedItem(item);
	}

}
