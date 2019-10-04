function resetAddBook() {
  document.forms.addBook.bookid.value = "";
  document.forms.addBook.bookname.value = "";
  document.forms.addBook.bookcat.value = "";
}

function resetUpdateBook() {
  document.forms.updateBook.bookid.value = "";
  document.forms.updateBook.bookname.value = "";
  document.forms.updateBook.bookcat.value = "";
}

function isAlphaNumeric(input) {
  if (/^[a-z0-9]*/i.test(input)) {
    return true;
  }
  return false;
}
