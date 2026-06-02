let content = document.querySelector('h1');
console.log(content);

let btn = document.querySelector('button');
console.log(btn);

btn.addEventListener('click', () => {

    if (content.textContent === "I am learning Js") {
        content.textContent = "I want to Learn React";
    } else {
        content.textContent = "I am learning Js";
    }

});

function add(a, b) {
    console.log(a + b);
}

add(6, 7);
add(3, 6);

const add1 = (x, y) => {
    console.log(x + y);
}

add1(6, 2);
add1(4, 7);

// // if else demo
let age = 17;

if (age > 18) {
    console.log("Please vote");
} else {
    console.log("Cannot vote");
}