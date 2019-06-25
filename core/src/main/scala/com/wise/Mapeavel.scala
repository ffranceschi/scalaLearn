package com.wise

class Mapeavel[A](val elements: List[A]) {

    def map[B](f: A => B): List[B] = {
      val result = collection.mutable.MutableList[B]()
      elements.foreach {
        result += f.apply(_)
      }
      result.toList
    }


}

object Example extends App {
  val numbers: List[Int] = List(1, 2, 54, 4, 12, 43, 54, 23, 34)
  val mappable: Mapeavel[Int] = new Mapeavel(numbers)
  val result = mappable.map(_ * 2)
  println(result)

  println("----------")
  val x: Seq[(Int, Int)] = for {
    i <- 0 to 5
    j <- 0 to 5
  } yield {
    (i, j)
  }

  x.foreach(println(_))



}

