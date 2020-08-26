<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">
<head>
	<title>${the_title} - ${company_name}</title>
	
	<meta content="initial-scale=1.0, width=device-width" name="viewport" />

	<@liferay_util["include"] page=top_head_include />
	
</head>

<body class="${css_class}">

<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />

<@liferay.control_menu />
<input type="hidden" id="themeIcon" value="${images_folder}/buger.jpg" />
<div class="pt-0" id="wrapper">
	<#if is_signed_in>
		<header id="banner">
			<div class="navbar navbar-classic navbar-top py-1">
				<div class="container user-personal-bar">
					<div class="align-items-center justify-content-between autofit-row">
						<a class="${logo_css_class} align-items-center d-md-inline-flex d-sm-none d-none logo-md" href="${site_default_url}" title="<@liferay.language_format arguments="" key="go-to-x" />">
							<img alt="${logo_description}" class="mr-2" height="56" src="${site_logo}" />

						</a>

						<div class="autofit-col">
							<@liferay.user_personal_bar />
						</div>
					</div>
				</div>
			</div>
		</header>
	
	<#include "${full_templates_path}/banner.ftl" />
	</#if>
	<section class="${portal_content_css_class}" id="content" style="max-width: 1100px;margin: 50px auto  0px;">
		<h1 class="sr-only">${the_title}</h1>

		<#if selectable>
			<@liferay_util["include"] page=content_include />
		<#else>
			${portletDisplay.recycle()}

			${portletDisplay.setTitle(the_title)}

			<@liferay_theme["wrap-portlet"] page="portlet.ftl">
				<@liferay_util["include"] page=content_include />
			</@>
		</#if>
	</section>
	<#if is_signed_in>
	<footer id="footer" role="contentinfo">
		<div class="container">
			<div class="row">
				<div class="col-md-12 text-center text-md-left">
					<@liferay.language key="powered-by" />

					<a class="text-white" href="http://www.liferay.com" rel="external">MM Foods</a>
				</div>
			</div>
		</div>
	</footer>
	</#if>
</div>

<@liferay_util["include"] page=body_bottom_include />

<@liferay_util["include"] page=bottom_include />

</body>

</html>