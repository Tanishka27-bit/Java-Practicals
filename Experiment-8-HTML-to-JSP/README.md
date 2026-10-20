# Experiment 8: HTML to JSP
Run `mvn clean package`; copy `target/html-to-jsp.war` to Tomcat 11 `webapps`, start Tomcat and visit `http://localhost:8080/html-to-jsp/`. Enter a name in the HTML form; JSP reads it using `request.getParameter("name")`.
