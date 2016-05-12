<?php
include "connect_to_DB.php";
// Create connection
$taskID = $_GET["taskID"];
$sql = "SELECT * FROM tasks WHERE taskID = ".$taskID;
$result = $conn->query($sql);
if($result->num_rows > 0){

if($result->fetch_assoc()["completed"]){
echo json_encode(array("success" => False));
exit();
}

$sql = "UPDATE `tasks` SET `completed`=True WHERE taskID=".$taskID;
$result = $conn->query($sql);
echo json_encode(array("updated" => True));
}
else{
echo json_encode(array("success" => False));
exit();
}


//echo $userID;
$conn->close();
?>
