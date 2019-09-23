<%@ include file="../init.jsp" %>

<%

long entryId = ParamUtil.getLong(renderRequest, "entryId");

long guestbookId = ParamUtil.getLong(renderRequest, "guestbookId");

%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/guestbook/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addEntry" var="addEntryURL" />

<aui:form action="<%= addEntryURL %>" name="<portlet:namespace />fm">

	<aui:fieldset>
		<aui:input name="name" />
		<aui:input name="email" />
		<aui:input name="phone" />
		<aui:input name="address" />
		<aui:input name="message" />
		<aui:input name="entryId" type="hidden" />
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
	</aui:button-row>

</aui:form>
