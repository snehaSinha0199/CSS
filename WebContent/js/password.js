/**function myfun() {
	var a = document.getElementById("password").value;
	var b = document.getElementById("passwords").value;
	if (a = "") {
		document.getElementById("message").innerHTML = "** Please Fill Password";
		return false;
	}

	if (a.length < 5) {
		document.getElementById("message").innerHTML = "** Password length must be greater than 5 characters";
		return false;
	}
	if (a.length > 25) {
		document.getElementById("message").innerHTML = "** Password length must be smaller than 20 characters";
		return false;
	}
	if (a != b) {
		document.getElementById("messages").innerHTML = "** Password are not same";
		return false;
	}
}**/