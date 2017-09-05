sbtPlugin := true

name := "json"

organization := "com.simplesys"

version := "1.0.1"

scalaVersion := "2.10.6"

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
	//val ssysCoreVersion = "1.2.100"
	val ssysCoreVersion = "1.3-SNAPSHOT"
	Seq(       
    		"com.simplesys.core" %% "scala-gen" % ssysCoreVersion
	)
}	

publishArtifact in(Compile, packageBin) := true

publishArtifact in(Test, packageBin) := false

publishArtifact in(Compile, packageDoc) := false

publishArtifact in(Compile, packageSrc) := true

publishMavenStyle := true

//git.baseVersion := "1.3"

