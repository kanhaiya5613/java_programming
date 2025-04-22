
class ClassA extends Thread{
	public void run() {
		System.out.println("Start Thread A .....");
		for(int i=1;i<=5;i++) {
			if(i==1) yield();
			System.out.println("From Thread A : i = " + i);
		}
		System.out.println(".......   Exit Thread A");
	}
}
class ClassB extends Thread{
	public void run() {
		System.out.println("Start Thread B ......");
		for(int j=1;j<=5;j++) {
			System.out.println("From Thread B : i = " + j);
			if(j==2) stop();
	}
		System.out.println(".......... Exit thread B");
}
}
class ClassC extends Thread{
	public void run() {
		System.out.println("Start Thread C ......");
		for(int k=1;k<=5;k++) {
			System.out.println("From Thread C : i = " + k);
			if(k==3) {
				try {
					sleep(5000);
				}catch(Exception e) {} 
			}
	}
		System.out.println(".......... Exit thread C");
}
}
class ClassD extends Thread{
	public void run() {
		try {
			System.out.println("Class D starts Running ...");
			sleep(5000);
			System.out.println("Class D finishes Running...");
			
	}catch(Exception e) {}
}
}
class ClassE extends Thread{
	public void run() {
		try {
			System.out.println("Class E starts Running ...");
			System.out.println("Class E is suspended itself ..");
			suspend();
			System.out.println("Class E runs Again ... ");
			
	}catch(Exception e) {}
}
}

public class Methods {
    public static void main(String args[]) {
    	ClassA P = new ClassA();
    	ClassB Q = new ClassB();
    	ClassC R = new ClassC();
    	ClassD S = new ClassD();
    	ClassE T = new ClassE();
    	P.start();
    	Q.start();
    	R.start();
    	S.start();
    	T.start();
    	System.out.println("....  End Of Executution ");
    }
}
