<?php
include "connect_to_DB.php";
// Create connection
$fbID = $_GET["fbID"];
$name = $_GET["name"];
$year = $_GET["year"];

$sql = "SELECT UID FROM `users` WHERE facebookID=".$fbID;
$result = $conn->query($sql);
if ($result->num_rows > 0) {
    // output data of each row
$row = $result->fetch_assoc();
echo json_encode(array("UID"=> intval($row["UID"])));
	}
 else {
 

$sql = "INSERT INTO `users` (`name`, `year`, `facebookID`) VALUES ('".$name."', ".$year.", ".$fbID.")";
$result = $conn->query($sql);

//echo $sql;
//$jsonArr = array("userIDs" => $resArray);
//echo json_encode($jsonArr);
$sql = "SELECT UID FROM `users` WHERE name = '".$name."' AND year = ".$year." AND facebookID =".$fbID;
$result = $conn->query($sql);
$row = $result->fetch_assoc();
echo json_encode(array("UID" => intval($row["UID"]))); 
//echo $userID;
}
$conn->close();
?>
