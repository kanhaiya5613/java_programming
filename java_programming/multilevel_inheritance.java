class Box{
    double width;
	double height;
	double depth;
	Box(){
	width=0.0;
	height=0.0;
	depth=0.0;
	}
	Box(double w,double h,double d){
	width=w;
	height = h;
	depth = d;
	}
	double volume (){
	return width*height*depth;
	}
}
 class Boxweight extends Box{
 double weight;
 Boxweight (double w,double h,double d,double wt){
 width = w;
 height=h;
 depth=d;
 weight = wt;
 }
 }
 class shipment extends Boxweight {
 double cost;
 shipment(double x,double y,double z,double a ,double b){
 super(x,y,z,a);
 cost = b;
 }
 }
 
 class multilevel{
 public static void main(String args[]){
 Box mybox1 = new Box();
 Boxweight mybox2 = new Boxweight(2 , 3 , 4 , 0.076);
 double vol;
 vol = mybox1.volume();
 System.out.println("vol of mybox1 is" + vol);
 System.out.println();
 
 vol = mybox2.volume();
 System.out.println("Volume of mubox2 is : " +vol);
 System.out.println("Weight of Box2 is " + mybox2.weight);
 shipment mybox3= new shipment(5,8,9,7,5);
 vol = mybox3.volume();
 System.out.println("Volume of mubox3 is : " +vol);
 System.out.println("Weight of Box3 is " + mybox3.weight);
 System.out.println("Weight of Box3 is " + mybox3.cost);
 }
 }
	