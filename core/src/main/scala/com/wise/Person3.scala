package com.wise

case class Person3(name: String, age: Int)

case class AgeNegativeException(message: String) extends Exception(message)

object Person3 extends App {
  def createPerson(description: String): Person3 = {
    val split = description.split(" ")
    val age = split(1).toInt
    if (age < 0)
      throw AgeNegativeException(s"age: $age should be > 0")
    else
      Person3(split(0), age)
  }

  val p = Person3("Fernando",39)
  val fernando = Person3.createPerson("Fernando 39")
  println(fernando)
}
