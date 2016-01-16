<%-- 
    Document   : profile
    Created on : 16.01.2016, 22:08:04
    Author     : Sasha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<c:set var="language" value="${not empty param.language ? param.language : not empty language ? language : pageContext.request.locale}" scope="session" />
<fmt:setLocale value="${language}" /> 
<fmt:setBundle basename="controller.properties.text" />

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><fmt:message key="profile.text.title" /></title>
    </head>
    <body>
        <h3>
            <a href="${pageContext.request.contextPath}/servlet?action=profile" >
                <fmt:message key="profile.link.mypage" />
            </a>
        </h3>
        <h3>
            <a href="${pageContext.request.contextPath}/servlet?action=orders" >
                <fmt:message key="profile.link.orders" />
            </a>
        </h3>
        <h3>
            <a href="${pageContext.request.contextPath}/servlet?action=account" >
                <fmt:message key="profile.link.account" />
            </a>
        </h3>
        <h3>
            <a href="${pageContext.request.contextPath}/servlet?action=settings" >
                <fmt:message key="profile.link.settings" />
            </a>
        </h3>
        <h5><fmt:message key="profile.link.information" /></h5>
        <h1>${user.firstName} ${user.lastName}</h1>
    </body>
</html>
