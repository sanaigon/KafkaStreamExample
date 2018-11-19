name := "KafkaStreamExample"

version := "0.1"

scalaVersion := "2.11.12"

// https://mvnrepository.com/artifact/org.apache.kafka/kafka-streams
libraryDependencies ++= Seq(
  "org.apache.kafka" % "kafka-streams" % "1.0.2",
  "org.apache.kafka" % "kafka-clients" % "1.0.2",
  "org.apache.kafka" %% "kafka-streams-scala" % "2.0.0",
  "javax.ws.rs" % "javax.ws.rs-api" % "2.1" artifacts( Artifact("javax.ws.rs-api", "jar", "jar"))
)
