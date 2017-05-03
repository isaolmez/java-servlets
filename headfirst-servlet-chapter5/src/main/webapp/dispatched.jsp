<%@ page import="java.util.*" %>
<html>
<body>
<h1 align="center">Init Params JSP</h1>
<p>
<%
    final Map<String, String> servletInitParams = (Map<String, String>)request.getAttribute("servletInitParameters");
    for(String key : servletInitParams.keySet()){
        out.print(String.format("Servlet Init Param: %s, Value: %s <br />", key, servletInitParams.get(key)));
    }

    out.println("<br />");

    final Map<String, String> contextInitParams = (Map<String, String>)request.getAttribute("contextInitParameters");
    for(String key : contextInitParams.keySet()){
      out.print(String.format("Context Init Param: %s, Value: %s <br />", key, contextInitParams.get(key)));
    }

    out.println("<br />");
    out.println("Without Dispatched Info: <br />");

    Enumeration<String> contextInitParamEnumerator = getServletContext().getInitParameterNames();;
    while(contextInitParamEnumerator.hasMoreElements()){
        String key = contextInitParamEnumerator.nextElement();
        out.print(String.format("Context Init Param: %s, Value: %s <br />", key, getServletContext().getInitParameter(key)));
    }
%>
</body>
</html>