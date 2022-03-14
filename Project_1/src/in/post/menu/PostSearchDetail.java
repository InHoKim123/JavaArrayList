package in.post.menu;

import java.util.Scanner;

import in.post.command.PostCommand;
import in.post.service.PostService;

public class PostSearchDetail implements PostService {

	private Scanner scanner;

	@Override
	public PostCommand excutePost(Scanner scanner) {
		System.out.println("==============게시글 상세조회==============");
		if (PostList.size() > 0) {
			String choice = ChoiceSearch(); //choice에 리턴받은 값 대입
			
			if (choice.equals("작성자")) { //작성자로 글 찾기
				System.out.print("작성자 : ");
				String id = scanner.next();
				boolean pass = false;
				System.out.println("=======================================");
				System.out.println(id + "님이 작성한 글 목록 입니다.");
				for (int i = 0; i < PostList.size(); i++) {
					if (id.equals(PostList.get(i).getPostWriter())) {
						pass = true;								
						System.out.print("[" + PostList.get(i).getNum() + "] " +  "[작성자 : " + PostList.get(i).getPostWriter() + "]" + "[제목 : " + PostList.get(i).getPostName() + "]");
						System.out.print("[내용 : " + PostList.get(i).getPostContent() + "]");
						System.out.println();
						System.out.println();
					}
				}
				//일치하는 작성자가 없다면
				if (!pass) {
					System.out.println("해당 작성자가 등록한 글이 없습니다.");
					System.out.println();
				}
			}
			else if (choice.equals("제목")) { //제목으로 글 찾기
				System.out.print("제목 : ");
				String name = scanner.next();
				boolean pass = false;
				for (int i = 0; i < PostList.size(); i++) {
					if (name.equals(PostList.get(i).getPostName())) {
						pass = true;
						System.out.println("=======================================");
						System.out.print("[" + PostList.get(i).getNum() + "] " + "[작성자 : " + PostList.get(i).getPostWriter() + "]" + "[제목 : " + PostList.get(i).getPostName() + "]");
						System.out.print("[내용 : " + PostList.get(i).getPostContent() + "]");
						System.out.println();
						System.out.println();
					}
				}
				//일치하는 제목의 글이 없다면
				if (!pass) {
					System.out.println("해당 제목의 글이 없습니다.");
				}
			}
		}else {
			System.out.println("등록된 글이 없습니다.");
			System.out.println();
		}
		
		
		return null;
		
	}
	//번호 선택
	public String ChoiceSearch() {
		scanner = new Scanner(System.in);
		System.out.println("| 1.작성자로 검색 | " + "| 2.제목으로 검색 |");
		System.out.print("번호 입력 : ");
		String choice = scanner.next();
		
		switch (choice) {
		case "1":
			choice = "작성자";
			break;
		case "2":
			choice = "제목";
			break;
		default:
			System.out.println("1~2번을 고르세요");
			break;
		}
		//choice 리턴
		return choice;
		
		
	}
	
}
