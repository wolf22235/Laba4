let Games = {
    game: "",
    developers: "",
    genre: "",
    year: 0,
    metacritic: 0
}
function getData(){
    Games.game = document.getElementById("game").value;
    Games.developers = document.getElementById("developers").value;
    Games.genre = document.getElementById("genre").value;
    Games.year = document.getElementById("year").value;
    Games.metacritic = document.getElementById("metacritic").value;
    let gamesJson = JSON.stringify(Games);
    let xhr = new XMLHttpRequest();
    xhr.open("POST", "write",true);
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.send(gamesJson);
};