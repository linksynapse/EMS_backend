<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>SDK::E-PASS</title>
</head>
<body>
<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Information</th>
    </tr>
  </thead>
  <tbody>
  	<tr>
      <th scope="row">Picture</th>
      <td><img src="data:image/png;base64, ${User.getPicture()}"></td>
    </tr>
    <tr>
      <th scope="row">PassNo</th>
      <td>${User.getPassNo()}</td>
    </tr>
    <tr>
      <th scope="row">Name</th>
      <td>${User.getName()}</td>
    </tr>
    <tr>
      <th scope="row">MobileNumber</th>
      <td>${User.getMobileNumber()}</td>
    </tr>
    <tr>
      <th scope="row">Occupation</th>
      <td>${User.getOccupation()}</td>
    </tr>
    <tr>
      <th scope="row">Email</th>
      <td>${User.getEmail()}</td>
    </tr>
    <tr>
      <th scope="row">NRIC</th>
      <td>${User.getNRIC()}</td>
    </tr>
    <tr>
      <th scope="row">Category</th>
      <td>${User.getCategory()}</td>
    </tr>
    <tr>
      <th scope="row">Company</th>
      <td>${User.getCompany()}</td>
    </tr>
    <tr>
      <th scope="row">DateOfSIC</th>
      <td>${User.getDateOfSIC()}</td>
    </tr>
    <tr>
      <th scope="row">Nationality</th>
      <td>${User.getNationality()}</td>
    </tr>
    <tr>
      <th scope="row">CompanyRole</th>
      <td>${User.getCompanyRole()}</td>
    </tr>
    <tr>
      <th scope="row">CSOC</th>
      <td>${User.getCSOC()}</td>
    </tr>
    <tr>
      <th scope="row">ExpireDate</th>
      <td>${User.getExpireDate()}</td>
    </tr>
    <tr>
      <th scope="row">Remark</th>
      <td>${User.getRemark()}</td>
    </tr>
    <tr>
      <th scope="row">AdditionalCourse</th>
      <td>${User.getAdditionalCourse()}</td>
    </tr>
    <tr>
      <th scope="row">DateOfCourseFrom</th>
      <td>${User.getDateOfCourseFrom()}</td>
    </tr>
    <tr>
      <th scope="row">DateOfCourseTo</th>
      <td>${User.getDateOfCourseTo()}</td>
    </tr>
    
  </tbody>
</table>
</body>
</html>
