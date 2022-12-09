package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {

	private String id;
	private String password;
	
	private ArrayList<String> errMsgs = new ArrayList<String>();

	public Student() {}

	public Student(String id, String password) {this.id = id;this.password = password;}

	public String getId() {return id;}

	public String getPassword() {return password;}

	public void getId(String id) {this.id = id;}

	public void getPassword(String password) {this.password = password;}
	
	public void addErrorMessage(String errMsg) {errMsgs.add(errMsg);}
	public ArrayList<String> getErrorMessage() {return errMsgs;}
}