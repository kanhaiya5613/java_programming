public class NestedTryCatch{
public static void main(String args[]){
try {
int a = args.length;
int b=42/a;
System.out.println("a = " + a);
if(a==1){
a=a/(a-a);
try{
if(a==2){
int c[] = {1};
c[2] = 99;
}
} catch(ArrayIndexOutOfBoundsException e){
System.out.println("Array Index Out Of Bounds " +e );
}
}
}catch(ArithmeticException e){
System.out.println("Divide by 0:" +e);
}
}
}