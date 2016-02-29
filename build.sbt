name := "ischolar"

version := "1.0"

lazy val `ischolar` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(jdbc, cache, ws, "org.apache.httpcomponents" % "httpclient" % "4.3.4", "org.neo4j" % "neo4j-ogm" % "1.1.0", specs2 % Test)

unmanagedResourceDirectories in Test <+= baseDirectory(_ / "target/web/public/test")

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
