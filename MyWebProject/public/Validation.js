/**
 * 
 */
function checkEmptyField(fieldID){
	alert('The empty field'+fieldID);
}

  
function wow(){
				var x=document.getElementById('uname').value;
				var y=document.getElementById('upass').value;
				console.log('value of x : '+x);
				console.log('value of y : '+y);
				if(x==""){
					//alert('Username  is blank');
					document.getElementById('nameErr').innerHTML="Username can't be blank";
					return false;
				}if(y==""){
					//alert('Password is blank');
					document.getElementById('passErr').innerHTML="Password can't be blank";
					return false;
				}
				return true;
}
			
function clearForm(){
				document.getElementById('uname').value='';
				document.getElementById('upass').value='';
}
			
function clearNameErr(){
				document.getElementById('nameErr').innerHTML="";
}
			
function clearPassErr(){
				document.getElementById('passErr').innerHTML="";
}