package in.post.menu;

import java.util.Scanner;

import in.post.command.PostCommand;
import in.post.service.PostService;
import in.post.viewmanager.PostManagerMain;

public class PostInsert implements PostService{

	@Override
	public PostCommand excutePost(Scanner scanner) {
		
		PostCommand postCommand = new PostCommand();
		
		System.out.println("==============게시글 작성==============");
		
		if (PostList.size() >= 0) {
			
			System.out.print("글번호 : ");
			int num = scanner.nextInt();
			
			for (int i = 0; i < PostList.size(); i++) {
				if (num == PostList.get(i).getNum()) {
					System.out.println("번호가 같은 글이 있습니다. 다시 입력하세요.");
					PostManagerMain.main(null);
				}
			}
			
			System.out.print("작성자 닉네임 입력 : ");
			String postWriter = scanner.next();			
			System.out.print("제목 : ");
			String postName = scanner.next();
			System.out.print("내용 : ");
			String postContent = scanner.next();
			
			postCommand.setNum(num);
			postCommand.setPostContent(postContent);
			postCommand.setPostName(postName);
			postCommand.setPostWriter(postWriter);
			
			PostList.add(postCommand);
			System.out.println("글작성이 완료되었습니다.");
			System.out.println();
		}
		
		
		return postCommand;
	}

}
