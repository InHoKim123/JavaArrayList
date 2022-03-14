package in.member.menu;

import java.util.Scanner;

import in.member.command.MemberCommand;
import in.member.service.MemberService;


public class MemberSearch implements MemberService{

	@Override
	public MemberCommand excuteMember(Scanner scanner) {
		System.out.println("==================회원 목록==================");
		System.out.println("전체 회원 수 : " + (MemberList.size() - 1)); //관리자 계정 제외
		System.out.println();
		if (MemberList.size() > 0) {
			for (int i = 0; i < MemberList.size(); i++) {
				System.out.print("이름 : " + MemberList.get(i).getName() + " | ");
				System.out.print("아이디 : " + MemberList.get(i).getId() + " | ");
				System.out.print("비밀번호 : " + MemberList.get(i).getPasswd() + " | ");
				System.out.print("이메일 : " + MemberList.get(i).getEmail() + " | ");
				System.out.print("닉네임 : " + MemberList.get(i).getNicname() + " | ");
				System.out.println("관리자 여부 : " + MemberList.get(i).getManagerNum() + " | ");			
			}
			
			System.out.println("=================================================================================");
			System.out.println();
		}
		return null;
	}

}
