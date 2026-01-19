import React, { useState } from "react";
import API from "../services/api";

function Login({ onLogin }){
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");

    const login = async () => {
        const res = await API.post("/auth/login", { username, password });
        localStorage.setItem("token", res.data);
        onLogin();
    };

    return (
        <div>
            <h2>Login</h2>
            <input placeholder="Username" onChange={e => setUsername(e.target.value)} />
            <input type="password" placeholder="Password" onChange={e => setPassword(e.target.value)} />
            <button onClick={login}>Login</button>
        </div>
    );
}

export default Login;
