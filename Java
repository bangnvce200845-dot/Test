function upDate(previewPic) {
    // Log to console to check event trigger
    console.log(previewPic);

    // Log information about the previewPic (alt and source)
    console.log("Image alt text: " + previewPic.alt);
    console.log("Image source: " + previewPic.src);

    // Change the text of the element with id="image" to the alt text of the previewPic
    document.getElementById('image').innerHTML = previewPic.alt;

    // Change the background image of the element with id="image" to the source of the previewPic
    document.getElementById('image').style.backgroundImage = "url('" + previewPic.src + "')";
}

// Function to undo the changes when triggered
function undo() {
    // Reset the background image of the div with id="image" to the original value
    document.getElementById('image').style.backgroundImage = "url('')";

    // Reset the text of the div with id="image" to the original message
    document.getElementById('image').innerHTML = "Hover over an image below to display here.";
}
