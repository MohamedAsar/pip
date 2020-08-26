package com.demo.newworkflow.web.asset;
/**
 * @author PONSELVAM
 *
 */
import java.util.Locale;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.demo.workflow.core.model.Hotel;
import com.liferay.asset.kernel.model.BaseJSPAssetRenderer;
import com.liferay.portal.kernel.util.ResourceBundleLoader;

public class HotelAssetRenderer extends BaseJSPAssetRenderer<Hotel> {

 private final Hotel hotel;
 private final ResourceBundleLoader resourceBundleLoader;
 
 public HotelAssetRenderer(Hotel hotel, ResourceBundleLoader resourceBundleLoader) {
      this.hotel = hotel;
      this.resourceBundleLoader = resourceBundleLoader;
 }
 
 @Override
 public Hotel getAssetObject() {
      return hotel;
 }
 @Override
 public long getGroupId() {
     return hotel.getGroupId();
 }
 @Override
 public long getUserId() {
     return hotel.getUserId();
 }

 @Override
 public String getUserName() {
     return hotel.getUserName();
 }

 @Override
 public String getUuid() {
     return hotel.getUuid();
 }
 @Override
 public String getClassName() {
     return Hotel.class.getName();
 }

 @Override
 public long getClassPK() {
     return hotel.getOrderId();
 }

 @Override
 public String getSummary(PortletRequest portletRequest, PortletResponse portletResponse) {
     return "pizza ->" + hotel.getPizza()+ "burger ->" + hotel.getBurger() +"Doughnut ->"+  hotel.getDoughnut() + "by "+hotel.getUserName();
  }
 
 @Override
 public int getStatus() {
     return hotel.getStatus();
 }

 @Override
 public String getTitle(Locale locale) {
    return hotel.getUserName()+" order";
 }

 @Override
 public int getAssetRendererType() {
    return super.getAssetRendererType();
 }
 
 @Override
 public String getJspPath(HttpServletRequest request, String template) {
     return "/hotelAssetInfo.jsp";
 
 }
 
 @Override
 public boolean include(HttpServletRequest request, HttpServletResponse response, String template) throws Exception {
    request.setAttribute("hotelEntry", hotel);
    return super.include(request, response, template);
 }

}

