import { useState } from 'react';
import './App.css'

function App(){
  const [text, setText] = useState('click me')
  console.log(text == 'click me')
  const changeState = () => { // or function funName(params1, params2, ...) { ..... }
    if(text == "click me"){
      setText("clicked");
    }else{
      setText("click me");
    }
  }
  return (
    <>
    <h1>Recipe App</h1>
    <div>
      <p>Recipe Name</p>
    <button onClick={changeState}>Text = {text}</button>
    </div>
    </>
  )
}

export default App; 