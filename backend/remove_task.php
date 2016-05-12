<?php
include "connect_to_DB.php";
// Create connection
$taskID = $_GET["taskID"];


$sql = "SELECT * FROM `tasks` WHERE taskID=".$taskID;
$result = $conn->query($sql);
if ($result->num_rows > 0) {
    // output data of each row
$sql = "DELETE FROM `tasks` WHERE taskID=".$taskID;
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
