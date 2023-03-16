<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <link rel="stylesheet" href="./forgotPassword.css">
</head>

<body>
    <section class="facebook">
       
        <form action="/forgotPassword">
            
            <div class="name">
                <input id="name" type="text" name="email" placeholder="Email addres " maxlength="30" minlength="8">
            </div>
            <div>
                <input id="pass" type="password" name="number" minlength="8" maxlength="10" placeholder="Enter Phone number">
            </div>
            <div>

                <button id="login"><input type="submit" value="Log in"></button>
            </div>
            <h3>${message}</h3>
        </form>
        <button><a href="./index.jsp" style="text-decoration: none; border: none;">Click here for login</a></button>
        </section>

        </div>
    </section>

</body>

</html>