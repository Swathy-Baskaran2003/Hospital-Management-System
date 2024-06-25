public class Passenger{
	static int id=1;
	String name;
	int age;
	int passengerId;
	String berthpreference;//(l,m,u)
	String alloted;
	int number;
	public passenger(String name,int age,String berthpreference) {
		this.name=name;
		this.age=age;
		this.berthpreference=berthpreference;
		this.passengerId=id++;
		alloted="";
		number=-1;
		
	}
	
	
}