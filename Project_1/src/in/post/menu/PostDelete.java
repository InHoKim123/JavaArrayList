package in.post.menu;

import java.util.Scanner;

import in.post.command.PostCommand;
import in.post.service.PostService;

public class PostDelete implements PostService{

	@Override
	public PostCommand excutePost(Scanner scanner) {
		System.out.println("==============게시글 삭제==============");
		if (PostList.size() > 0) {
			System.out.println("삭제할 글의 번호를 입력하세요");
			System.out.print("번호 : ");
			int num = scanner.nextInt();
			boolean pass = false;
			
			for (int i = 0; i < PostList.size(); i++) {
				if (num == PostList.get(i).getNum()) {
					pass = true;
					PostList.remove(i);
					System.out.println("삭제하였습니다.");
					System.out.println();
				}
			}
			
			if (!pass) {
				System.out.println("해당 번호와 일치하는 글이 없습니다.");
			}
		}else {
			System.out.println("등록된 게시글이 없습니다.");
		}
		return null;
	}

}
