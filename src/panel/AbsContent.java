package panel;

import java.awt.Component;

import javax.swing.JPanel;

import book_basic_panel.InputComp;

public abstract class AbsContent<T> extends JPanel{

	
	protected boolean isEmptyCheck(){
		for (Component c : getComponents()) {
			if (c instanceof InputComp) {
				InputComp ic = (InputComp) c;
				if (ic.isEmpty()) {
					return true;
				}
			}
		}
		return false;
	}
	public void clearAll(){
		for (Component c : getComponents()) {
			if (c instanceof InputComp) {
				InputComp ic = (InputComp) c;
				((InputComp) c).setTFValue("");
			}
		}
	}
	public abstract boolean isValidCheck();
	public abstract T getValues();
	public abstract void setValues(T item);
}
