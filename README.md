# Simple web application

The web app has 3 components

* Static files: All JS, CSS, Image files. The app.js file contains the URL to the REST services 
* REST Service : WAR file that can be deployed to any Java app server
* Database - Default database is the HQL in-memory database. Configuration to use any postgres database can be done by updates to "context.xml" and "persistance.xml"


## Run on localhost


* To run on localhost use
```bash
mvn clean package jetty:run
```