function submitForm() {
    const form = document.getElementById("surveyForm");
    if (form.checkValidity()) {
      const firstName = document.getElementById("firstName").value;
      const lastName = document.getElementById("lastName").value;
      const dob = document.getElementById("dob").value;
      const country = document.getElementById("country").value;
      const gender = [
        ...document.querySelectorAll('input[name="gender"]:checked'),
      ].map((checkbox) => checkbox.value);
      const profession = document.getElementById("profession").value;
      const email = document.getElementById("email").value;
      const mobile = document.getElementById("mobile").value;
  
      const popupData = `
                      <p><strong>First Name:</strong> ${firstName}</p>
                      <p><strong>Last Name:</strong> ${lastName}</p>
                      <p><strong>Date of Birth:</strong> ${dob}</p>
                      <p><strong>Country:</strong> ${country}</p>
                      <p><strong>Gender:</strong> ${gender.join(", ")}</p>
                      <p><strong>Profession:</strong> ${profession}</p>
                      <p><strong>Email:</strong> ${email}</p>
                      <p><strong>Mobile Number:</strong> ${mobile}</p>
                  `;
  
      // Set the popup content
      document.getElementById("popup-data").innerHTML = popupData;
  
      // Display the popup
      document.getElementById("popup").style.display = "block";
  
      // Reset the form
      form.reset();
    }
  }
  
  function closePopup() {
    // Close the popup and reset the form
    document.getElementById("popup").style.display = "none";
  }
  