//3) create a class of Name Circle, and perform following opertion
//on the basis of radius of circle calculate how many time it is required spin to cover a given distance
var Circle = /** @class */ (function () {
    function Circle(radius, id, distanc) {
        this.radius = radius;
        this.id = id;
        this.distanc = distanc;
    }
    Circle.prototype.disp = function () {
        this.Circumference = 2 * this.id * this.radius;
        this.times = this.distanc / this.Circumference;
        console.log("Ring rotations=" + this.times);
    };
    return Circle;
}());
var C = new Circle(9, 15 / 4, 140);
C.disp();
