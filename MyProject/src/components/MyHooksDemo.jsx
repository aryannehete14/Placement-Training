import {useState} from 'react'

export default function MyHooksDemo(){
    const [count,setCount] = useState(0)

    const plus = ()=>{
        setCount(count+1)
    }

    const minus =()=>{
        setCount(count-1)
    }

    return(
        <div>
            <center>
            <h2>My Counter value is : {count}</h2>
            <button onClick={plus}>Add</button>
            <button onClick={minus}>Less</button>
            </center>
        </div>
    )
}