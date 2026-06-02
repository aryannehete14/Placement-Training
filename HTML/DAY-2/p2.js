let theCircle = document.getElementById('box');
console.log(theCircle);


function myColors() {

    if (theCircle.style.background === "blue") {
        theCircle.style.background = "darkred";
    } 
    else if (theCircle.style.background === "darkred") {
        theCircle.style.background = "green";
    } 
    else if (theCircle.style.background === "green") {
        theCircle.style.background = "cyan";
    }
    else {
        theCircle.style.background = "blue    ";
    }
}