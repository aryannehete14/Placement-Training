import Header from "./components/Header"
import Footer from "./components/Footer"
import Greet from "./components/Greet"

function App(){
  const myCollege = "MIT-ADT"
  const mySpeed = 45
  return (
    <>
    <Header />
    <h2>Hello React!</h2>
    <h2>Is React easy?</h2>
    {4 * 8}
    <Greet name="Aryan"/>
    <Greet name=""/>
    <p>I study in {myCollege}</p>
    {mySpeed < 50 ? <h1 style={{background:"green", color:"white"}}>You are safe</h1> : <h4 style={{background:"red", color:"black"}}>It's Dangerous</h4>}
    <Footer />
    </> 
   
  )
}

export default App