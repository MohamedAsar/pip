AUI().ready(
	'liferay-sign-in-modal',
	function(A) {
		var signIn = A.one('.sign-in > a');

		if (signIn && signIn.getData('redirect') !== 'true') {
			signIn.plug(Liferay.SignInModal);
		}
	}
);

Liferay.on(
		'allPortletsReady',

		/*
		This function gets loaded when everything, including the portlets, is on
		the page.
		*/

		function() {
			
		}
	);

$(window).on("load", function (e) {
	$( "link[rel='icon']" ).prop("href",$("#themeIcon").val());	
});