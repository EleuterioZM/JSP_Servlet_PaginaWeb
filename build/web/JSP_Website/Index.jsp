<%-- 
    Document   : Index
    Created on : May 4, 2024, 6:26:46 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-0Fs1Z1DFkLhzIvLjLy46xvVj8AyRXjKaz4Y6oTML1uMA+EpkLVhIQEPvLsJ3eYzP" crossorigin="anonymous">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">

    <link rel="stylesheet" href="css/style.css">
    <title>ISCIM</title>
</head>

<body>
    <header>
        <nav class="navbar_1">
            <p id="iscim">ISCIM</p>
            <img src="img/download.png" alt="">
        </nav>

        <nav class="navbar_2">
            <div id="button-menu">
                <button class="home_button">Home</button>
                <button class="about_button">About</button>
                <button class="contact_button">Contact</button>
                <button class="help_button">Help</button>
            </div>
        </nav>


    </header>
    <section>
        <table class="professional-table">
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Código</th>
                    <th>Turma</th>
                    <th>Curso</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>João Silva</td>
                    <td>001</td>
                    <td>Turma A</td>
                    <td>Engenharia Civil</td>
                </tr>
                <tr>
                    <td>Maria Santos</td>
                    <td>002</td>
                    <td>Turma B</td>
                    <td>Medicina</td>
                </tr>
                
                    <td>Carlos Oliveira</td>
                    <td>003</td>
                    <td>Turma C</td>
                    <td>Direito</td>
                </tr>
                <tr>
                    <td>Ana Pereira</td>
                    <td>004</td>
                    <td>Turma D</td>
                    <td>Administração</td>
                </tr>
            </tbody>
        </table>

    </section>
    <footer class="footer">
        <div class="container">
            <div class="footer-content">
                <div class="footer-section">
                    <h3>Author</h3>
                    <p>Mabecuane Eleuterio.</p>
                </div>
                <div class="footer-section">
                    <h3>Contact</h3>
                    <ul class="contact-links">
                        <li><a href="#" class="contact"><span>Email</span> <i class="fas fa-envelope"></i></a></li>
                        <li><a href="#" class="contact"><span>Phone</span> <i class="fas fa-phone"></i></a></li>
                        <li><a href="#" class="contact"><span>Address</span> <i class="fas fa-map-marker-alt"></i></a>
                        </li>
                    </ul>
                </div>
                <div class="footer-section">
                    <h3>Follow Us</h3>
                    <ul class="social-links">
                        <li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
                        <li><a href="#"><i class="fab fa-twitter"></i></a></li>
                        <li><a href="#"><i class="fab fa-instagram"></i></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </footer>


</body>

</html>
