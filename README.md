# Simple web application

This is simple 3 tier web app, with Web layer (AngularJS/static), App layer (Spring REST)  - AngularJS and Spring-Hibernate ORM with Database.

* Static files: All JS, CSS, Image files. The app.js file contains the URL to the REST services pointing to the ELB. ELB should be placed in front of the App layer.
	* These files can be deployed directly as a S3 static website. 
* REST Service : WAR file that can be deployed to any Java app server
	* Deploy this behind a ELB.
* Database - Default database is the HQL in-memory database. Configuration to use any postgres database can be done by updates to "context.xml" and "persistance.xml"


## Run on localhost


* To run on localhost use
```bash
mvn clean package jetty:run
```
* Open browser: http://localhost:8080/#!/login