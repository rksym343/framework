package book_view_panel;

import javax.swing.JPanel;
import book_panel.MemberInfo;

public class MemberSearchMemberDetailView extends InformDetailPanel {


	public MemberSearchMemberDetailView() {
		
		MemberInfo panel = new MemberInfo();
		pContent.add(panel);
		setOption("- 회원정보 -", "탈퇴");

	}

}
