import java.lang.*;
public class Throws{
public static void main(String args[]) throws Exception{
int[] array = new int[3];
try{
for(int i=0;i<4;++i){
array[i] = i;
}
System.out.println(array);
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("filIn: " + e.fillInStackTrace());
System.out.println("cause: " + e.getCause());
System.out.println("local: " + e.getLocalizedMessage());
System.out.println("message: " + e.getMessage());
System.out.println("trace: " + e.getStackTrace());
System.out.println();
System.out.println();
System.out.println("trace: " ); e.printStackTrace();
System.out.println();
System.out.println("String: "); e.toString();
System.out.println();
System.out.println();

System.out.println("OOps , We Went too far , better go back to 0!");
throw (Exception) new Exception().initCause(e);
}
finally{
System.out.println(array);
}
}
}