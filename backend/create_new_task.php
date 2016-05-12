<?php
include "connect_to_DB.php";
// Create connection
$priority = 0;
if(isset($_GET["priority"])){
	$priority = $_GET["priority"];
}
$groupID = $_GET["groupID"];
$completed = false;
if(isset($_GET["completed"])){
	$completed = $_GET["completed"];
}
$title = $_GET["title"];
$description = $_GET["description"];
$title = mysqli_real_escape_string($conn, $title);
$description = mysqli_real_escape_string($conn, $description);
//echo $title;

$sql = "INSERT INTO `tasks`(`completed`, `groupID`,  `title`, `description`, `priority`) VALUES (".$completed.",".$groupID.",'".$title."','".$description."', ".$priority.")";

if($conn->query($sql)===TRUE){
	$last_inserted = $conn->insert_id;
	echo json_encode(array("taskID"=> intval($last_inserted)));
}


//echo json_encode(array("groupID"=> $newMax));


$conn->close();
?>
