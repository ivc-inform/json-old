sbtPlugin := true

name := "json"

organization := "com.simplesys"

version := "1.0.4-SNAPSHOT"

scalaVersion := "2.12.4"

scalacOptions := Seq(
    "-feature",
    "-language:postfixOps",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-deprecation",
    "-unchecked"
)

description := ""

libraryDependencies ++= {
	//val ssysCoreVersion = "1.4.0.2"
	val ssysCoreVersion = "1.5-SNAPSHOT"
	Seq(
    		"com.simplesys.core" %% "scala-gen" % ssysCoreVersion
	)
}	

publishArtifact in(Compile, packageBin) := true

publishArtifact in(Test, packageBin) := false

publishArtifact in(Compile, packageDoc) := false

publishArtifact in(Compile, packageSrc) := true

publishMavenStyle := true


