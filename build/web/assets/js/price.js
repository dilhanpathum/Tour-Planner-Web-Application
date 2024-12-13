/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function selectAccomadation() {
    let accomadation = document.getElementById("accommodation").value


    switch (accomadation) {
        case "Ella Family Resorts":
            document.getElementById("price").value = "Rs.9000"
            break;
        case "MOUNT VIEW GUEST Diyaluma":
            document.getElementById("price").value = "Rs.6000"
            break;
        case "Boo Kirinda Holiday Resort":
            document.getElementById("price").value = "Rs.4500"
            break;
        case "Wellassa villa":
            document.getElementById("price").value = "Rs.5500"
            break;
        case "Ella Flower Garden Resort":
            document.getElementById("price").value = "Rs.8000"
            break;
        case "Morning Dew Boutique Hotel Ella":
            document.getElementById("price").value = "Rs.7500"
            break;
        case "Zion View Ella Green Retreat":
            document.getElementById("price").value = "Rs.9000"
            break;
        case "Mountain Heavens":
            document.getElementById("price").value = "Rs.6000"
            break;
            
            case "Hotel City Grand Ella":
            document.getElementById("price").value = "Rs.7000"
            break;
        case "Heart of Ella":
            document.getElementById("price").value = "Rs.8500"
            break;
            }
        }