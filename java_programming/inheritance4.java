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
 class inheritance4{
 public static void main(String args[]){
 Boxweight weightbox = new Boxweight(7,8,5,4.5);
 Box plainbox = new Box();
 double vol;
 vol = weightbox.volume();
 System.out.println("volume of WeightBox is : " + vol);
System.out.println("weight of WeightBox is : " + weightbox.weight);
plainbox = weightbox;
vol= plainbox.volume();
System.out.println("volume of the box is : " + vol);
 }
 }
	