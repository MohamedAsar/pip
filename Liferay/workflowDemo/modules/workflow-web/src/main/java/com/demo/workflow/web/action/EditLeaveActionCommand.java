/**
 * 
 */
package com.demo.workflow.web.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.demo.workflow.core.model.Leave;
import com.demo.workflow.core.service.LeaveLocalService;
import com.demo.workflow.web.constants.WorkflowWebPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

/**
 * @author PONSELVAM
 *
 */

@Component(
	 property = {
			 "javax.portlet.name=" + WorkflowWebPortletKeys.WorkflowWeb,
			 "mvc.command.name=leave_editLeave"
	 },
	 service = MVCActionCommand.class
 )

public class EditLeaveActionCommand extends BaseMVCActionCommand{
	
private LeaveLocalService leaveService;

@Reference(unbind = "-")
	protected void setLeaveService(LeaveLocalService leaveService) {
		this.leaveService = leaveService;
	}

 @Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
	 
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String name = ParamUtil.getString(actionRequest, "name");
		Date startDate= ParamUtil.getDate(actionRequest, "startDate",sdf );
		Date endDate = ParamUtil.getDate(actionRequest, "endDate", sdf);
		 
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		Leave leave = leaveService.addLeave(name, themeDisplay.getRealUserId(), groupId,
		                            themeDisplay.getCompanyId(), startDate, endDate);
	}
}
