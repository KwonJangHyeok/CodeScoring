package com.example.demo.Login.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ScoreSystem")
public class LoginEntity {

	@Id
	public String _id;
	public String userid;
	public String pw;
	public String get_id() {
		return _id;
	}
	@Override
	public String toString() {
		return "LoginEntity [_id=" + _id + ", userid=" + userid + ", pw=" + pw + "]";
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
}
