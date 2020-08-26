<%@ include file="../init.jsp" %>
Add Leave
<liferay-portlet:actionURL name="leave_editLeave" var="editLeave">
 <portlet:param name="mvcActionCommand" value="leave_editLeave" />
</liferay-portlet:actionURL>

<aui:form action="<%= editLeave %>" cssClass="container-fluid-1280" method="post" name="fm">

 <aui:fieldset markupView="lexicon">
 <aui:input name="name" ></aui:input>
 <liferay-ui:input-date name="startDate" monthValue="02" yearValue="2017"></liferay-ui:input-date>
 <liferay-ui:input-date name="endDate" monthValue="02" yearValue="2017"></liferay-ui:input-date>
 <aui:button type="submit"></aui:button>
 </aui:fieldset> 
</aui:form>