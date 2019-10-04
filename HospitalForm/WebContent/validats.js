function formValid() {

	var uname = document.registration.uname;
	var ucity = document.registration.city;
	var ublood = document.registration.blood;
	var upositive = document.registration.positive;
	var unegative = document.registration.negative;

	var uadd = document.registration.address;

	if (allLetter(uname)) {
		if (alphanumeric(uadd)) {
			if (cityselect(ucity)) {
				if (bloodselect(ublood)) {
					if (rh(upositive, unegative)) {
					}

				}
			}

		}
	}
	return false;

}
function allLetter(uname) {
	var letters = /^[A-Za-z]+$/;
	if (uname.value.match(letters)) {
		return true;
	} else {
		alert('Username must have alphabet characters only');
		uname.focus();
		return false;
	}
}
function alphanumeric(uadd) {
	var letters = /^[0-9a-zA-Z]+$/;
	if (uadd.value.match(letters)) {
		return true;
	} else {
		alert('User address must have alphanumeric characters only');
		uadd.focus();
		return false;
	}
}
function cityselect(ucity) {
	if (ucity.value == "Default") {
		alert('Select your city from the list');
		ucity.focus();
		return false;
	} else {
		return true;
	}
}
function bloodselect(ublood) {
	if (ublood.value == "Default") {
		alert('Select your blood type from the list');
		ublood.focus();
		return false;
	} else {
		return true;
	}
}
function rh(upositive, unegative) {
	x = 0;

	if (upositive.checked) {
		x++;
	}
	if (unegative.checked) {
		x++;
	}
	if (x == 0) {
		alert('Select P/N');
		upositive.focus();
		return false;
	} else {
		alert('Form Succesfully Submitted');
		window.location.reload()
		return true;
	}
}