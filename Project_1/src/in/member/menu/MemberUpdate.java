package in.member.menu;

import java.util.Scanner;

import in.member.command.MemberCommand;
import in.member.service.MemberService;


public class MemberUpdate implements MemberService{

	@Override
	public MemberCommand excuteMember(Scanner scanner) {
		MemberCommand memberCommand = new MemberCommand();
		System.out.println("==================회원 정보 수정==================");
		System.out.println("수정할 아이디와 비밀번호를 입력하세요.");
		if (MemberList.size() > 0) {
			System.out.print("아이디 : ");
			String id = scanner.next();
			System.out.print("비밀번호 : ");
			String passwd = scanner.next();
			boolean pass = false;
			
			//아이디와 비밀번호가 같으면 boolean값 true
			for (int i = 0; i < MemberList.size(); i++) {
				if (id.equals(MemberList.get(i).getId()) && passwd.equals(MemberList.get(i).getPasswd())) {
					pass = true;
					MemberList.remove(i);
				}
			}
			
			if (!pass) {
				System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
			}else {
				System.out.println("수정할 내용을 입력하세요.");
				System.out.print("비밀번호 : ");
				String otpasswd = scanner.next();
				System.out.print("이름 : ");
				String otname = scanner.next();
				System.out.print("닉네임 : ");
				String otnicname = scanner.next();
				System.out.print("이메일 : ");
				String otemail = scanner.next();
				
				memberCommand.setEmail(otemail);
				memberCommand.setId(id);
				memberCommand.setManagerNum(1); //일반유저 아이디 생성시 관리자권한 x
				memberCommand.setName(otname);
				memberCommand.setNicname(otnicname);
				memberCommand.setPasswd(otpasswd);
				
				MemberList.add(memberCommand);
			}
			
		}//if
		return memberCommand;
	}

}
