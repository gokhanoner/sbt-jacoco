libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.0" % "test,it"

val root = project.in(file(".")).configs(IntegrationTest)

jacoco.settings

Defaults.itSettings

itJacoco.settings