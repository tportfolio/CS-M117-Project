<?php
include "connect_to_DB.php";
// Create connection
$UID = $_GET["UID"];
$groupID = $_GET["groupID"];


$sql = "SELECT UID FROM `userToGroups` WHERE UID=".$UID." AND groupID = ".$groupID;
$result = $conn->query($sql);
if ($result->num_rows > 0) {
    // output data of each row
echo json_encode(array("newInsert"=> False));
        }
 else {
$sql = "INSERT INTO `userToGroups`(`UID`, `GroupID`) VALUES (".$UID.", ".$groupID.")";
$result = $conn->query($sql);
$jsonArr = array("newInsert" => True);
echo json_encode($jsonArr);
//echo $userID;

}
$conn->close();
?>
