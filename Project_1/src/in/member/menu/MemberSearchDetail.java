package in.member.menu;

import java.util.Scanner;

import in.member.command.MemberCommand;
import in.member.service.MemberService;


public class MemberSearchDetail implements MemberService{

	@Override
	public MemberCommand excuteMember(Scanner scanner) {
		System.out.println("===========회원  상세 조회===========");
		
		if (MemberList.size() > 0) {
			System.out.println("아이디를 입력하여 해당 회원의 정보를 가져옵니다..");
			System.out.print("아이디 : ");
			String id = scanner.next();
			boolean pass = false;
			
			for (int i = 0; i < MemberList.size(); i++) {
				if (id.equals(MemberList.get(i).getId())) {
					pass = true;
				}
			}
			
			if (!pass) {
				System.out.println("=================================================================================");
				System.out.println("해당 아이디를 가진 회원이 없습니다.");
			}else {
				System.out.println("=================================================================================");
				for (int i = 0; i < MemberList.size(); i++) {
					if (id.equals(MemberList.get(i).getId())) {
						System.out.print("| 아이디 : " + MemberList.get(i).getId() + " | ");
						System.out.print("| 비밀번호 : " + MemberList.get(i).getPasswd() + " | ");
						System.out.print("| 이름 : " + MemberList.get(i).getName() + " | ");
						System.out.print("| 닉네임 : " + MemberList.get(i).getNicname() + " | ");
						System.out.print("| 이메일 : " + MemberList.get(i).getEmail() + " | ");
						System.out.println("| 관리자 여부 : " + MemberList.get(i).getManagerNum() + " | ");
					}
				}
				
				System.out.println("=================================================================================");
				System.out.println();
			}
		}else {
			System.out.println("회원이 없습니다.");
		}
		
		
		
		return null;
	}

}
