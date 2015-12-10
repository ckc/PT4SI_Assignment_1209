<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
        <link rel="stylesheet" href="css/bootstrap.min.css" crossorigin="anonymous">
        <link rel="stylesheet" href="css/buttons.css">
        <script src="js/jquery-1.11.3.min.js"></script>
        <script src="js/bootstrap.min.js" crossorigin="anonymous"></script>

    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Population Query</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">Index</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Online Query <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="EducationServlet">By Education</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="AgeServlet">By Age</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="DistrictServlet">By District</a></li>
                            </ul>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>

        <div class="row" style="padding: 20% 0 0 0">
            <div class="container col-lg-offset-2">
                <div class="col-lg-4">
                    <form method="post" action="http://localhost:49697/WebService.asmx/getAllByEdu">
                        <table>
                            <tr>
                                <td><input type="submit" value="Population by Education(XML)" class="button button-glow button-border button-rounded button-primary"></td></tr>
                        </table>
                    </form>
                </div>
                <div class="col-lg-4">
                    
                        <table>
                            <tr>
                                <td><a href="http://localhost:8080/Servlet/EduServletJson" class="button button-glow button-border button-rounded button-primary">Population by Education(JSON)</a></td></tr>
                        </table>
                </div>
            </div>
        </div>


    </body>
</html>
