package com.wise

object Mapa extends App {

  case class Mapa(valor : String)

  val services = Map(
    "key1" -> "val1",
    "key2" -> "val2"
  )
  println("-------------")

//  services.foreach((a,b) => println(s"chave ${a} e valor ${b}"))
//  services.foreach((a,b,c) => print(a))

  services.keys.foreach( (movie) =>
    if (services.contains(movie))  println(movie.toString + " -> " + services.get(movie))
  )

  println("-------------")

  println(services.getOrElse("key2", "teste"))
  println(services.getOrElse("key3", "teste"))
}
