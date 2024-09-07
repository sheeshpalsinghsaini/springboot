package com.learn.springboot.learn_springboot;

public class Notes {
}

/*

    JPA:
        - JPA is a specification that simplifies object-relational mapping (ORM) in java application.
        - It provides a standard way to map java classes (entities) to database tables and perform CRUD operations.
    - Spring JDBC requires writing manual SQL queries and updates for CRUD operations.
        - JPA uses annotations and Spring Data JPA repositories, eliminating the need for manual SQL.
    - Spring JDBC requires a deeper understanding of SQL, increasing development time.
        - JPA simplifies data access logic by focusing on entities and relationships.
    - Spring JDBC code might need changes when switching database due to SQL dialects.


    - which database we will use, we have to provide the dialect of that database, only the jpa can generate native query for that specific database.
    - JPA works with various database through JPA providers requiring minimal code modifications.
    - Automatic query generation: spring data jpa generates queries based on method name.
    - object-relational mapping(ORM): JPA simplifies mapping Java objects to database tables.





JPA[ java/jakarta persistence api ]
    - specification: have annotations, interfaces, don't have implementation



Hibernate: ( open-source )
    - provide implementation for jpa












 */
