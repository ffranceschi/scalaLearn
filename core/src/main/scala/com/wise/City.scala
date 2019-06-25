package com.wise

case class City(name: String, urbanArea: Int)

object City {
  val London = City("London", 1738)
  val Lausanne = City("Lausanne", 41)
}

case class Person2(firstName: String, lastName: String, city: City)

object Person2 {
  def apply(fullName: String, city: City): Person2 = {
    val splitted = fullName.split(" ")
    new Person2(firstName = splitted(0), lastName = splitted(1), city = city)
  }
}

object Exec extends App {
// Uses the default apply method
val m1 = Person2("Mikael", "Valot", City.London)
// Call apply with fullName
val m2 = Person2("Mikael Valot", City.London)
// We can omit 'apply'
val n = Person2.apply ("Nicolas Jorand", City.Lausanne)
}