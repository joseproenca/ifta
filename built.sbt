name := "IFTA"
 
version := "1.0"
 
scalaVersion := "2.11.7"
 
libraryDependencies ++= Seq(
    "junit" % "junit" % "4.12",
    "org.scalatest" % "scalatest_2.11" % "3.0.0-M15",
    //"org.ow2.sat4j" % "org.ow2.sat4j.sat" % "2.3.5"
    "org.ow2.sat4j" % "org.ow2.sat4j.core" % "2.3.5" withSources() withJavadoc()
    //"org.sat4j" % "org.sat4j.pb" % "2.3.1",
    //"org.sat4j" % "org.sat4j.core" % "2.3.1"
)
