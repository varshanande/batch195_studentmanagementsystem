<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-4">

            <!-- Error message -->
            <c:if test="${not empty login_fail}">
                <div class="alert alert-danger text-center">
                    ${login_fail}
                </div>
            </c:if>

            <div class="card shadow">
                <div class="card-body">
                    <h3 class="text-center mb-4">Admin Login</h3>

                    <!-- IMPORTANT: POST method -->
                    <form action="login" method="post">

                        <div class="mb-3">
                            <label class="form-label">Username</label>
                            <input type="text"
                                   name="username"
                                   class="form-control"
                                   required>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Password</label>
                            <input type="password"
                                   name="password"
                                   class="form-control"
                                   required>
                        </div>

                        <div class="d-grid">
                            <button type="submit" class="btn btn-primary">
                                Login
                            </button>
                        </div>

                    </form>
                </div>
            </div>

        </div>
    </div>
</div>

</body>
</html>
