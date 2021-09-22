package javaday3;

public class Student {
	private String name;
	private int id;
	private String branch;
	private long phn;
	
	
	
	public Student(String name) {
		
		this.name = name;
	}
	
	
	
	
	
	public Student(String name, int id) {
		this(name);
		this.id = id;
	}
	Student(String name,int id,String branch)
	{
		this(name,id);
		this.branch=branch;
	}
	Student(String name,int id,String branch,long phn)
	{
		this(name,id,branch);
		this.phn =phn;
	}





	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public long getPhn() {
		return phn;
	}
	public void setPhn(long phn) {
		this.phn = phn;
	}
	

}
