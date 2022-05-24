
function sendWelcomeMessage() {
    EquoCommService.send("welcomeHandler", "This is a message from JavaScript!");
}

function getExamplePayload() {
    EquoCommService.send("getExamplePayload").then((payload) => {
        document.getElementById("payload-holder").innerText = `Message: ${payload.message}. Id: ${payload.id}.`;
    });
}
