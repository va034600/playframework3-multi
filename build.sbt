name := """playframework3-multi"""
organization := "com.example"

version := "1.0-SNAPSHOT"

scalaVersion := "2.13.13"

lazy val root = project.in(file("."))
  .dependsOn(app1)
  .aggregate(app1)

lazy val lib1 = project

lazy val app1 = project
