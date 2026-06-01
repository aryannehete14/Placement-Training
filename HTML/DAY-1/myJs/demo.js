console.log("test")

// Function for the very first button (Now supports reverting!)
function myDemo() {
    var doc = document.getElementById('xyz');
    
    if (doc.style.color === "yellow") {
        // Revert to original styling
        doc.textContent = "I am learning Js in Detail";
        doc.style.color = "";
        doc.style.textAlign = "";
        doc.style.fontSize = "";
    } else {
        // Apply changes
        doc.textContent = "JavaScript is Tricky";
        doc.style.color = "yellow";
        doc.style.textAlign = "right";
        doc.style.fontSize = "43px";
    }
}

// Function 1: Inverts the background and text color completely
function colors() {
    var text1 = document.getElementById('h');
    
    if (text1.style.background === "darkred") {
        text1.style.background = "white";
        text1.style.color = "darkred";
    } else {
        text1.style.background = "darkred";
        text1.style.color = "white";
    }
}

// Function 2: Enlarges element 2 back and forth
function big() {
    var text2 = document.getElementById('element2');
    if (text2.style.fontSize === "30px") {
        text2.style.fontSize = "";
    } else {
        text2.style.fontSize = "30px";
    }
}

// Function 3: Toggles padding on element 3
function addPadding() {
    var text3 = document.getElementById('element3');
    if (text3.style.padding === "30px") {
        text3.style.padding = "";
    } else {
        text3.style.padding = "30px";
    }
}

// Function 4: Toggles margin on element 4
function addMargin() {
    var text4 = document.getElementById('element4');
    if (text4.style.marginTop === "50px") {
        text4.style.marginTop = "";
    } else {
        text4.style.marginTop = "50px";
    }
}

// Function 5: Toggles border on element 5
function addBorder() {
    var text5 = document.getElementById('element5');
    if (text5.style.border === "3px solid lightgoldenrodyellow") {
        text5.style.border = "";
    } else {
        text5.style.border = "3px solid lightgoldenrodyellow";
    }
}