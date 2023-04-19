<%@tag description="normal or mandatory fields" pageEncoding="UTF-8"%>

<%@attribute name="mandatory" required="true"%>
<%@attribute name="text" required="true"%>

<%
  if ("yes".equals(mandatory)) {
      out.println(text + "<font color='red'>*</font>");
  } else {
      out.println(text);
  }
%>
