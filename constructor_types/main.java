class student {
	student(){
		System.out.println("Good morning teachers. ");
	}
	student(int i,int j){
		System.out.println("We have classes from "+i+" am to "+j+" pm.");
	}
}
class main {
	public static void main(String args[]){
		student s1 = new student(); // Default constructor
		student s2 = new student(10,3); //Parameterized constructor
	}
}