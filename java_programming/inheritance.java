class A{
	int i,j;
	void showij(){
		System.out.println("i and j " + i+ " " + j);
	}
}
 class B extends A {
	 int k;
	 void showk(){
		 System.out.println("k: " + k);
	 }
	 void sum(){
		 System.out.println("i+j+k: " + (i+j+k));
	 }
 }
 class inheritance{
	 public static void main(String[] args){
		 A superOb = new A();
		 B subOb = new B();
		 // The Superclass May be used itself
		 superOb.i=10;
		 superOb.j=20;
		 System.out.println("contents of supOb: ");
		 superOb.showij();
		 System.out.println();
		 
		 // The subclass has access to all public members of its superclass.
		 
		 subOb.i=7;
		 subOb.j=8;
		 subOb.k=9;
		 System.out.println("contents of supOb: ");
		 subOb.showij();
		 subOb.showk();
		 System.out.println();
		 System.out.println("Sum of i, j and K in subOb: ");
		 subOb.sum();
	 }
 }