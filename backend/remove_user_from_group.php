<?php
include "connect_to_DB.php";
// Create connection
$UID = $_GET["UID"];
$groupID = $_GET["groupID"];


$sql = "SELECT UID FROM `userToGroups` WHERE UID=".$UID." AND groupID = ".$groupID;
$result = $conn->query($sql);
if ($result->num_rows > 0) {
    // output data of each row
$sql = "DELETE FROM `userToGroups` WHERE UID=".$UID." AND groupID=".$groupID;
$conn->query($sql);
echo json_encode(array("deleted"=> True));
        }
 else {
$jsonArr = array("deleted" => False);
echo json_encode($jsonArr);
//echo $userID;

}
$conn->close();
?>
