/**
 * 
 */

  function checkEmptyField(fieldId) {
 
 	alert('checkEmptyField '+fieldId);
 	
 }
 
 function validate() {
				var x=document.getElementById('uname').value;
				var y=document.getElementById('upass').value;
				console.log('value of x '+x);
				//console.log('value of y '+y);

				if(x =="") {
					//alert('Username cannot be blank');	
					document.getElementById("nameErr").innerHTML="Username cannot be blank";
					return false;
				}		
				
				if(y =="") {
					//alert('Password cannot be blank');	return false
					document.getElementById("passErr").innerHTML="Password cannot be blank";
					return false;
				}
				return true;
			}	
 
 function clearTheForm() {
				document.getElementById('uname').value="";
				document.getElementById('upass').value="";
}

function clearNameErrMsg() {
				document.getElementById('nameErr').innerHTML="";

}
			
function clearPassErrMsg() {
				document.getElementById('passErr').innerHTML="";

}


function validateEmail() {
  const res = /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/;
  if(res.test(document.getElementById('uemail').value.toLowerCase())==false){
	  
	alert('Invalid Email Address');
  }
  
  return res.test(document.getElementById('uemail').value.toLowerCase());
 }
 
 function validateName() {
      const password = document.getElementById('uname').value;


      // Regular expressions to check for lowercase, uppercase, number, and special character
      const lowercaseRegex = /[a-z]/;
      const uppercaseRegex = /[A-Z ]/;
      const numberRegex = /[0-9]/;
      const specialCharRegex = /[!@#$%^&*()_+[\]{};':"\\|,.<>?]/;

      // Check if the password matches all the criteria
      const containsLowercase = lowercaseRegex.test(password);
      const containsUppercase = uppercaseRegex.test(password);
      const containsNumber = numberRegex.test(password);
      const containsSpecialChar = specialCharRegex.test(password);

      // Validate the password
      if ((containsLowercase || containsUppercase )&& !(containsNumber) && !(containsSpecialChar)) {
        return true;
      } else {
        alert("Enter valid name");
        return false;
      }
    }
 
    function validatePassword() {
      const password = document.getElementById('upass').value;
   
      // Regular expressions to check for lowercase, uppercase, number, and special character
      const lowercaseRegex = /[a-z]/;
      const uppercaseRegex = /[A-Z]/;
      const numberRegex = /[0-9]/;
      const specialCharRegex = /[!@#$%^&*()_+[\]{};':"\\|,.<>?]/;

      // Check if the password matches all the criteria
      const containsLowercase = lowercaseRegex.test(password);
      const containsUppercase = uppercaseRegex.test(password);
      const containsNumber = numberRegex.test(password);
      const containsSpecialChar = specialCharRegex.test(password);

      // Validate the password
      if (containsLowercase && containsUppercase && containsNumber && containsSpecialChar) {
        return true;
      } else {
        alert("Password must contain at least one lowercase letter, one uppercase letter, one number, and one special character.");
        return false;
      }
    }
    
    function validateRegisterName(){
		const password = document.getElementById('urname').value;
	

      // Regular expressions to check for lowercase, uppercase, number, and special character
      const lowercaseRegex = /[a-z]/;
      const uppercaseRegex = /[A-Z ]/;
      const numberRegex = /[0-9]/;
      const specialCharRegex = /[!@#$%^&*()_+[\]{};':"\\|,.<>?]/;

      // Check if the password matches all the criteria
      const containsLowercase = lowercaseRegex.test(password);
      const containsUppercase = uppercaseRegex.test(password);
      const containsNumber = numberRegex.test(password);
      const containsSpecialChar = specialCharRegex.test(password);

      // Validate the password
      if(password.length<8){
		  alert("Name cannot be under 8 char");
		  return false;
	  }
      
      if ((containsLowercase || containsUppercase )&& !(containsNumber) && !(containsSpecialChar)) {
        return true;
      } else {
        alert("Enter valid name");
        return false;
      }
	}
	
	function validateRegisterPassword(){
		const password = document.getElementById('urpass').value;
	
		if(password.length<8){
			alert("Password cannot be under 8 letters.");
			return false;
		}

      // Regular expressions to check for lowercase, uppercase, number, and special character
      const lowercaseRegex = /[a-z]/;
      const uppercaseRegex = /[A-Z]/;
      const numberRegex = /[0-9]/;
      const specialCharRegex = /[!@#$%^&*()_+[\]{};':"\\|,.<>?]/;

      // Check if the password matches all the criteria
      const containsLowercase = lowercaseRegex.test(password);
      const containsUppercase = uppercaseRegex.test(password);
      const containsNumber = numberRegex.test(password);
      const containsSpecialChar = specialCharRegex.test(password);

      // Validate the password
      if (containsLowercase && containsUppercase && containsNumber && containsSpecialChar) {
        return true;
      } else {
        alert("Password must contain at least one lowercase letter, one uppercase letter, one number, and one special character.");
        return false;
      }
	}
    
     
        function validateAge() {
           var today = new Date();
        var nowyear = today.getFullYear();
        var nowmonth = today.getMonth();
        var nowday = today.getDate();
        var b = document.getElementById('udob').value;
		if(b===""){
			alert("Enter dob");
			return false;
		}


        var birth = new Date(b);

        var birthyear = birth.getFullYear();
        var birthmonth = birth.getMonth();
        var birthday = birth.getDate();

        var age = nowyear - birthyear;
        var age_month = nowmonth - birthmonth;
        var age_day = nowday - birthday;

        if ((age == 18 && age_month <= 0 && age_day <= 0) || age < 18) {
            alert("Age should be more than 18 years.Please enter a valid Date of Birth");
            return false;
        }
        
        return true;
        }
 