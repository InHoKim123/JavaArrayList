package in.post.menu;

import java.util.Scanner;

import in.post.command.PostCommand;
import in.post.service.PostService;

public class PostSearch implements PostService{

	@Override
	public PostCommand excutePost(Scanner scanner) {
		System.out.println("==============게시글 조회==============");
		if (PostList.size() > 0) {
			for (int i = 0; i < PostList.size(); i++) {
				System.out.print("[" + PostList.get(i).getNum() + "] " + "[작성자 : " + PostList.get(i).getPostWriter() + "]" + "[제목 : " + PostList.get(i).getPostName() + "]");
				System.out.print("[내용 : " + PostList.get(i).getPostContent() + "]");
				System.out.println();
				System.out.println();
			}
		}else {
			System.out.println("등록된 글이 없습니다.");
			System.out.println();
		}
		return null;
	}

}
