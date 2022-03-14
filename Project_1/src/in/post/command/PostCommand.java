package in.post.command;

public class PostCommand {

	private int num;
	private String postName;	//게시글 이름
	private String postPasswd;	//게시글 비번
	private String postWriter;	//게시글 작성자
	private String postContent;	//게시글 내용
	
	//private int viewers;
	//private String postKind;


	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public String getPostPasswd() {
		return postPasswd;
	}
	public void setPostPasswd(String postPasswd) {
		this.postPasswd = postPasswd;
	}
	public String getPostWriter() {
		return postWriter;
	}
	public void setPostWriter(String postWriter) {
		this.postWriter = postWriter;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	
}
