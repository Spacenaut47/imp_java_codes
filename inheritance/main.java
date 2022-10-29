class employee {
	int id;
	int salary;
	void occupation(){
		System.out.println("Hi i am an employee of GNIT. ");
	}
}
class teaching_staff extends employee {
	int classes_per_week;
	void job(){
		System.out.println("Hi i am teaching staff. ");
	}
}
class non_teaching_staff extends employee {
	int overtime_hours_per_week;
	void admin_job(){
		System.out.println("Hi i am a non teaching staff. ");
	}
}
class teacher extends teaching_staff {
	int no_of_theory_classes;
	void teach(){
		System.out.println("Hi i love teaching. ");
	}
}
class lab_assistant extends teaching_staff {
	int no_of_lab_classes;
	void lab_attend(){
		System.out.println("Hi i assist in labs. ");
	}
}
class accountant extends non_teaching_staff {
	void placements(){
		System.out.println("Hi i manage accounts. ");
	}
}
class main {
	public static void main(String args[]){
		teacher t = new teacher();
		lab_assistant l = new lab_assistant();
		t.id = 3;
		t.occupation();
		t.job();
		t.teach();
	}
}