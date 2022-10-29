class animal {
	animal(){
		System.out.println("This is the animal class. ");
	}
}
class dog extends animal {
	dog(){
		super();
		System.out.println("Inside animal class there is a dog class. ");
	}
}
class main {
	public static void main(String args[]){
		dog d = new dog();
	}
}