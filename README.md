# 🧾 Secure Invoice Management System (Java + React)


🚀 Project Overview

The Secure Invoice Management System is a full-stack Java application built with Spring Boot for the backend and React.js for the frontend.
It features:

JWT-based authentication

Role-based authorization (ADMIN / USER)

Invoice management (CRUD for admins, read-only for users)

Enterprise layered architecture

RESTful APIs integrated with React UI

PostgreSQL database

This project demonstrates end-to-end full-stack development skills, ideal for GitHub portfolios or Java Full Stack interviews.


🏗 Architecture
      ┌─────────────┐
      │  React UI   │
      └─────┬───────┘
            │ Axios / REST
            ▼
    ┌─────────────────────┐
    │ Spring Boot Backend │
    │ ───────────────── │
    │ AuthController     │
    │ InvoiceController  │
    │ Service Layer      │
    │ Security Layer     │
    └─────┬─────────────┘
          │ JPA / Hibernate
          ▼
   ┌───────────────────┐
   │ PostgreSQL DB     │
   │ Users | Invoices  │
   └───────────────────┘

📂 Project Structure
secure-invoice-management/
├── backend/                  # Spring Boot backend
│   ├── src/main/java/com/example/invoice/
│   │   ├── config/
│   │   ├── controller/
│   │   ├── entity/
│   │   ├── repository/
│   │   ├── service/
│   │   └── util/
│   └── src/main/resources/application.properties
├── frontend/                 # React frontend
│   ├── public/
│   ├── src/components/
│   ├── src/services/
│   ├── App.js
│   └── index.js
└── README.md



🛠 Tech Stack
Layer	Technology
Backend	Java 17, Spring Boot, Spring Security, JWT, Hibernate (JPA), PostgreSQL
Frontend	React.js, Axios, HTML5, CSS3, JavaScript
Dev Tools	Maven, npm, Git/GitHub
Features	REST APIs, JWT Auth, Role-Based Auth, Invoice CRUD
🎯 Features

✅ User registration and login (JWT)

✅ Admin can create, update, delete invoices

✅ User can view invoices only

✅ REST APIs with Spring Boot

✅ Frontend React integration

✅ Layered architecture (Controller → Service → Repository → Database)

✅ Secure endpoints with role-based access



▶️ How to Run
1️⃣ Backend (Spring Boot)
cd backend
mvn spring-boot:run


Database: PostgreSQL

DB Name: invoice_db

Username: postgres

Password: postgres

Port: 8080



2️⃣ Frontend (React)
cd frontend
npm install
npm start


Runs on http://localhost:3000

Connects to backend REST APIs via Axios




🔐 Authentication Flow

Register user (/auth/register) with role ADMIN or USER

Login (/auth/login) → Receive JWT token

Use JWT token in frontend or Postman for secured endpoints




📈 Benefits

Real-world enterprise-grade application

Demonstrates full-stack Java development skills

Showcases secure REST APIs + frontend integration

Perfect for interview discussions & GitHub portfolio



📖 How to Extend

Add React forms for invoice creation/updating

Add Pagination & Sorting in API

Add Global Exception Handling in backend

Add Material UI / Tailwind CSS for a better frontend

Deploy to AWS / Azure for live demo



👤 Author

Dheeraj Maadhu
Full Stack Java Developer
