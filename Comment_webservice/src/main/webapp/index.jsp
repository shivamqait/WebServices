<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="style2.css">
</head>
<body>
<div class="login">
    <form action="http://localhost:8080/Comment_webservice/webapi/users/login" method="POST">
        <h2>Sign in</h2>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" class="form-control" name="email" placeholder="Enter your email" required>    
        </div>
        <div class="form-group">
            <label for="pwd">Password:</label>
            <input type="password" class="form-control" name="pwd" placeholder="Enter your password" required> 
        </div>
        <div class="form-group form-check">
            <label class="form-check-label">
            <input class="form-check-input" type="checkbox"> Remember me
            </label>
        </div>
            <button type="submit" class="btn">Login</button>
            <button type="submit" class="btn" onclick="location.href = 'signup.html';">Signup</button>
            
    </form>
</div>


</body>
</html>
