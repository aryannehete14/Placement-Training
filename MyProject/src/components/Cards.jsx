function Cards({pic,title,desc}) {
    return (
        <div className='Card'>
            <img src={pic}/>
            <h2>{title}</h2>
            <p>{desc}</p>
        </div>
    )
}

export default Cards
