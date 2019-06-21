scalaVersion := "2.12.7"
organization := "com.wise"

val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
val gigahorse = "com.eed3si9n" %% "gigahorse-okhttp" % "0.3.1"
val playJson  = "com.typesafe.play" %% "play-json" % "2.6.9"

lazy val root = (project in file("."))
  .aggregate(web, core)

lazy val web = (project in file("web"))
  .aggregate(core)
  .dependsOn(core)
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "Web",
    libraryDependencies += scalaTest % Test,
  )

lazy val core = (project in file("core"))
  .settings(
    name := "Core",
    libraryDependencies ++= Seq(gigahorse, playJson),
    libraryDependencies += scalaTest % Test
  )


//lazy val teste = (project in file("teste"))
//  .settings(
//    name := "teste",
//    libraryDependencies ++= Seq(gigahorse, playJson),
////    libraryDependencies += scalaTest % Test
//  )