import React, { useEffect, useState } from "react";
import API from "../services/api";

function InvoiceList() {
    const [invoices, setInvoices] = useState([]);

    useEffect(() => { API.get("/invoices").then(res => setInvoices(res.data)) }, []);

    return (
        <div>
            <h2>Invoices</h2>
            <ul>
                {invoices.map(inv => <li key={inv.id}>{inv.customerName} - ${inv.amount} - {inv.status}</li>)}
            </ul>
        </div>
    );
}

export default InvoiceList;
