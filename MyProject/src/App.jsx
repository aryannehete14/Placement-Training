import './App.css'
import Cards from "./components/Cards"
import rohit from './assets/rohit.jpeg'
import virat from './assets/Virat.jpeg'
import dhoni from './assets/Dhoni.jpeg'
import sachin from './assets/Sachin.jpeg'
import MyHooksDemo from './components/MyHooksDemo'

function App(){
  return(
    <>
    <center>
      <h1>My Demo App</h1>
    </center>
  
    <Cards pic={rohit} title="Rohit Sharma" desc="Captain of MI"/>
    <Cards pic={virat} title="Virat Kohli" desc="Captain of RCB"/>
    <Cards pic={dhoni} title="M.S. Dhoni" desc="Captain of CSK"/>
    <Cards pic={sachin} title="Sachin Tendulkar" desc="Master Blaster"/>
    <MyHooksDemo/>
    </>
  )
}

export default App