package com.wise

object MediaCaseObj extends App {

  case class MediaCase(value: String)

  val fotos = MediaCase("fotos")
  println(fotos == new MediaCase("fotos"))

  val FOTOS = 1
  val VIDEOS = 2
  val TODAS = 3


  val midia = 1
  midia match {
    case FOTOS => println("processando fotos")
    case VIDEOS => println("processando videos")
    case _ => println("processando qualquer outra coisa")
  }



  val texto = midia match {
    case FOTOS => "processando fotos1"
    case VIDEOS => "processando videos1"
    case _ => "processando qualquer outra coisa1"
  }
  println(texto)




}
