package in.member.command;

public class MemberCommand {
	private String name;	//이름
	private String id;		//아이디
	private String passwd;	//비밀번호
	private String email;	//이메일
	private String nicname;	//닉네임
	private int managerNum;	//관리자 권한
	
	public int getManagerNum() {
		return managerNum;
	}
	public void setManagerNum(int managerNum) {
		this.managerNum = managerNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNicname() {
		return nicname;
	}
	public void setNicname(String nicname) {
		this.nicname = nicname;
	}

	
}
