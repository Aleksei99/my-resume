/**
 * Contact form
 * @version 1.0.0
 */

//check the form validation
$("#contactForm").validator().on('submit', function (event) {

    if($('#form-submit').hasClass('disabled') == false) {
        event.preventDefault();
        submitForm();
    }
});

//fetch all the values from form
function submitForm(){
    // Initiate Variables With Form Content
    var name    = $("#inputName").val();
    var phone   = $("#inputPhone").val();
    var email   = $("#inputEmail").val();
    var subject = $("#inputSubject").val();
    var message = $("#inputMessage").val();

    var messageObject={
        name:name,
        phone:phone,
        email:email,
        subject:subject,
        message:message
    }

    //process remote data
    $.ajax({
        type: "POST",
        url: "mail",
        contentType: 'application/json',
        data: JSON.stringify(messageObject),
        success : function(data){
            if (data == "success"){
                submitMSG('Message has been sent');
            } else {
                submitMSG(data);
            }
        }
    });
}

//submit message
function submitMSG(msg)
{
    $("#msgSubmit").removeClass().addClass('animated fadeIn h3 text-center col-md-6 col-md-offset-3').text(msg);
}