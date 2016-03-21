name := "Rethinker"

organization := "com.constructiveproof"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.10.6", "2.11.8")

libraryDependencies ++= Seq(
  "com.rethinkdb" % "rethinkdb-driver" % "2.2-beta-1",
  "org.json4s" %% "json4s-jackson" % "3.3.0",
  "org.mockito" % "mockito-all" % "1.10.5" % "test",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.5" % "test"
)

initialCommands := "import com.constructiveproof.rethinker._"
