<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <link rel="stylesheet" href="./index.css">
</head>

<body>
    <section class="facebook">
       
        <form action="/index">
            <h3>${message}</h3>
            <div class="name">
                <input id="name" type="text" name="emailornumber" placeholder="Email addres or Phone number" maxlength="30" minlength="8">
            </div>
            <div>
                <input id="pass" type="password" name="password" minlength="8" maxlength="10" placeholder="Password">
            </div>
            <div>

                <button id="login"><input type="submit" value="Log in"></button>
            </div>
        </form>

        <section id="center">

            <div>
                <p style="color:blue ;"><a href="./forgotPassword.jsp" style="text-decoration: none;">Forgot password?</a></p>
            </div>
            <div id="hr">
                <hr>
            </div>
            <button id="acc"><a href="./addUser.jsp">
                    Create New account</a></button>
        </section>

        </div>
    </section>

</body>

</html>