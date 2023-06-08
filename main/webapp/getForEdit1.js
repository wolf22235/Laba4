let Games = {
    game: "",
    developers: "",
    genre: "",
    year: 0,
    metacritic: 0,
}
function sendEditedFlower(){
    let xhrEdit = new XMLHttpRequest();
    Games.game=document.getElementById("game").value;
    Games.developers=document.getElementById("developers").value;
    Games.genre=document.getElementById("genre").value;
    Games.year=document.getElementById("year").value;
    Games.metacritic=document.getElementById("metacritic").value;
    let flowerJson = JSON.stringify(Games);
    console.log(Games);
    xhrEdit.open("POST", "saveChanges",true);
    xhrEdit.setRequestHeader('Content-Type', 'application/json');
    xhrEdit.send(flowerJson);
    location.href="read"
}