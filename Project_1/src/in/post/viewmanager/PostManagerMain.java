package in.post.viewmanager;

import java.util.Scanner;

import in.member.menu.MemberDelete;
import in.member.menu.MemberSearch;
import in.member.menu.MemberSearchDetail;
import in.post.menu.PostDelete;
import in.post.menu.PostInsert;
import in.post.menu.PostSearch;
import in.post.menu.PostSearchDetail;
import in.post.menu.PostUpdate;
import in.start.main.StartMain;

public class PostManagerMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		do {		
			System.out.println("====================================관리자 게시판====================================");
			System.out.println("| 1.게시글 조회 | " + "| 2.게시글 상세조회 | " + "| 3.게시글 삭제 | " + "| 4.게시글 수정 | " + "| 5.게시글 작성 |");
			System.out.println("| 6.회원검색 | " + "| 7. 회원 상세검색 | " + "| 8.회원삭제 | " + "| 9.관리자 종료 |");
			System.out.println("=================================================================================");
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
				PostDelete postDelete = new PostDelete();
				postDelete.excutePost(scanner);
				break;
			case "4":
				PostUpdate postUpdate = new PostUpdate();
				postUpdate.excutePost(scanner);
				break;
			case "5":
				PostInsert postInsert = new PostInsert();
				postInsert.excutePost(scanner);
				break;
			case "6":
				MemberSearch memberSearch = new MemberSearch();
				memberSearch.excuteMember(scanner);
				break;
			case "7":
				MemberSearchDetail memberSearchDetail = new MemberSearchDetail();
				memberSearchDetail.excuteMember(scanner);
				break;
			case "8":
				MemberDelete memberDelete = new MemberDelete();
				memberDelete.excuteMember(scanner);
				break;
			case "9":
				System.out.println("게시판을 종료합니다.");
				System.out.println();
				StartMain.main(null);
				break;
			default:
				System.out.println("1~9번을 입력하세요.");
				System.out.println();
				PostManagerMain.main(null);
				break;
			}
		} while (true);
	}
}
