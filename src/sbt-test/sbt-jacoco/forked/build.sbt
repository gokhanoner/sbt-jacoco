name := "jacocoTest"
organization := "com.navetas"

scalaVersion := "2.12.15"
scalacOptions ++= Seq("-deprecation", "-optimize", "-unchecked", "-Xlint", "-language:_")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"

Test / fork := true