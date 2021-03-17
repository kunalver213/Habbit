package com.kindsonthegenius.thymeleafapp.models;

import java.util.List;


public class LfcContinue {
	
	private String pernr;
	private String elgAmt;
	private String totTrav;
	private String totElgAmt;
	private String totClmAmt;
	private String totTaxAmt;
	private String incTax;
	private String eduCess;
	private String totTaxDed;
	private String payAmt;
	private String accept;
	private String cont;
	private String msg;	
	private String lfcSet;	
	private String entlClsCode;	
	private String scheme;	
	private List<LfcContSubmitList> submitexpandSet;
	private String errorStatus;
	
	
	public String getLfcSet() {
		return lfcSet;
	}
	public void setLfcSet(String lfcSet) {
		this.lfcSet = lfcSet;
	}
	public String getEntlClsCode() {
		return entlClsCode;
	}
	public void setEntlClsCode(String entlClsCode) {
		this.entlClsCode = entlClsCode;
	}
	
	public String getScheme() {
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	public String getErrorStatus() {
		return errorStatus;
	}
	public void setErrorStatus(String errorStatus) {
		this.errorStatus = errorStatus;
	}
	
	public String getPernr() {
		return pernr;
	}
	public void setPernr(String pernr) {
		this.pernr = pernr;
	}
	public String getElgAmt() {
		return elgAmt;
	}
	public void setElgAmt(String elgAmt) {
		this.elgAmt = elgAmt;
	}
	public String getTotTrav() {
		return totTrav;
	}
	public void setTotTrav(String totTrav) {
		this.totTrav = totTrav;
	}
	public String getTotElgAmt() {
		return totElgAmt;
	}
	public void setTotElgAmt(String totElgAmt) {
		this.totElgAmt = totElgAmt;
	}
	public String getTotClmAmt() {
		return totClmAmt;
	}
	public void setTotClmAmt(String totClmAmt) {
		this.totClmAmt = totClmAmt;
	}
	public String getTotTaxAmt() {
		return totTaxAmt;
	}
	public void setTotTaxAmt(String totTaxAmt) {
		this.totTaxAmt = totTaxAmt;
	}
	public String getIncTax() {
		return incTax;
	}
	public void setIncTax(String incTax) {
		this.incTax = incTax;
	}
	public String getEduCess() {
		return eduCess;
	}
	public void setEduCess(String eduCess) {
		this.eduCess = eduCess;
	}
	public String getTotTaxDed() {
		return totTaxDed;
	}
	public void setTotTaxDed(String totTaxDed) {
		this.totTaxDed = totTaxDed;
	}
	public String getPayAmt() {
		return payAmt;
	}
	public void setPayAmt(String payAmt) {
		this.payAmt = payAmt;
	}
	public String getAccept() {
		return accept;
	}
	public void setAccept(String accept) {
		this.accept = accept;
	}
	public String getCont() {
		return cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<LfcContSubmitList> getSubmitexpandSet() {
		return submitexpandSet;
	}
	public void setSubmitexpandSet(List<LfcContSubmitList> submitexpandSet) {
		this.submitexpandSet = submitexpandSet;
	}
	

}
