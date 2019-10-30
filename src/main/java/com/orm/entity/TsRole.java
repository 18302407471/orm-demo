package com.orm.entity;

public class TsRole {
	private String id ;
	private String code ;
	private String createTime ;
	private String name ;
	private String note ;
	private String operUsername ;
	
	public TsRole() {
	}

	public String getId(){
		return  id;
	}
	public void setId(String id ){
		this.id = id;
	}
	
	public String getCode(){
		return  code;
	}
	public void setCode(String code ){
		this.code = code;
	}
	
	public String getCreateTime(){
		return  createTime;
	}
	public void setCreateTime(String createTime ){
		this.createTime = createTime;
	}
	
	public String getName(){
		return  name;
	}
	public void setName(String name ){
		this.name = name;
	}
	
	public String getNote(){
		return  note;
	}
	public void setNote(String note ){
		this.note = note;
	}
	
	public String getOperUsername(){
		return  operUsername;
	}
	public void setOperUsername(String operUsername ){
		this.operUsername = operUsername;
	}
	

}