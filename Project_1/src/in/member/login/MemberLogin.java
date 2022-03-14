package in.member.login;

import java.util.Scanner;

import in.member.command.MemberCommand;
import in.member.menu.MemberInsert;
import in.member.service.MemberService;
import in.post.viewmanager.PostManagerMain;
import in.post.viewuser.PostUserMain;
import in.start.main.StartMain;

public class MemberLogin implements MemberService{

	@Override
	public MemberCommand excuteMember(Scanner scanner) {
		
		MemberCommand memberCommand = new MemberCommand();
		
		System.out.println("======로그인 페이지======");
				
		if (MemberList.size() > 0) {		//List에 값이 있는지 검사
			System.out.println("아이디 비밀번호를 입력하세요.");
			System.out.print("아이디 : ");
			String id = scanner.next();
			System.out.print("비밀번호 : ");
			String passwd = scanner.next();	
			boolean pass = false;			//로그인 실패 boolean값
			
			for (int i = 0; i < MemberList.size(); i++) {	
				//아이디와 비밀번호가 모두 일치하면 로그인 성공
				if (id.equals(MemberList.get(i).getId()) && passwd.equals(MemberList.get(i).getPasswd()) && MemberList.get(i).getManagerNum() == 1) {
					pass = true;	//boolean값 true
					System.out.println(MemberList.get(i).getNicname() + "님 반갑습니다.");
					System.out.println();
					PostUserMain.main(null); //유저 게시판으로 이동
					break;
				//관리자 계정 로그인 성공
				}else if (id.equals(MemberList.get(i).getId()) && passwd.equals(MemberList.get(i).getPasswd()) && MemberList.get(i).getManagerNum() == 0) {
					pass = true;
					System.out.println(MemberList.get(i).getNicname() + "님 반갑습니다.");
					System.out.println();
					PostManagerMain.main(null); //관리자 게시판으로 이동
				}
			}		
			//만약 boolean값이 false라면
			if (!pass) {
				System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
				System.out.println();
			}
		}else { //리스트에 값이 없으면
			System.out.println("등록된 회원이 없습니다. 회원가입 하시겠습니까?");
			System.out.println("| 1.회원가입 | " + "| 2.돌아가기 |");
			System.out.print("번호 입력 : ");
			String choiceTorY = scanner.next();
			
			switch (choiceTorY) {
			case "1":
				System.out.println();
				MemberInsert memberInsert = new MemberInsert();
				memberInsert.excuteMember(scanner);
				break;
			case "2":
				System.out.println();
				StartMain.main(null);
				break;
			default:
				System.out.println("1번과 2번중 하나를 선택하세요");
				System.out.println();
				StartMain.main(null);
				break;
			}
		}
		
		
		return memberCommand;
	}

}
