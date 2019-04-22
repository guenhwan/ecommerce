$(document).on('click', '#loginBtn', function (event) {
	let obj = {};
	$("form").find("input[class=form-control]").each(function () {
		obj[this.id] = this.value;
	});

	$.ajax({
		type: "POST",
		url: "/json/user/login",
		data: JSON.stringify(obj),
		dataType: "json",
		contentType: "application/json; charset=utf-8;",
		success: function (e) {
			console.log(e);
		},
		error: function (xhr, status, error) {
			alert(error);
		}
	});
});