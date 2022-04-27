//2) create a class name shape and create two sub class rectangle and square
//depending upon the object call print the area of square

class shape
{
   find_area:number;
   shape_name:string;
   
   constructor(ns:string)
   {
   this.shape_name=ns;
   }
   
   show()
   {
   console.log("name of the shape "+this.shape_name);
   }
}

class square extends shape
{
    s:number;
	constructor(s:number)
	{
	super("Square");
	this.s=s;
	}
	
	cal_area()
	{
	this.find_area=this.s*this.s;
	console.log("Area of square= "+this.find_area);
	}
}

class rectangle extends shape
{
    l:number;
	w:number
	constructor(l:number, w:number)
	{
	super("rectangle");
	this.l=l;
	this.w=w;
	}
	
	cal_area()
	{
	this.find_area=this.l*this.w;
	console.log("Area of Rectangle= "+this.find_area);
	}
}

var objs=new square(4);
objs.cal_area();
var objr=new rectangle(4,2);
objr.cal_area();