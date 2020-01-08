package com.example.demo.Board.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "scoreLog")
public class BoardEntity {

	@Id
	public String _id;
	public String name;
	public String language;
	public String content;
	public String result;
	public String timestamp;
	public String title;
	public String number;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String userid;
	
	public String get_id() {
		return _id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getLanguage() {
		return language;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getlanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getResult() {
		return result;
	}
	@Override
	public String toString() {
		return "BoardEntity [_id=" + _id + ", name=" + name + ", language=" + language + ", content=" + content
				+ ", result=" + result + ", timestamp=" + timestamp + ", title=" + title + ", number=" + number
				+ ", userid=" + userid + "]";
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
}
