package in.post.viewuser;

import java.util.Scanner;

import in.member.menu.MemberUpdate;
import in.post.menu.PostInsert;
import in.post.menu.PostSearch;
import in.post.menu.PostSearchDetail;
import in.start.main.StartMain;

public class PostUserMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("==================================게시판==================================");
			System.out.println("| 1.게시글 조회 | " + "| 2.게시글 상세조회 | " + "| 3.게시글 작성 | " + "| 4.내 정보 수정 | " + "| 5.로그아웃 |");
			System.out.println("========================================================================");
			System.out.print("번호 입력 : ");
			String choice = scanner.next();

			switch (choice) {
			case "1":
				PostSearch postSearch = new PostSearch();
				postSearch.excutePost(scanner);
				break;
			case "2":
				PostSearchDetail postSearchDetail = new PostSearchDetail();
				postSearchDetail.excutePost(scanner);
				break;
			case "3":
				PostInsert postInsert = new PostInsert();
				postInsert.excutePost(scanner);
				break;
			case "4":
				MemberUpdate memberUpdate = new MemberUpdate();
				memberUpdate.excuteMember(scanner);
				break;
			case "5":
				System.out.println("게시판을 종료합니다.");
				System.out.println();
				StartMain.main(null);
				break;
			default:
				System.out.println("1~4번을 입력하세요.");
				System.out.println();
				PostUserMain.main(null);
				break;
			}
		} while (true);

	}
}
