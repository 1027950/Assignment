//3) create a class of Name Circle, and perform following opertion
//on the basis of radius of circle calculate how many time it is required spin to cover a given distance


class Circle
{
	Circumference:number;
	radius :number;
	id:number;
	distanc:number;
	times:number;
	
	constructor(radius:number,id:number,distanc:number)
{
	this.radius=radius;
	this.id=id;
	this.distanc=distanc;

}
disp()
{
	this.Circumference= 2 *this.id*this.radius;
	
	this.times=this.distanc/this.Circumference;
	
	console.log("Ring rotations=" +this.times);
}
}
let C=new Circle(9,15/4,140);
C.disp();
