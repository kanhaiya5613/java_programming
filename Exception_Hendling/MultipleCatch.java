public class MultipleCatch{
	public static void main(String args[]){
		try{
			int i = args.length;
			String myString[] = new String[i];
			if(args[0].equals("Java")){
				System.out.println("First Word is Java");
			}
			System.out.println("Number of Arguments =" + i);
			int x = 12/i;
			int y[]={555,999};
			y[i] = x;
		}
		catch(ArithmeticException e){
			System.out.println("Div by 0: " + e);
		}
		catch(NullPointerException e){
			System.out.println("A Null Pointer Exception : " + e );
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Is Out of Bound : " + e);
		}
	}
}
