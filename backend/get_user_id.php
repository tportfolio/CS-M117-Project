<?php
include "connect_to_DB.php";
// Create connection
$fbID = $_GET["fbID"];


$sql = "SELECT UID FROM users WHERE facebookID=".$fbID;
$result = $conn->query($sql);

    // output data of each row
    $row = $result->fetch_assoc(); 
//	echo $row["GroupID"];
	$resUID = intval($row["UID"]);
    


$jsonArr = array("UID" => $resUID);
echo json_encode($jsonArr);

//echo $userID;
$conn->close();
?>
