<%@ page import="java.util.*" %>
<html>
<body>
<h1 align="center">Session Api Test</h1>
<p>
<%
if (session.isNew()) {
    out.write("Hello! New id is:" + session.getId());
} else {
    out.write("Welcome Back!");
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie : cookies) {
        out.write("<p> Cookie name: " + cookie.getName() + " value: " + cookie.getValue());
        out.write("<p> Max age: " + cookie.getMaxAge());
    }

    out.write("<form method=\"POST\" action=\"TestSessionApi.do\">" +
            "<input type=\"submit\" value = \"invalidate\">" +
            "</form>");
}
%>
</body>
</html>