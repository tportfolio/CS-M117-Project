<?php
include "connect_to_DB.php";
// Create connection
$userID = $_GET["UID"];
$taskID = $_GET["taskID"];
$sql = "SELECT groupID FROM tasks WHERE taskID = ".$taskID;
$result = $conn->query($sql);
if($result->num_rows > 0){
	$groupID = $result->fetch_assoc()["groupID"];
}
else{
echo json_encode(array("success" => False));
exit();
}
$sql = "SELECT * FROM userToGroups WHERE UID=".$userID." AND GroupID=".$groupID;
$result = $conn->query($sql);
if($result->num_rows > 0){

$sql = "UPDATE `tasks` SET `assignedTo`=".$userID." WHERE taskID=".$taskID;
$result = $conn->query($sql);

}

else{
echo json_encode(array("success" => False));
exit();
}
echo json_encode(array("success" => True));

//echo $userID;
$conn->close();
?>
