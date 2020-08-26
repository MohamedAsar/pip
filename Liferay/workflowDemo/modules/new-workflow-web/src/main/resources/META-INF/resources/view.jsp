<%@ include file="/init.jsp" %>

<liferay-portlet:actionURL name="add_items" var="addItems">
	<portlet:param name="mvcActionCommand" value="add_items" />
</liferay-portlet:actionURL>

<aui:form action="<%= addItems %>" cssClass="container-fluid-1280" method="post" name="fm">

<aui:fieldset markupView="lexicon">
<div class="card-deck">
	<div class="card">
		<img class="card-img-top" src="<%=request.getContextPath()%>/images/pizza.jpg" alt="Card image cap">
		<div class="card-body">
			<h4 class="card-title mt-2">Pizza</h4>
			<div class="d-flex justify-content-between mt-2">
				<div class="price-field">
					<h4>$ 4</h4>
				</div>
				<div class="Quantity-field">
					<aui:select name="pizza" label="">
					    <aui:option value="0">0</aui:option>
					    <aui:option value="1">1</aui:option>
					    <aui:option value="2">2</aui:option>
					    <aui:option value="3">3</aui:option>
					    <aui:option value="4">4</aui:option>
					    <aui:option value="5">5</aui:option>
					    <aui:option value="6">6</aui:option>
					    <aui:option value="7">7</aui:option>
					    <aui:option value="8">8</aui:option>
					    <aui:option value="9">9</aui:option>
					    <aui:option value="10">10</aui:option>
					</aui:select>
				</div>
			</div>
			<p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
		</div>
	</div>
	<div class="card">
		<img class="card-img-top" src="<%=request.getContextPath()%>/images/buger.jpg" alt="Card image cap">
		<div class="card-body">
			<h5 class="card-title mt-2">Burger</h5>
			<div class="d-flex justify-content-between mt-2">
				<div class="price-field">
					<h4>$ 3</h4>
				</div>
				<div class="Quantity-field">
					<aui:select name="burger" label="">
					    <aui:option value="0">0</aui:option>
					    <aui:option value="1">1</aui:option>
					    <aui:option value="2">2</aui:option>
					    <aui:option value="3">3</aui:option>
					    <aui:option value="4">4</aui:option>
					    <aui:option value="5">5</aui:option>
					    <aui:option value="6">6</aui:option>
					    <aui:option value="7">7</aui:option>
					    <aui:option value="8">8</aui:option>
					    <aui:option value="9">9</aui:option>
					    <aui:option value="10">10</aui:option>
					</aui:select>
				</div>
			</div>
			<p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
		</div>
	</div>
	<div class="card">
		<img class="card-img-top" src="<%=request.getContextPath()%>/images/donut.jpg" alt="Card image cap">
		<div class="card-body">
			<h4 class="card-title mt-2">Doughnut</h4>
			<div class="d-flex justify-content-between mt-2">
				<div class="price-field">
					<h4>$ 2</h4>
				</div>
				<div class="Quantity-field">
					<aui:select name="Doughnut" label="">
					    <aui:option value="0">0</aui:option>
					    <aui:option value="1">1</aui:option>
					    <aui:option value="2">2</aui:option>
					    <aui:option value="3">3</aui:option>
					    <aui:option value="4">4</aui:option>
					    <aui:option value="5">5</aui:option>
					    <aui:option value="6">6</aui:option>
					    <aui:option value="7">7</aui:option>
					    <aui:option value="8">8</aui:option>
					    <aui:option value="9">9</aui:option>
					    <aui:option value="10">10</aui:option>
					</aui:select>
				</div>
			</div>
			<p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>
		</div>
	
	</div>
</div>

<aui:button type="submit" label="Order" name="Order" cssClass="mt-5 pull-right"></aui:button>

</aui:fieldset> 
</aui:form>