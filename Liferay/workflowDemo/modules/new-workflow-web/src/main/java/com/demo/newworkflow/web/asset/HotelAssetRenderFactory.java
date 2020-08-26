package com.demo.newworkflow.web.asset;
/**
 * @author PONSELVAM
 *
 */
import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.demo.newworkflow.web.constants.NewWorkflowWebPortletKeys;
import com.demo.workflow.core.model.Hotel;
import com.demo.workflow.core.service.HotelLocalService;
import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseAssetRendererFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.ResourceBundleLoader;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + NewWorkflowWebPortletKeys.NewWorkflowWeb,
	},
	service = AssetRendererFactory.class
)

public class HotelAssetRenderFactory extends BaseAssetRendererFactory<Hotel> {
 
 private HotelLocalService hotelService;
 private ResourceBundleLoader resourceBundleLoader;
 private ServletContext servletContext;

 @Reference(unbind = "-")
 protected void setHotelService(HotelLocalService hotelService) {
      this.hotelService = hotelService;
 }

 @Reference(unbind = "-")
 public void setResourceBundleLoader(ResourceBundleLoader resourceBundleLoader) {
     this.resourceBundleLoader = resourceBundleLoader;
 }

 @Reference(unbind = "-")
 public void setServletContext(ServletContext servletContext) {
     this.servletContext = servletContext;
 }
 
 public HotelAssetRenderFactory() {
        setClassName( HotelAssetRenderFactory.class.getName());
        setCategorizable(true);
        setLinkable(true);
        setPortletId(NewWorkflowWebPortletKeys.NewWorkflowWeb);
        setSearchable(true);
        setSelectable(true);
 }

 @Override
 public AssetRenderer<Hotel> getAssetRenderer(long classPK, int type) throws PortalException {
      Hotel hotel =  hotelService.getHotel(classPK);
      HotelAssetRenderer assetRenders = new HotelAssetRenderer(hotel, resourceBundleLoader);
      assetRenders.setAssetRendererType(type);
      assetRenders.setServletContext(servletContext);
      return assetRenders;
 }

 @Override
 public String getType() {
     return "hotel";
 }

 @Override
 public String getClassName() {
     return Hotel.class.getName();
 }
}
