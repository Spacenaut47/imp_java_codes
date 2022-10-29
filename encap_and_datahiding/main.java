class student {
	private int age;
	public int getage(){
		return age;
	}
	public void setage(int x){
		this.age = x;
	}
}
class main {
	public static void main(String args[]){
		student s1 = new student();
		//System.out.println("My age is "+s1.getage());
		s1.setage(21);
		System.out.println("My age is "+s1.getage());
	}
}