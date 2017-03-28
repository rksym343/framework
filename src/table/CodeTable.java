package coffee.table;

import javax.swing.SwingConstants;

import coffee.content.CodeContent;
import coffee.dao.CoffeeCodeDao;
import coffee.dto.Product;

import java.util.Vector;

@SuppressWarnings("serial")
public class CodeTable extends AbsTable<Product> {

	private CodeContent pCodeContent;
	private Vector<Product> vt;

	@Override
	protected void cellWith() {
		tableSetWidth(100, 250);
	}

	@Override
	protected void CellAlign() {
		tableCellAlignment(SwingConstants.CENTER, 0, 1);
	}
	@Override
	protected Object[][] getRowData() {
		Object[][] datas = new Object[vt.size()][];
		for (int i = 0; i < datas.length; i++) {
			datas[i] = vt.get(i).toArray();
		}
		return datas;
	}

	public void setVt(Vector<Product> vt) {
		this.vt = vt;
	}

	@Override
	protected Object[] getColumn() {
		return new String[] { "제품코드", "제품명" };
	}

	@Override
	public Product getSelectedObject() {
		int selectedIdx = table.getSelectedRow();
		if (selectedIdx == -1) {
			return null;
		}
		String code = (String) table.getValueAt(selectedIdx, 0);
		Product cCode = CoffeeCodeDao.getInstance().seleteItemByNo(new Product(code));
		return cCode;
	}

	@Override
	protected void updateData(Product t) {
		pCodeContent.setValue(t);
	}
	
	@Override
	protected void deleteItem(Product t) {
		CoffeeCodeDao.getInstance().deleteItem(t);
	}

	public void setpCodeContent(CodeContent pCodeContent) {
		this.pCodeContent = pCodeContent;
	}



}
