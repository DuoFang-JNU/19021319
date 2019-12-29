package gover;

public class User{
	private int id;
	private String name;
	private float dataA;
	private float dataB;
	public int getid(){
		return id;
	}
	public void setid(int id){
		this.id=id;
	}public String getname(){
		return name;
	}
	public void setname(String name){
		this.name=name;
	}
	public float getDataA(){
		return dataA;
	}
	public void setDataA(float dataA){
		this.dataA=dataA;
	}
	public float getDataB(){
		return dataB;
	}
	public void setDataB(float dataB){
		this.dataB=dataB;
	}
	public User(int id,String name,float dataA,Float dataB){
		super();
		this.id=id;
		this.name=name;
		this.dataA=dataA;
		this.dataB=dataB;
	}
}