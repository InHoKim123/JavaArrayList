package in.member.menu;

import java.util.Scanner;

import in.member.command.MemberCommand;
import in.member.service.MemberService;


public class MemberDelete implements MemberService{

	@Override
	public MemberCommand excuteMember(Scanner scanner) {
		System.out.println("========회원 삭제 페이지========");
		System.out.println("삭제할 회원의 아이디를 입력하세요.");
		System.out.print("아이디 입력 : ");
		
		String id = scanner.next();
		boolean pass = false;
		
		if (MemberList.size() > 0) {
			for (int i = 0; i < MemberList.size(); i++) {
				if (id.equals(MemberList.get(i).getId()) && MemberList.get(i).getManagerNum() == 1) {
					pass = true;
					MemberList.remove(i);
					System.out.println("회원을 삭제했습니다.");
					System.out.println();
				}else if (id.equals(MemberList.get(i).getId()) && MemberList.get(i).getManagerNum() == 0) {
					pass = true;
					System.out.println("※관리자 계정은 삭제할 수 없습니다.※");
				}
			}
			
			if (!pass) {
				System.out.println("없는 아이디 입니다. 다시 입력하세요.");
			}
		}else {
			System.out.println("등록된 회원이 없습니다.");
		}
		
		return null;
	}

}
