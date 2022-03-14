/* 작성일 : 2022.03.07
 * 작성자 : 김인호 
 * 프로그램명 : console로 확인하는 사용자와 관리자로 나누어진 게시판
 * 사용 클래스 : Scanner, ArrayList
 * */

package in.start.main;

import java.util.Scanner;

import in.member.command.MemberCommand;
import in.member.login.MemberLogin;
import in.member.menu.MemberInsert;
import in.member.service.MemberService;

//관리자 계정 추가
class ManagerAdd implements MemberService {

	@Override
	public MemberCommand excuteMember(Scanner scanner) {
		MemberCommand memberCommand = new MemberCommand();

		if (MemberList.size() <= 0) { //관리자 계정 중복생성 방지
			String name = "관리자";
			String email = "kihkih1016@naver.com";
			String id = "1234";
			String passwd = "1234";
			String nicname = "관리자";
			int managerNum = 0;

			memberCommand.setId(id);
			memberCommand.setEmail(email);
			memberCommand.setManagerNum(managerNum);
			memberCommand.setName(name);
			memberCommand.setNicname(nicname);
			memberCommand.setPasswd(passwd);

			MemberList.add(memberCommand);

		}
		return memberCommand;
	}

}

public class StartMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ManagerAdd managerAdd = new ManagerAdd();
		managerAdd.excuteMember(null);

		do {

			String choiceNum;
			System.out.println("======메인화면입니다.======");
			System.out.println("번호를 선택하세요.");
			System.out.println("| 1.로그인 | " + "| 2.회원가입 | " + "| 3.종료 |");
			System.out.print("번호 입력 : ");
			choiceNum = scanner.next();

			switch (choiceNum) {
			case "1":
				System.out.println();
				MemberLogin memberLogin = new MemberLogin();
				memberLogin.excuteMember(scanner);
				break;
			case "2":
				System.out.println();
				MemberInsert memberInsert = new MemberInsert();
				memberInsert.excuteMember(scanner);
				break;
			case "3":
				System.out.println();
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("1번과 2번중 하나를 선택하세요.");
				System.out.println();
				StartMain.main(null);
				break;
			}
		} while (true);
	}
}
