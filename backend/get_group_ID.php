<?php
include "connect_to_DB.php";
// Create connection
$userID = $_GET["UID"];


$sql = "SELECT GroupID FROM userToGroups WHERE UID=".$userID;
$result = $conn->query($sql);

$resArray = [];
    // output data of each row
$counter = 0;
    while($row = $result->fetch_assoc()) {
//	echo $row["GroupID"];
	$resArray[$counter] = intval($row["GroupID"]);
	$counter = $counter+1;
    }



$jsonArr = array("groupIDs" => $resArray);
echo json_encode($jsonArr);

//echo $userID;
$conn->close();
?>
