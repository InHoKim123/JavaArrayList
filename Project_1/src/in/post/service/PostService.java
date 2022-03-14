package in.post.service;

import java.util.ArrayList;
import java.util.Scanner;

import in.post.command.PostCommand;

public interface PostService {

	ArrayList<PostCommand> PostList = new ArrayList<PostCommand>();
	
	public PostCommand excutePost(Scanner scanner);
}
