# Jworkspace

dev workspace for playing with JAVA and Frameworks

* [example](./example) basic maven project 
* [propfile](./propfile) load conf from resources/app.properties

## adding a new project

```
# created the project structure
mvn archetype:generate -B -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DgroupId=dev.ec -DartifactId=example -Dversion=1.0-SNAPSHOT -Dpackage=example

# add shade plugin, see example/pom.xml

# compile and package
mvn clean compile package

# run
java -jar target/example-1.0-SNAPSHOT.jar
```
