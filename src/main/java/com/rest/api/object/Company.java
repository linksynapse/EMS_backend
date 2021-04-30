package com.rest.api.object;

public class Company {
	int Nonce;
	String Name;
	String UEN;
	String TypeOfWork;
	int TotalEmployee;
	public int getTotalEmployee() {
		return TotalEmployee;
	}
	public void setTotalEmployee(int totalEmployee) {
		TotalEmployee = totalEmployee;
	}
	public int getNonce() {
		return Nonce;
	}
	public void setNonce(int nonce) {
		Nonce = nonce;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUEN() {
		return UEN;
	}
	public void setUEN(String uEN) {
		if(uEN == "") {
			UEN = null;
		}else {
			UEN = uEN;
		}
	}
	public String getTypeOfWork() {
		return TypeOfWork;
	}
	public void setTypeOfWork(String typeOfWork) {
		TypeOfWork = typeOfWork;
	}
}
