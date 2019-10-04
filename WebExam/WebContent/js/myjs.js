function resetCreateTour() {
  document.forms.createTour.tourname.value = "";
  document.forms.createTour.startingloc.value = "";
  document.forms.createTour.places.value = "";
  document.forms.createTour.tourcost.value = "";
  document.forms.createTour.numdays.value = "";
  
  document.forms.createTour.discountamt.value = "0";
  document.getElementById("discountmand").innerHTML = "";
  document.forms.createTour.discountamt.disabled = true;
  document.forms.createTour.discountamt.required = false;
  document.forms.createTour.isdiscount[0].checked = false;
  document.forms.createTour.isdiscount[1].checked = true;
}


function discountChanged() {
  var discountamt = document.forms.createTour.discountamt;
  var isdiscount = document.forms.createTour.isdiscount;
  
  if (isdiscount[0].checked) {
    discountamt.disabled = false;
    discountamt.required = true;
    document.getElementById("discountmand").innerHTML = " *";
  } else {
    discountamt.disabled = true;
    discountamt.required = false;
    discountamt.value = "0";
    document.getElementById("discountmand").innerHTML = "";
  }
}

function searchCostChanged() {
  var tourcost = document.forms.searchTour.tourcost;
  var places = document.forms.searchTour.places;
  
  if (tourcost.value == "") {
    places.required = true;
  } else {
    places.required = false;
  }
}

function searchPlacesChanged() {
  var tourcost = document.forms.searchTour.tourcost;
  var places = document.forms.searchTour.places;
  
  if (places.value == "") {
    tourcost.required = true;
  } else {
    tourcost.required = false;
  }
}

function bookSelectedTour() {
  
  var tours = document.getElementsByName("subscribe");
  var tourId = -1;
  
  for (var i = 0; i < tours.length; i++) {
    if (tours[i].checked) {
      tourId = tours[i].value;
      break;
    }
  }
  if (tourId != -1)
    window.location.replace(ctx + "/pages/booktour.jsp?tour=" + tourId);
}