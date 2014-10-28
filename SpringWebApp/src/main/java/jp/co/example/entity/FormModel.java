package jp.co.example.entity;

import java.io.Serializable;

public class FormModel  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String input1;
	private String pass1;
	private String area1;
	private Boolean chk1;

	public String getInput1() {
		return input1;
	}

	public void setInput1(String input1) {
		this.input1 = input1;
	}

	public String getPass1() {
		return pass1;
	}

	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}

	public String getArea1() {
		return area1;
	}

	public void setArea1(String area1) {
		this.area1 = area1;
	}

	public boolean isChk1() {
		return chk1;
	}

	public void setChk1(boolean chk1) {
		this.chk1 = chk1;
	}
	
	
}
