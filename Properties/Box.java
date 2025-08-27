package Properties;

public class Box {
    double h;
    double l;
    double w;

    Box(){
    this.h=-1;
    this.l=-1;
    this.w=-1;
    }

    Box(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }
    Box(double h,double l, double w){
    this.h=h;
    this.l=l;
    this.w=w;
    }
    
    Box(Box old){
    this.h=old.h;
    this.l=old.l;
    this.w=old.w;
    }
}
