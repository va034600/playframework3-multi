name := """playframework3-multi-app1"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.13.13"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.0" % Test
libraryDependencies ++= Seq(
  specs2 % Test,
)

lazy val app1 = (project in file("."))
  .enablePlugins(PlayScala)
  .dependsOn(lib1)

lazy val lib1 = project.in(file("../lib1"))
