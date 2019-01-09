name := "learnScalaMacro"

version := "0.1"

scalaVersion := "2.12.6"

lazy val common = (project in file("common")).settings(
  libraryDependencies ++= Seq(
    "org.scala-lang" % "scala-reflect" % "2.12.6",
    "org.scala-lang" % "scala-compiler" % "2.12.6",
    "com.chuusai" %% "shapeless" % "2.3.3" 
  )
)

lazy val main = (project in file("main")).dependsOn(common)
