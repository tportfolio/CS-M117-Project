<?php
include "connect_to_DB.php";
// Create connection
$groupID = $_GET["GroupID"];


$sql = "SELECT UID FROM userToGroups WHERE GroupID=".$groupID;
$result = $conn->query($sql);

$resArray = [];
    // output data of each row
$counter = 0;
    while($row = $result->fetch_assoc()) {
//	echo $row["GroupID"];
	$resArray[$counter] = intval($row["UID"]);
	$counter = $counter+1;
    }



$jsonArr = array("userIDs" => $resArray);
echo json_encode($jsonArr);

//echo $userID;
$conn->close();
?>
