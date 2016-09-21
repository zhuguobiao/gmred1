package com.red.storage.entity;

import java.sql.Timestamp;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private Integer id;
	private String number;
	private String name;
	private Integer parents;
	private String sales;
	private String address;
	private String country;
	private String province;
	private String city;
	private String zipcode;
	private String type;
	private String registeredlocation;
	private String registeredcapital;
	private String legalperson;
	private String annualaudit;
	private String icon;
	private String website;
	private String mailaddress;
	private String bankinfo;
	private String bankaccount;
	private String taxno;
	private String memo;
	private String createuser;
	private Timestamp createtime;
	private String updateuser;
	private Timestamp updatetime;

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(String name, Timestamp createtime, Timestamp updatetime) {
		this.name = name;
		this.createtime = createtime;
		this.updatetime = updatetime;
	}

	/** full constructor */
	public Customer(String number, String name, Integer parents, String sales,
			String address, String country, String province, String city,
			String zipcode, String type, String registeredlocation,
			String registeredcapital, String legalperson, String annualaudit,
			String icon, String website, String mailaddress, String bankinfo,
			String bankaccount, String taxno, String memo, String createuser,
			Timestamp createtime, String updateuser, Timestamp updatetime) {
		this.number = number;
		this.name = name;
		this.parents = parents;
		this.sales = sales;
		this.address = address;
		this.country = country;
		this.province = province;
		this.city = city;
		this.zipcode = zipcode;
		this.type = type;
		this.registeredlocation = registeredlocation;
		this.registeredcapital = registeredcapital;
		this.legalperson = legalperson;
		this.annualaudit = annualaudit;
		this.icon = icon;
		this.website = website;
		this.mailaddress = mailaddress;
		this.bankinfo = bankinfo;
		this.bankaccount = bankaccount;
		this.taxno = taxno;
		this.memo = memo;
		this.createuser = createuser;
		this.createtime = createtime;
		this.updateuser = updateuser;
		this.updatetime = updatetime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParents() {
		return this.parents;
	}

	public void setParents(Integer parents) {
		this.parents = parents;
	}

	public String getSales() {
		return this.sales;
	}

	public void setSales(String sales) {
		this.sales = sales;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegisteredlocation() {
		return this.registeredlocation;
	}

	public void setRegisteredlocation(String registeredlocation) {
		this.registeredlocation = registeredlocation;
	}

	public String getRegisteredcapital() {
		return this.registeredcapital;
	}

	public void setRegisteredcapital(String registeredcapital) {
		this.registeredcapital = registeredcapital;
	}

	public String getLegalperson() {
		return this.legalperson;
	}

	public void setLegalperson(String legalperson) {
		this.legalperson = legalperson;
	}

	public String getAnnualaudit() {
		return this.annualaudit;
	}

	public void setAnnualaudit(String annualaudit) {
		this.annualaudit = annualaudit;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getMailaddress() {
		return this.mailaddress;
	}

	public void setMailaddress(String mailaddress) {
		this.mailaddress = mailaddress;
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

	public String getTaxno() {
		return this.taxno;
	}

	public void setTaxno(String taxno) {
		this.taxno = taxno;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getCreateuser() {
		return this.createuser;
	}

	public void setCreateuser(String createuser) {
		this.createuser = createuser;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public String getUpdateuser() {
		return this.updateuser;
	}

	public void setUpdateuser(String updateuser) {
		this.updateuser = updateuser;
	}

	public Timestamp getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

}