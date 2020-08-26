package com.demo.workflow.web.portlet;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.demo.workflow.core.model.Leave;
import com.demo.workflow.core.service.LeaveLocalServiceUtil;
import com.demo.workflow.web.constants.WorkflowWebPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

/**
 * @author PONSELVAM
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=workflow-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-action=/leave/view",
		"javax.portlet.init-param.view-template=/leave/view.jsp",
		"javax.portlet.name=" + WorkflowWebPortletKeys.WorkflowWeb,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class WorkflowWebPortlet extends MVCPortlet {	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse){
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		List<Leave> leaveDetails= new ArrayList<Leave>();
		leaveDetails = LeaveLocalServiceUtil.getLeaveByUserId(themeDisplay.getUserId());
		System.out.println("test"+leaveDetails);
	}
}