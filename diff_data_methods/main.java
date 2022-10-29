class human {
	static int eye;
	double weight;
	static void eat(){
		System.out.println("Eating food is common to all human beings. ");
	}
	void write(String x,double y){
		this.weight = y;
		System.out.println("All human beings can't perform writing. ");
	}
}
class main {
	public static void main(String args[]){
		human Amit = new human();
		Amit.write("Amit",56.2);
		human.eye = 2;
		human.eat();
		System.out.println("Amit has "+ Amit.weight + " kgs of weight. ");
		System.out.println("Each human has "+human.eye+" of eyes. ");
	}
}