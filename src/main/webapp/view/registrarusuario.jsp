<%-- 
    Document   : registrarusuario
    Created on : 6/06/2018, 03:46:08 PM
    Author     : Luisa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>Template for CREDITOS</title>

        <!-- Bootstrap core CSS -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="${pageContext.servletContext.contextPath}/css/jumbotron.css" rel="stylesheet">
    </head>

    <body>

        <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">

            <a class="navbar-brand" href="#">Aplicacion - MENU -</a>

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                <ul class="navbar-nav mr-auto">
                    
                    <li class="nav-item active">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/view/menu.jsp">INICIO</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/view/registrarusuario.jsp">Resgistrar Usuarios</a>
                    </li>
                    
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/UsuarioServlet?accion=listar">Listar Usuarios</a>
                    </li> 

                </ul>        
            </div>
        </nav>

        <main role="main">

            <!-- Main jumbotron for a primary marketing message or call to action -->
            <div class="jumbotron">
                <div class="container">

                    <!-- FORM INVOCA AL SERVLET -->
                    <form method="post"
                          action="${pageContext.servletContext.contextPath}/UsuarioServlet">

                        <div class="form-row">
                            <div class="col">
                                <input type="text" name="txtnombre" class="form-control" placeholder="Nombre">
                            </div>  
                            <div class="col">
                                <input type="text" name="txtapellido" class="form-control" placeholder="Apellido">
                            </div>
                        </div>
                        
                        <br>

                        <div class="form-row">                            
                            <div class="col">
                                <input type="text" name="txtdocumento" class="form-control" placeholder="Documento">
                            </div>                            
                            <div class="col">
                                <input type="text" name="txtemail" class="form-control" placeholder="Email">
                            </div>                            
                        </div>
                        
                        <br>
                        
                        <div class="form-row">                            
                            <div class="col">
                                <input type="text" name="txtclave" class="form-control" placeholder="Clave">
                            </div>                            
                            <div class="col">
                                
                            </div>                            
                        </div>
                        
                          <br>

                        <div class="form-row">                            
                            <div class="col-sm-3">
                                <label for="inputState">Rol:</label>                                 
                            </div>
                            <div class="col-sm-3"> 
                                <select id="inputState" class="form-control" name="txtrol">
                                    <option value="administrador">Administrador</option>
                                    <option value="estudiante">Estudiante</option>
                                </select>
                            </div>
                        </div>
                          
                        <br>
                          
                        <div class="form-row">                            
                            <div class="col-sm-3">
                                <label for="inputState">Estado:</label>                                 
                            </div>
                            <div class="col-sm-3"> 
                                <select id="inputState" class="form-control" name="txtestado">
                                    <option selected value="activo">Activo</option>
                                    <option value="inactivo">Inactivo</option>
                                </select>
                            </div>
                        </div>
                        
                        <br>

                        <!-- DIV BOTONES -->
                        <!-- DIV BOTONES -->
                        <center>
                            <div class="">
                                <button name="accion" value="crear" type="submit" class="btn btn-primary">Registrar Usuario</button>
                            </div>                            
                            <!--div class="">
                                <button name="accion" value="listar" type="submit" class="btn btn-primary">Listar cursos</button>
                            </div-->
                        </center>

                    </form>

                </div>
            </div>

        </main>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>

    </body>
</html>