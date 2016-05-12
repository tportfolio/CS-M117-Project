<?php
include "connect_to_DB.php";
// Create connection
$UID = $_GET["UID"];

$sql = "SELECT MAX(GroupID) FROM `userToGroups`";
$result = $conn->query($sql);
if ($result->num_rows > 0) {

    // output data of each row
$row = $result->fetch_assoc();
$newMax = intval($row["MAX(GroupID)"])+1;
$sql = "INSERT INTO `userToGroups`(`UID`, `GroupID`) VALUES (".$UID.", ".$newMax.")";
$result = $conn->query($sql);

echo json_encode(array("groupID"=> $newMax));
}
$conn->close();
?>
