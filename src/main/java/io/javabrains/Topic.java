package io.javabrains;



public class Topic {
	
	
	private String Id;
	private String name;
	private String desp;
	

	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesp() {
		return desp;
	}
	public void setDesp(String desp) {
		this.desp = desp;
	}
	
	public Topic() {
		
	}
	
	public Topic(String id, String name, String desp) {
		super();
		Id = id;
		this.name = name;
		this.desp = desp;
	}
	
}
