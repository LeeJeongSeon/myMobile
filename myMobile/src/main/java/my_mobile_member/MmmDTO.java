package my_mobile_member;

public class MmmDTO {
	private String userid;
	private String userpw;
	private String name;
	private String email;
	private String hp;
	private String address;
	private String join_date;
	private String manager;
	private boolean is_manager;
	
	private int keyNum;

	@Override
	public String toString() {
		return "MmmDTO [userid=" + userid + ", userpw=" + userpw + ", name=" + name + ", email=" + email + ", hp=" + hp
				+ ", address=" + address + ", join_date=" + join_date + ", manager=" + manager + ", is_manager="
				+ is_manager + ", keyNum=" + keyNum + "]";
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJoin_date() {
		return join_date;
	}

	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public boolean isIs_manager() {
		if(manager=="o") {
			is_manager=true;
		}else {
			is_manager=false;
		}
		return is_manager;
	}

	public void setIs_manager(boolean is_manager) {
		this.is_manager = is_manager;
	}

	public int getKeyNum() {
		return keyNum;
	}

	public void setKeyNum(int keyNum) {
		this.keyNum = keyNum;
	}

	public MmmDTO(String userid, String userpw, String name, String email, String hp, String address, String join_date,
			String manager, boolean is_manager, int keyNum) {
		this.userid = userid;
		this.userpw = userpw;
		this.name = name;
		this.email = email;
		this.hp = hp;
		this.address = address;
		this.join_date = join_date;
		this.manager = manager;
		this.is_manager = is_manager;
		this.keyNum = keyNum;
	}

	public MmmDTO() {}

}
