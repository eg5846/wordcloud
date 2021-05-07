# wordcloud
Wordcloud REST service

## Requirements
* git client
* openjdk version "16"
* Optional: Apache Maven 3.8.1
* Optional: IntelliJ IDEA Ultimate (ideaIU-2021.1.1.tar.gz)

## Build app
```
$ git clone git@github.com:eg5846/wordcloud.git

$ cd wordcloud

$ ./mvnw clean test install
```

## Run app
See: https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#using-boot-running-your-application
```
# Variant A
$ java -jar target/wordcloud-0.0.1-SNAPSHOT.jar

# Or variant B
$ ./mvnw spring-boot:run
```

## Use app
```
TODO: Add this
```

## Monitor and manage app
See: https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#production-ready
```
# Endpoint examples (there are many more, but not enabled and exposed by default over http)

$ curl http://localhost:8080/actuator/health
{"status":"UP"}
```

## Goals
* Learn using IntelliJ IDEA and it's shortcuts
* What are the differences between ideaIC an ideaIU? See: https://www.jetbrains.com/de-de/idea/download/#section=linux
* Get started with Spring (Boot) and REST
* Get startet with Spring micrometers
* Learn about Lombok
* Create docker image for Spring application
* Implement example wordcloud REST service
* Use AssertJ

## References
* https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/
* See: [HELP.md](HELP.md)

## Start Spring Boot project
See: https://www.jetbrains.com/lp/intellij-frameworks/  
Here https://start.spring.io/ is used.  
![](contrib/spring_initializr.png)
See also: https://maven.apache.org/guides/mini/guide-naming-conventions.html#:~:text=artifactId%20is%20the%20name%20of,the%20jar%20as%20it's%20distributed.  
Next: Unzip wordcloud.zip

## TODOs
* Read [HELP.md](HELP.md)
* Enable and expose monitoring endpoints over http (especially actuator and prometheus metrics)
