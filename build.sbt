import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.perhac.experiments.radixtree",
      scalaVersion := "2.12.7",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Radix Tree experiment",
    libraryDependencies ++= Seq(radixtree)
  )
