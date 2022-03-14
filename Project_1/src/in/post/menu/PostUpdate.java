package in.post.menu;

import java.util.Scanner;

import in.post.command.PostCommand;
import in.post.service.PostService;

public class PostUpdate implements PostService{

	@Override
	public PostCommand excutePost(Scanner scanner) {
		
		PostCommand postCommand = new PostCommand();
		System.out.println("==============게시글 수정==============");
		if (PostList.size() > 0) {
			System.out.println("수정할 게시글의 번호와 제목을 입력하세요");
			System.out.print("번호 : ");
			int num = scanner.nextInt();
			System.out.print("제목 : ");
			String name = scanner.next();
			boolean pass = false;
			
			for (int i = 0; i < PostList.size(); i++) {
				if (num == PostList.get(i).getNum() && name.equals(PostList.get(i).getPostName())) {
					pass =  true;
					PostList.remove(i);
				}
			}
			
			if (!pass) {
				System.out.println("수정할 글의 번호와 제목이 일치하지 않습니다.");
				System.out.println();
			}else {
				System.out.println("게시글을 수정하세요");
				System.out.print("제목 :");
				String postname = scanner.next();
				System.out.print("내용 :");
				String content = scanner.next();
				
				postCommand.setNum(num);
				postCommand.setPostWriter(name);
				postCommand.setPostName(postname);
				postCommand.setPostContent(content);
				
				PostList.add(postCommand);
			}
		}//if
		return null;
	}

}
