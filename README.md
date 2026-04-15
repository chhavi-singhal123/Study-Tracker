# 📚 Study Tracker App

A full-stack productivity web application designed to help students track study time, manage daily goals, take notes, and stay consistent through an interactive dashboard.

---

## 🚀 Features

* 🔐 User Authentication System (Spring Boot backend)
* ⏱ Pomodoro Timer (Start / Stop / Reset)
* 🎯 Daily Study Goals Tracking
* 📝 Notes Management
* 👤 User Profile Handling
* 📊 Study Progress Dashboard
* 🔥 Streak Tracking System
* 📈 Weekly Study Analytics

---

## 🛠 Tech Stack

### Frontend

* HTML5
* CSS3
* JavaScript (Vanilla)

### Backend

* Java
* Spring Boot
* REST APIs

### Database

* MongoDB (configured)

---

## 📁 Project Structure

```
src/
 ├── main/
 │   ├── java/com/example/demo/
 │   │   ├── controller/
 │   │   ├── service/
 │   │   ├── repository/
 │   │   └── model/
 │   └── resources/
 │       ├── static/
 │       └── application.properties
```

---

## 🚀 How to Run the Project

### 🛠 Prerequisites

Make sure you have:

* Java 17 installed
* MongoDB running on `localhost:27017`

---

### 📥 Clone the Repository

```
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```

---

### ▶️ Run the Application

#### For Windows:

```
.\mvnw spring-boot:run
```

#### For Mac/Linux:

```
./mvnw spring-boot:run
```

---

### 🌐 Access the Application

Open your browser and go to:

```
http://localhost:8081
```

---

### ⚙️ Configuration

* Server Port: **8081**
* MongoDB URL: `mongodb://localhost:27017`

---

## 🧪 Build the Project

```
.\mvnw clean install
```

---

## ❗ Notes

* Ensure MongoDB is running before starting the backend
* If port is already in use, change it in `application.properties`

---

## 📌 Future Improvements

* Add JWT Authentication
* Deploy on cloud (AWS / Render)
* Add mobile responsiveness
* Integrate advanced analytics

---

