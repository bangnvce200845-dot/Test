function upDate(previewPic) {
    // Check event is triggering
    console.log("Event triggered!");

    // Print out alt and source
    console.log("Alt:", previewPic.alt);
    console.log("Source:", previewPic.src);

    // Change text of #image
    document.getElementById("image").innerText = previewPic.alt;

    // Change background image of #image
    document.getElementById("image").style.backgroundImage =
        "url('" + previewPic.src + "')";
}

function undo() {
    // Reset background image
    document.getElementById("image").style.backgroundImage = "url('')";

    // Reset text
    document.getElementById("image").innerText =
        "Hover over an image below to display here.";
