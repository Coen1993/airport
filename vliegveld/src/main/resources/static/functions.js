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
        url:"api/plane/add",
        type:"post",
        contentType: "application/json",
        data: validJsonPlane,
        success: function(data) {
            console.log("This is the data: " + data);
            getPlanes();
        }
    });
}

function getPlanes() {

    $.ajax({
        url:"api/plane/planes",
        type:"get",
        success: function(data) {
            console.log("This is the data: " + data);

            var total = "Planes: ";

            $.each(data, function(index, plane) {
                total = total + plane.planeIdentification + ". ";
            });

            $("#data").text(total);
        }
    });

}