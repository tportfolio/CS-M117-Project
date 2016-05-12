<?php
$servername = "127.8.96.130";
$username = "adminDJRpCZF";
$password = "Z42aZXN7SwWP";
$dbName = "groupToDo";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbName);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
//echo "Connected successfully";


?>
