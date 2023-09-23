var navLink = document.getElementById("nav-link");

// Responsive Menu Bar
function showMenu(){
    navLink.style.right = "0";
}
function hideMenu(){
    navLink.style.right = "-350px"
}

// Working Email
function sendEmail(){
    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;
    let message = document.getElementById("message").value;
    let subject = document.getElementById("subject").value;
    
    let body = "Name:" + name + "<br/> Email: " + email + "<br/> Subject: " + subject + "<br/> Message: " + message; 
   
    Email.send({
        SecureToken : "fa9a8da9-4b03-4c6f-8f96-e19b72fe2156",
        To : 'nk685602@gmail.com',
        From : "nk685602@gmail.com",
        Subject : subject,
        Body : body
    }).then(
      message => alert(message)
    );
}