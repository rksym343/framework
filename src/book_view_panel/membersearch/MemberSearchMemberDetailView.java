package book_view_panel.membersearch;

import javax.swing.JPanel;
import book_panel.MemberInfo333;
import book_view_panel.InformDetailPanel;

public class MemberSearchMemberDetailView extends InformDetailPanel {


	public MemberSearchMemberDetailView() {
		
		MemberInfo333 panel = new MemberInfo333();
		pContent.add(panel);
		setOption("- 회원정보 -", "탈퇴");

	}

}
