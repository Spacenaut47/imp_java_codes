//Different names and types of polymorphism are static polymorphism / method overloading / compile time polymorphism / early binding process
class shape {
	int area(int l,int b){
		return l*b;
	}
	double area(int r){
		return (22*r*r)/7;
	}
}
class main {
	public static void main(String args[]){
		shape circle = new shape();
		shape rectangle = new shape();
		System.out.println("Area of the circle is "+ circle.area(5));
		System.out.println("Area of the rectangle is " + rectangle.area(3,7));
	}
}