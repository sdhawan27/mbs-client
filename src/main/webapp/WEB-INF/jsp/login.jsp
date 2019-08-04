<html>

<head>
<title>Movie Booking Site</title>
</head>

<body>
    <font color="red">${errorMessage}</font>
    <form method="post" action="validateUser">
        User Name : <input type="text" name="name" />
        <br/>
        Password : <input type="password" name="password" />
        <br/>
        <input value="Sign in" type="submit" />
    </form>
</body>

</html>