package in.member.menu;

import java.util.Scanner;

import in.member.command.MemberCommand;
import in.member.service.MemberService;
import in.start.main.StartMain;

public class MemberInsert implements MemberService {

	@Override
	public MemberCommand excuteMember(Scanner scanner) {

		MemberCommand memberCommand = new MemberCommand();

		System.out.println("======회원가입 페이지======");
		System.out.println("정보를 입력하세요.");

		System.out.print("이름 : ");
		String name = scanner.next();

		System.out.print("아이디 : ");
		String id = scanner.next();
		
		//중복 아이디 검사
		for (int i = 0; i < MemberList.size(); i++) {
			if (id.equals(MemberList.get(i).getId())) {
				System.out.println("중복된 아이디가 있습니다.");
				System.out.println();
				StartMain.main(null);
			}
		}

		System.out.print("비밀번호 : ");
		String passwd = scanner.next();
		//비밀번호가 일치하는지 확인
		do {
			System.out.print("비밀번호 확인 : ");
			String passwdAgain = scanner.next();	
			if (!passwd.equals(passwdAgain)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요");
			}else if (passwd.equals(passwdAgain)) {
				break;
			}
		} while (true);
		
		System.out.print("이메일 : ");
		String email = scanner.next();
		System.out.print("닉네임 : ");
		String nicname = scanner.next();
		int managerNum = 1; //관리자 권한 x
		
		memberCommand.setName(name);
		memberCommand.setId(id);
		memberCommand.setPasswd(passwd);
		memberCommand.setEmail(email);
		memberCommand.setNicname(nicname);
		memberCommand.setManagerNum(managerNum);

		MemberList.add(memberCommand);
		System.out.println("회원가입을 완료했습니다.");
		System.out.println();

		return memberCommand;
	}

}
