<?php
include "connect_to_DB.php";
// Create connection
$groupID = $_GET["groupID"];


$sql = "SELECT * FROM tasks WHERE groupID=".$groupID;
$result = $conn->query($sql);
$resArray = [];
    // output data of each row
$counter = 0;
    while($row = $result->fetch_assoc()) {
//	echo $row["GroupID"];
	$curArray = array("completed" => $row["completed"], "taskID" => intval($row["taskID"]), "groupID" => intVal($row["groupID"]), "assignedTo" => intval($row["assignedTo"]), "title" => $row["title"], "description" => $row["description"], "priority" => intval($row["priority"]));
	$resArray[$counter] = $curArray;
	$counter = $counter+1;
    }



$jsonArr = array("groupTasks" => $resArray);
echo json_encode($jsonArr);

//echo $userID;
$conn->close();
?>
