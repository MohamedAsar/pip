package com.demo.newworkflow.web.workflow;
/**
 * @author PONSELVAM
 *
 */
import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.demo.workflow.core.model.Hotel;
import com.demo.workflow.core.service.HotelLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandler;

@Component(
 property = {"model.class.name=com.demo.workflow.core.model.Hotel"},
 service = WorkflowHandler.class
)
public class HotelWorkflowHandler extends BaseWorkflowHandler<Hotel>{

 private HotelLocalService hotelService;
   @Reference(unbind = "-")
   protected void setHotelService(HotelLocalService hotelService) {
         this.hotelService = hotelService;
    }
  
  @Override
  public String getClassName() {
     return Hotel.class.getName();
  }
  @Override
  public String getType(Locale locale) {
     return "hotel";
  }

 @Override
 public Hotel updateStatus(int status, Map<String, Serializable> workflowContext) throws PortalException {
 
    long userId = GetterUtil.getLong((String)workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));
    long orderId = GetterUtil.getLong((String)workflowContext.get(WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));
    ServiceContext serviceContext = (ServiceContext)workflowContext.get("serviceContext");
    Hotel hotel = hotelService.updateStatus(userId, orderId, status, serviceContext);
    return hotel;
 }
 
}
