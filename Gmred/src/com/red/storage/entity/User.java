package com.red.storage.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private String id;
	private String password;
	private String name;
	private String mail;
	private String phone;
	private String cellphone;
	private String qq;
	private String wechat;
	private Date birthday;
	private String address;
	private String bankinfo;
	private String bankaccount;
	private Timestamp createtime;
	private Timestamp lastlogintime;
	private String lastloginip;
	private String memo;
	private String status;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String id, String password, String name, String mail,
			Timestamp createtime, Timestamp lastlogintime, String status) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.mail = mail;
		this.createtime = createtime;
		this.lastlogintime = lastlogintime;
		this.status = status;
	}

	/** full constructor */
	public User(String id, String password, String name, String mail,
			String phone, String cellphone, String qq, String wechat,
			Date birthday, String address, String bankinfo, String bankaccount,
			Timestamp createtime, Timestamp lastlogintime, String lastloginip,
			String memo, String status) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.mail = mail;
		this.phone = phone;
		this.cellphone = cellphone;
		this.qq = qq;
		this.wechat = wechat;
		this.birthday = birthday;
		this.address = address;
		this.bankinfo = bankinfo;
		this.bankaccount = bankaccount;
		this.createtime = createtime;
		this.lastlogintime = lastlogintime;
		this.lastloginip = lastloginip;
		this.memo = memo;
		this.status = status;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWechat() {
		return this.wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBankinfo() {
		return this.bankinfo;
	}

	public void setBankinfo(String bankinfo) {
		this.bankinfo = bankinfo;
	}

	public String getBankaccount() {
		return this.bankaccount;
	}

	public void setBankaccount(String bankaccount) {
		this.bankaccount = bankaccount;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public Timestamp getLastlogintime() {
		return this.lastlogintime;
	}

	public void setLastlogintime(Timestamp lastlogintime) {
		this.lastlogintime = lastlogintime;
	}

	public String getLastloginip() {
		return this.lastloginip;
	}

	public void setLastloginip(String lastloginip) {
		this.lastloginip = lastloginip;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}