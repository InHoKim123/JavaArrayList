package in.member.service;

import java.util.ArrayList;
import java.util.Scanner;

import in.member.command.MemberCommand;


public interface MemberService {
	
	ArrayList<MemberCommand> MemberList = new ArrayList<MemberCommand>();
	
	public MemberCommand excuteMember(Scanner scanner);
}
