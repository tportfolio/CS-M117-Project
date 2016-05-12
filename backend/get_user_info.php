<?php
include "connect_to_DB.php";
// Create connection
$userID = $_GET["UID"];


$sql = "SELECT name, year FROM users WHERE UID=".$userID;
$result = $conn->query($sql);

    // output data of each row
    $row = $result->fetch_assoc(); 
//	echo $row["GroupID"];
	$name = $row["name"];
	$year = intval($row["year"]);

$jsonArr = array("name" => $name, "year" => $year);
echo json_encode($jsonArr);

//echo $userID;
$conn->close();
?>
