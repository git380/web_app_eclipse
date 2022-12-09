package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable{
	
	public Student() {
		super();
	}

	private String number;//int
	private String clas;
	private String name;

	private ArrayList<String> errMsgs = new ArrayList<String>();


	public void setStudent(String number,String clas,String name) {this.number = number;this.clas=clas;this.name=name;}

	public String getNumber() {return number;}
	public String getClas() {return clas;}
	public String getName() {return name;}


	public void addErrorMessage(String errMsg) {errMsgs.add(errMsg);}
	public ArrayList<String> getErrorMessage() {return errMsgs;}
}