import React, { useState } from "react";
import Login from "./components/Login";
import InvoiceList from "./components/InvoiceList";

function App(){
    const [loggedIn, setLoggedIn] = useState(!!localStorage.getItem("token"));
    return loggedIn ? <InvoiceList /> : <Login onLogin={() => setLoggedIn(true)} />;
}

export default App;
