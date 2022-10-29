class student {
	int roll_no;
	double attendance;
	void learn(){
		System.out.println("Hello i am a student.");
	}
}
class teacher {
	int emp_id;
	void teach(){
		System.out.println("Hello i am a teacher.");
	}
}
class main {
	public static void main(String args[]){
		student Amit;
		Amit = new student();
		teacher Ns;
		Ns = new teacher();
		Amit.roll_no = 37;
		Amit.learn();
		Ns.emp_id = 144;
		Ns.teach();
	}
}