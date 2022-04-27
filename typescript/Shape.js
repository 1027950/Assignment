//2) create a class name shape and create two sub class rectangle and square
//depending upon the object call print the area of square
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var shape = /** @class */ (function () {
    function shape(ns) {
        this.shape_name = ns;
    }
    shape.prototype.show = function () {
        console.log("name of the shape " + this.shape_name);
    };
    return shape;
}());
var square = /** @class */ (function (_super) {
    __extends(square, _super);
    function square(s) {
        var _this = _super.call(this, "Square") || this;
        _this.s = s;
        return _this;
    }
    square.prototype.cal_area = function () {
        this.find_area = this.s * this.s;
        console.log("Area of square= " + this.find_area);
    };
    return square;
}(shape));
var rectangle = /** @class */ (function (_super) {
    __extends(rectangle, _super);
    function rectangle(l, w) {
        var _this = _super.call(this, "rectangle") || this;
        _this.l = l;
        _this.w = w;
        return _this;
    }
    rectangle.prototype.cal_area = function () {
        this.find_area = this.l * this.w;
        console.log("Area of Rectangle= " + this.find_area);
    };
    return rectangle;
}(shape));
var objs = new square(4);
objs.cal_area();
var objr = new rectangle(4, 2);
objr.cal_area();
