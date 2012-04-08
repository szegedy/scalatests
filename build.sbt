name := "scalatests"

version := "0.0"

scalaVersion := "2.9.1"

libraryDependencies += "org.scala-tools.testing" %% "scalacheck" % "1.9" % "test"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.7.1" % "test"

scalacOptions += "-deprecation"

compileOrder := CompileOrder.JavaThenScala

