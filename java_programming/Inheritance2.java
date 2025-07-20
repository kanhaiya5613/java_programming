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
 class inheritance1{
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
 }
 }
	