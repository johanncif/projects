/*LOGIN PAGE JAVASCRIPT*/

function no_login() {
    var user = document.getElementById('username-field');
    var password = document.getElementById('password-field');

    if (user.value === "" || password.value === "") {
        alert('Invalid login');
    }

    else {
        alert('Successful login');
    }
}


/*add a registration page later*/
function registration() {
    window.open("#");
}

