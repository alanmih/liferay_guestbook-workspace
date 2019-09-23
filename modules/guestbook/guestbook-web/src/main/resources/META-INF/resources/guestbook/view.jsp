<%@ include file="../init.jsp" %>


<portlet:renderURL var="addEntryURL">
    <portlet:param name="mvcPath" value="/guestbook/edit_entry.jsp"></portlet:param>
</portlet:renderURL>

<p>
	<b><liferay-ui:message key="guestbook.caption"/></b>
	<br>
	<b>Test_01</b>
</p>

<aui:button-row>
    <aui:button onClick="<%= addEntryURL.toString() %>" value="Add Entry"></aui:button>
</aui:button-row>
