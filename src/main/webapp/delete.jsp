<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>delete Page</title>
    <link rel="stylesheet" href="./delete.css">
</head>

<body>
    <section class="facebook">
       
        <h2>Delete User</h2>
        <form action="/delet">
            
            <div class="name">
                <input id="name" type="text" name="email" placeholder="Email or phone number " maxlength="30" minlength="8">
            </div>
            <div>
                <input id="pass" type="password" name="password" minlength="8" maxlength="10" placeholder="Enter password">
            </div>
            <div>

                <button id="login"><input type="submit" value="submit"></button>
            </div>
            <h3>${message}</h3>
        </form>
        <button><a href="./index.jsp" style="text-decoration: none; border: none;">Click here for login</a></button>
        </section>

        </div>
    </section>

</body>

</html>