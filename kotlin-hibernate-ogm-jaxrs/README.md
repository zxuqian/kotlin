# Kotlin - Wildfly Swarm - Hibernate OGM

## Introduction

This is an example of how to use Kotlin to implement Wildfly Swarm application. The JPA part uses Hibernate OGM for
NoSQL orm. The backend database is Mongodb, with the default connection configuration in the **Persistence.xml** file.


## Run the application
Simple import it into any IDE as a maven project, then run **wildfly-swarm:run** goal, or run **mvn package** then run
**java -jar kotlin-hibernate-orm-jaxrs-swarm.jar**. 

After running, access **http://localhost:8080** in your web browser.