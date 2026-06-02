let photo = document.querySelector('img')
console.log(photo);

let b1 = document.querySelectorAll('button')[0]
console.log(b1)

b1.addEventListener('click',()=>{
    photo.src = "happy_emoji.jpeg"
})

let b2 = document.querySelectorAll('button')[1]
console.log(b2)

b2.addEventListener('click',()=>{
    photo.src = "naughty_emoji.jpeg"
})

let b3 = document.querySelectorAll('button')[2]
console.log(b3)

b3.addEventListener('click',()=>{
    photo.src = "Sus_emoji.jpeg"
})
