function formValidation()
{

var ufirstname = document.registration.firstname;
var umiddlename = document.registration.middlename;
var ulastname = document.registration.lastname;
var uadd = document.registration.address;
var ucategory = document.registration.category;
var uzip = document.registration.zip;
var uemail = document.registration.email;
var uphone = document.registration.phone;
var umale = document.registration.male;
var ufemale = document.registration.female;
var udate = document.registration.DOB;
validdate(udate);

if(allLetter1(ufirstname))
{
if(allLetter2(umiddlename))
{
if(allLetter3(ulastname))
{	
if(categoryselect(ucategory))
{
if(alphanumeric1(street1))
{
if(alphanumeric2(city))
{
if(alphanumeric3(state))
{ 

if(ValidateEmail(uemail))
{
if(ValidatePhone(uphone))
{	
if(validsex(umale,ufemale))
{ 
if(validdate(udate))
{	
}}
}
} 
}
}}
}
}
}
}
return false;

} 

function allLetter1(ufirstname)
{ 
var letters = /^[a-zA-Z ]{0,25}$/;
if(ufirstname.value.match(letters))
{
return true;
}
else 
{
alert('middlename must have alphanumeric and 25 characters only');
ufirstname.focus();
return false;
}
}

function validdate(udate)
{ 
var date = /^([0-9]{2})\/([0-9]{2})\/([0-9]{4})$/;
if(udate.value.match(date))
{
return true;
}
else
{
alert('invalid date format');
udate.focus();
return false;
}
}


function ValidatePhone(uphone)
{ 
var num = /^\(?(\d{3})\)?[- ]?(\d{3})[- ]?(\d{4})$/;
if(uphone.value.match(num))
{
return true;
}
else
{
alert('wrong phone num format');
uphone.focus();
return false;
}
}



function allLetter2(middlename)
{ 
var letters = /^[a-zA-Z ]{0,25}$/;
if(middlename.value.match(letters))
{
return true;
}
else 
{
alert('middlename must have alphanumeric and 25 characters only');
middlename.focus();
return false;
}
}

function allLetter3(lastname)
{ 
var letters = /^[a-zA-Z ]{0,25}$/;
if(lastname.value.match(letters))
{
return true;
}
else
{
alert('lastname must have alphanumeric and 25 characters only');
lastname.focus();
return false;
}
}


function alphanumeric1(street1)
{ 
var letters = /^[0-9a-zA-Z]+$/;
if(street1.value.match(letters))
{
return true;
}
else
{
alert('User address must have alphanumeric characters only');
street1.focus();
return false;
}
}

function alphanumeric2(city)
{ 
var letters = /^[0-9a-zA-Z]+$/;
if(city.value.match(letters))
{
return true;
}
else
{
alert('User address must have alphanumeric characters only');
city.focus();
return false;
}
}

function alphanumeric3(state)
{ 
var letters = /^[0-9a-zA-Z]+$/;
if(state.value.match(letters))
{
return true;
}
else
{
alert('User address must have alphanumeric characters only');
state.focus();
return false;
}
}


function categoryselect(ucategory)
{
if(ucategory.value == "Default")
{
alert('Select your category from the list');
ucategory.focus();
return false;
}
else
{
return true;
}
}

function ValidateEmail(uemail)
{
var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
if(uemail.value.match(mailformat))
{
return true;
}
else
{
alert("You have entered an invalid email address!");
uemail.focus();
return false;
}
}
function validsex(umale,ufemale)
{
x=0;

if(umale.checked) 
{
x++;
} if(ufemale.checked)
{
x++; 
}
if(x==0)
{
alert('Select Male/Female');
umale.focus();
return false;
}
else
{
alert('Form Succesfully Submitted');
window.location.reload()
return true;
}
}