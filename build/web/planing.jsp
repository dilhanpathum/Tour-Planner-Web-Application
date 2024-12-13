<%-- 
    Document   : planing
    Created on : Aug 2, 2023, 7:53:37 PM
    Author     : dilha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %> 
<%  
    
    String fname = null;
    String userId = null;

    Cookie[] cks = request.getCookies();
    if (cks != null) {
        for (Cookie ck : cks) {
            if (ck.getName().equals("fname")) {
                fname = ck.getValue();
            }
            if (ck.getName().equals("user_id")) {
                userId = ck.getValue();
            }
        }
    } else {
        response.sendRedirect("index.html");
    }
    
    %>
<!DOCTYPE html>
<html data-bs-theme="light" lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <title>Planning Trip</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/styles-planing.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <script src="https://kit.fontawesome.com/998ab80927.js" crossorigin="anonymous"></script>
    </head>

    <body style="background: url(assets/img/1979344-ai.jpg;) no-repeat;background-size: cover;">
        <header>

            <nav class="navbar navbar-expand-lg navbar-dark bg-primary w-100">
                <div class="container mb-2">
                    <a class="navbar-brand d-flex justify-content-between" href="index.jsp">
                        <img src="logo.png" alt="Logo" width="15%">
                    </a>
                    <div class="dropdown">
                        <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <%= fname%>
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <a class="dropdown-item" href="logout.jsp">Sign Out</a>
                        </div>
                    </div>
               
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">

                            <li class="nav-item">
                                <a class="nav-link" href="about-us.html">About</a>
                            </li> 
                            <li class="nav-item">
                                <a class="nav-link" href="feedback.html">Feedback</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#"><i class="fa fa-solid fa-bell" style="color: black;"></i></a>
                            </li>
                            

                        </ul>
                    </div>
                </div>
            </nav>
        </header>
        <div></div>
        <div class="container"></div>
        <div class="container"></div>
        <div class="col-12 d-flex mt-3">
            <div class="container-fluid d-flex justify-content-center">
                <form action="planning-process.jsp" method="POST" class="col-md-12 col-sm-12 col-lg-8" style="background-color: #0f5a73">
                    <div class="card shadow mb-3">
                        <div class="card-header py-3">
                            <p class="text-primary m-0 fw-bold">Fill about your plan details from here...</p>
                        </div>
                        <div class="card-body">
                            <div class="row">
                                <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
                                    <div class="mb-3"><label class="form-label" for="service_name"><strong>Plan
                                                Name</strong></label><input class="form-control" type="text"
                                                                    id="service_name" placeholder="Name service" name="plan_name" required="">
                                    </div>
                                </div>
                            </div>
                            <div class="mb-3">
                                <div class="row mb-2">
                                    <div class="col col-lg-8 col-sm-12 col-md-8 col-xl-6">
                                        <div class="mb-3"><label class="form-label" for="client_description"><strong>Plan
                                                    Date</strong></label><input class="form-control"
                                                                        id="service_client_start_date" type="date" name="plan_date"
                                                                        required=""></div>
                                    </div>
                                </div>
                            </div>
                            <div class="mb-3">
                                <div class="row mb-2">
                                    <div class="col col-lg-8 col-sm-12 col-md-8 col-xl-6">
                                        <div class="mb-3"><label class="form-label"
                                                                 for="client_description"><strong>Location</strong></label><select
                                                                 class="form-select" name="location">
                                                <optgroup label="Select Location">
                                                    <option value="Dunhida" selected="">Dunhida</option>
                                                    <option value="Ella Rock">Ella Rock</option>
                                                    <option value="Little Adam's Peak">Little Adam's Peak</option>
                                                    <option value="Ravana Ella" selected="">Ravana Ella</option>
                                                    <option value="Narangala">Narangala</option>
                                                    <option value="Namunukula">Namunukula</option>
                                                </optgroup>
                                            </select></div>
                                    </div>
                                </div>
                            </div>
                            <div class="mb-3"><label class="form-label" for="service_client_payment_validated"><strong>What
                                        You Need</strong></label>
                                <div class="form-group mb-3">
                                    <div class="row">
                                        <div class="col col-md-3 col-sm-6 col-xs-6">
                                            <div class="form-check"><input class="form-check-input" type="checkbox"
                                                                           id="formCheck-1" name="items" value="6500"><label class="form-check-label"
                                                                           for="formCheck-1">Camping Items</label></div>
                                        </div>
                                        <div class="col col-md-3 col-xs-6 col-sm-6">
                                            <div class="form-check"><input class="form-check-input" type="checkbox"
                                                                           id="formCheck-2" name="items" value="2500"><label class="form-check-label"
                                                                           for="formCheck-2">Hiking Items</label></div>
                                        </div>
                                        <div class="col col-md-3 col-xs-6 col-sm-6">
                                            <div class="form-check"><input class="form-check-input" type="checkbox"
                                                                           id="formCheck-3" name="items" value="10000"><label class="form-check-label"
                                                                           for="formCheck-3">Transport</label></div>
                                        </div>
                                        <div class="col col-md-3 col-xs-6 col-sm-6">
                                            <div class="form-check"><input class="form-check-input" type="checkbox"
                                                                           id="formCheck-6" name="items" value="6000"><label class="form-check-label"
                                                                           for="formCheck-6">Cold Weather Clothes</label></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row mb-2">
                                <div class="col col-lg-8 col-sm-12 col-md-8 col-xl-6">
                                    <div class="mb-3"><label class="form-label"
                                                             for="client_description"><strong>Accommodations</strong></label><select
                                                             class="form-select" id="accommodation" onchange="selectAccomadation()" name="accomadation">
                                            <optgroup label="Select Accommodation">
                                                <option value="Ella Family Resorts" selected="">Ella Family Resorts</option>
                                                <option value="MOUNT VIEW GUEST Diyaluma">MOUNT VIEW GUEST Diyaluma</option>
                                                <option value="Boo Kirinda Holiday Resort">Boo Kirinda Holiday Resort</option>
                                                <option value="Wellassa villa">Wellassa villa</option>
                                                <option value="Ella Flower Garden Resort">Ella Flower Garden Resort</option>
                                                <option value="Morning Dew Boutique Hotel Ella">Morning Dew Boutique Hotel Ella</option>
                                                <option value="Zion View Ella Green Retreat">Zion View Ella Green Retreat</option>
                                                <option value="Mountain Heavens">Mountain Heavens</option>
                                                <option value="Hotel City Grand Ella">Hotel City Grand Ella</option>
                                                <option value="Heart of Ella">Heart of Ella</option>
                                            </optgroup>
                                        </select></div>
                                </div>
                                <div class="col-sm-12 col-md-4 col-lg-4">
                                    <div class="mb-3"><label class="form-label" for="service_price"><strong>Price
                                                *</strong><br></label><input class="form-control" type="text"
                                                                     id="price" placeholder="" name="price" value="<%out.println("Rs.9000");%>" readonly=""></div>
                                </div>
                            </div>
                                
                                <div class="mb-3">
                                <div class="row mb-2">
                                    <div class="col col-lg-8 col-sm-12 col-md-8 col-xl-6">
                                        <div class="mb-3"><label class="form-label"
                                                                 for="client_description"><strong>What time do you want to go</strong></label><select
                                                                 class="form-select" name="time">
                                                <optgroup label="Select Time">
                                                    <option value="Morning" selected="">Morning</option>
                                                    <option value="Afternoon">Afternoon</option>
                                                    <option value="Evening">Evening</option>
                                                    <option value="Night">Night</option>
                                                </optgroup>
                                            </select></div>
                                    </div>
                                </div>
                            </div>
                            <div class="row mb-2">
                                <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
                                    <div class="mb-3"><label class="form-label"
                                                             for="service_name"><strong>Note</strong></label><textarea
                                                             class="form-control" name="note"></textarea></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="text-end mb-3"><input class="btn btn-primary btn-lg" type="submit" value="Save Plan" /></div>
                </form>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
        <script src="assets/js/price.js"></script>
    </body>

</html>
