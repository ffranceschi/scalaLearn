package com.wise

abstract class Shape(val x: Int, val y: Int) {
  val area: Double
  def description: String
}

class Rectangle(x: Int, y: Int, val width: Int, val height: Int)
  extends Shape(x, y) {

  val area: Double = width * height

  def description: String =
    "Rectangle " + width + " * " + height
}

object Rectangle extends App {

  val rectangle = new Rectangle(1, 5,100, 30)
  println(rectangle.area)
  println(rectangle.description)
}