name := "learningScalaz"

organization := "lakret"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
  "org.scalaz" %% "scalaz-core" % "6.0.4"
)

scalacOptions ++= Seq("-deprecation", "-feature",
                      "-language:implicitConversions", "-language:reflectiveCalls",
  	                  "-language:existentials", "-language:postfixOps")

EclipseKeys.withSource := true

initialCommands := """
  import lakret.learningscalaz._
  import scalaz._
  import Scalaz._
"""
