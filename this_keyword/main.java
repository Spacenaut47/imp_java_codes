class human {
	int eye;
	int nose;
	void eat(){
		System.out.println("Humans take food. ");
	}
	void assigning_data(String x){
		this.eye = 2;
		this.nose = 1;
		System.out.println(x+" has "+this.eye+" number of eyes. ");
		System.out.println(x+" has "+this.nose+" number of nose. ");
	}
}
class main {
	public static void main(String args[]){
		human Amit = new human();
		human Sumit = new human();
		Amit.assigning_data("Amit");
		Sumit.assigning_data("Sumit");
	}
}