package com.stssm.github.io.javaweb.aaa006JDBC2022年6月18日.pojo;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa004JDBC2022年6月18日.pojo
 * bbb010User:  liujiajun_junw
 * Time:  2022-06-11-20  星期六
 *
 * @author 1
 */
public class DemoPojo {
	private Integer id;

	private String username;

	private String password;

	private String gender;

	private String addr;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "DemoPojo{" +
				       "id=" + id +
				       ", username='" + username + '\'' +
				       ", password='" + password + '\'' +
				       ", gender='" + gender + '\'' +
				       ", addr='" + addr + '\'' +
				       '}';
	}
}
