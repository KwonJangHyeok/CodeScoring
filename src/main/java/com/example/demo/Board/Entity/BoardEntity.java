package com.example.demo.Board.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ScoreSystem")
public class BoardEntity {

	@Id
	public String _id;
	public String name;
	public String language;
	public String content;
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
		return "BoardEntity [name=" + name + ", language=" + language + ", content=" + content + ", result=" + result
				+ ", timestamp=" + timestamp + "]";
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
	public String result;
	public String timestamp;
}
