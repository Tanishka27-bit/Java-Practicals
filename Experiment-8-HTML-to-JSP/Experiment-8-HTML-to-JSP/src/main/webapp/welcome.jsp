<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!doctype html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>JSP Result</title>
    </head>

    <body>
        <% String name=request.getParameter("name");if(name==null||name.isBlank())name="Student" ;String
            safe=name.replace("&","&amp;").replace("<","&lt;").replace(">
            ","&gt;").replace("\"","&quot;").replace("'","&#x27;");
            %><h1>Welcome, <%= safe %>!</h1>
            <p>Data was sent from HTML form to JSP.</p><a href="index.html">Go back</a>
    </body>

    </html>