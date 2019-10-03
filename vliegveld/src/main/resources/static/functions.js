function postNewPlane() {
    var planeIdentification = $('#planeIdentification').val();
    console.log(planeIdentification);
    $("#data").text("getting data...");

    var newPlane = {
        planeIdentification : planeIdentification
    };
    console.log(newPlane);

    var validJsonPlane = JSON.stringify(newPlane);
    console.log(validJsonPlane);

    $.ajax({
        url:"http://localhost:8010/api/plane/add",
        type:"post",
        contentType: "application/json",
        data: validJsonPlane,
        success: function(result) {
            console.log("This is the data: " + result);
            getPlanes();
        }
    });
}

function getPlanes() {

    $.ajax({
        url:"api/plane/planes",
        type:"get",
        success: function(result) {
            console.log("This is the data: " + result);

            var total = "Planes: ";

            $.each(result, function(index, plane) {
                total = total + plane.planeIdentification + ". ";
            });

            $("#data").text(total);
        }
    });
}

$(document).ready( function () {
    $('#table_id').DataTable();
} );