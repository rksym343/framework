package coffee.table;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import coffee.content.MainContent;
import coffee.dao.SalesDao;
import coffee.dto.Product;
import coffee.dto.Sale;

public class PrintTable extends AbsTable<Sale> {
	private MainContent pContent;
	private String idx;

	protected Object[][] getdatas() {
		Object[][] list = null;
		if (idx.equals("margin_price")) {
			list = SalesDao.getInstance().orderByMargin();
		} else if (idx.equals("sale_price")) {
			list = SalesDao.getInstance().orderBySalePrice();

		}
		return list;
	};

	@Override
	protected Object[][] getRowData() {
		Object[][] list = getdatas();
		Object[][] datas = new Object[list.length + 1][];
		System.arraycopy(list, 0, datas, 0, list.length);
		datas[datas.length - 1] = setLastLine(datas);
		setNumFormat(datas);
		return datas;
	}

	@Override
	protected Object[] getColumn() {
		return new String[] { "순위", "제품코드", "제품명", "제품단가", "판매수량", "공급가액", "부가세액", "판매금액", "마진율", "마진액" };
	}

	@Override
	protected void cellWith() {
		tableSetWidth(40, 60, 100, 80, 60, 80, 80, 80, 50, 80);
	}

	@Override
	protected void CellAlign() {
		tableCellAlignment(SwingConstants.CENTER, 0, 1);
		tableCellAlignment(SwingConstants.LEFT, 2);
		tableCellAlignment(SwingConstants.RIGHT, 3, 4, 5, 6, 7, 8, 9);
	}

	@Override
	public Sale getSelectedObject() {
		int selectedIdx = table.getSelectedRow();
		if (selectedIdx == -1) {
			return null;
		}
		String code = (String) table.getValueAt(selectedIdx, 1);
		String name = (String) table.getValueAt(selectedIdx, 2);
		Sale sale = SalesDao.getInstance().seleteItemByNo(new Sale(new Product(code, name)));
		return sale;
	}

	public Object[] setLastLine(Object[][] datas) {
		Object[] objArr = new Object[datas[0].length];
		objArr[0] = "합계";
		objArr[5] = getSum(datas, 5);
		objArr[6] = getSum(datas, 6);
		objArr[7] = getSum(datas, 7);
		objArr[9] = getSum(datas, 9);
		return objArr;
	}

	public int getSum(Object[][] datas, int idx) {
		int sum = 0;
		for (int i = 0; i < datas.length - 1; i++) {
			sum += (int) datas[i][idx];
		}
		return sum;
	}

	public void setNumFormat(Object[][] datas) {
		int[] numArr1 = { 3, 4, 5, 6, 7, 8, 9 };
		int[] numArr2 = { 5, 6, 7, 9 };
		for (int i = 0; i < datas.length; i++) {
			if (i != datas.length - 1) {
				for (int j = 0; j < numArr1.length; j++) {
					datas[i][numArr1[j]] = String.format("%,d", datas[i][numArr1[j]]);
				}
			} else {
				for (int j = 0; j < numArr2.length; j++) {
					datas[i][numArr2[j]] = String.format("%,d", datas[i][numArr2[j]]);
				}
			}
		}
	}

	@Override
	protected void updateData(Sale t) {
		pContent.setValue(t);
	}

	@Override
	protected void deleteItem(Sale t) {
		SalesDao.getInstance().deleteItem(t);
	}

	public void setpContent(MainContent pContent) {
		this.pContent = pContent;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}

}
