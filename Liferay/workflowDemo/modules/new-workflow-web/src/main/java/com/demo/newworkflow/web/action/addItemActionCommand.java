/**
 * 
 */
package com.demo.newworkflow.web.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.demo.newworkflow.web.constants.NewWorkflowWebPortletKeys;
import com.demo.workflow.core.model.Hotel;
import com.demo.workflow.core.service.HotelLocalService;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

/**
 * @author PONSELVAM
 *
 */
@Component(
	property = {
		"javax.portlet.name=" + NewWorkflowWebPortletKeys.NewWorkflowWeb,
		"mvc.command.name=add_items"
	},
	service = MVCActionCommand.class
)
public class addItemActionCommand extends BaseMVCActionCommand{
	private HotelLocalService hotelService;

	@Reference(unbind = "-")
		protected void setLeaveService(HotelLocalService hotelService) {
			this.hotelService = hotelService;
		}
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long userId = themeDisplay.getUserId();
		ServiceContext serviceContext=ServiceContextFactory.getInstance(Hotel.class.getName(),actionRequest);
		serviceContext.setUserId(userId);
		serviceContext.setCompanyId(PortalUtil.getCompanyId(actionRequest));
		int pizzaConut = ParamUtil.getInteger(actionRequest, "pizza");
		int burgerCount = ParamUtil.getInteger(actionRequest, "burger");
		int DoughnutCount = ParamUtil.getInteger(actionRequest, "Doughnut");
		Hotel hotel = hotelService.addItemsInList(serviceContext, pizzaConut, burgerCount, DoughnutCount);
		
		System.out.println("item added");
	}

}
