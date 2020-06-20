import React, {Component, useState, useEffect} from 'react';
import logo from './logo.svg';
import './App.css';

function App () {
    const [message, setMessage] = useState("");
    const [names, setNames] = useState([]);

    useEffect(() => {
        fetch('/api/hello')
            .then(response => response.text())
            .then(message => {
                setMessage(message);
            });

        fetch('/api/names')
            .then(response => response.json())
            .then(names => {
                setNames(names);
            });
    },[])
    return (
        <div className="App">
        <header className="App-header">
        <img src={logo} className="App-logo" alt="logo"/>
        <h1 className="App-title">{message}</h1>
            <p>All names: <span>{names.length}</span></p>
        </header>
        <p className="App-intro">
        To get started, edit <code>src/App.js</code> and save to reload.
    </p>
    </div>
)
}

export default App;
