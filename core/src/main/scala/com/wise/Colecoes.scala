package com.wise

import scala.collection.mutable.ListBuffer

object Colecoes extends App {

  case class Colecoes(val valor: String)

  val listaVazia = List[Nothing]()
  var lista: List[String] = listaVazia

  var lista2: List[String] = List.empty


  println(lista)
  println(lista2)
  println("------------")

  //////

  val col1 = Colecoes("a")
  val col2 = Colecoes("b")
  val col3 = Colecoes("c")
  val col4 = Colecoes("d")
  val cols = Set(col1, col2, col3)

  cols.foreach(a => println(a.valor))
  println("=========")
  val cols2 = cols + col4 - col1

  cols2.foreach(a => println(a.valor))
  println("------------")

  val cols3 = col1 :: col2 :: col3 :: col1 :: Nil
  cols3.foreach(a => println(a.valor))
  println("=========")

  val person1 = Person("a","b",1)
  var persons: ListBuffer[Person] = ListBuffer()
  persons.+=(person1)

  persons.foreach(println(_))
}
