\# 🎟️ Event Ticket Platform



A full-stack web application built using \*\*Spring Boot\*\* (Java) for the backend and \*\*React.js\*\* for the frontend. This platform allows users to browse events, book tickets, and manage event participation with role-based access (Admin, Organizer, User).



---



\## 🚀 Features



\### 👥 Users

\- Sign up, log in, and manage their profile

\- Browse upcoming events

\- Book tickets and view booking history



\### 🧑‍💼 Organizers

\- Create and manage events

\- View ticket bookings for their events



\### 👨‍💻 Admins

\- Manage users, organizers, and events

\- Approve or reject new event listings



---



\## 🛠️ Tech Stack



\### Frontend

\- \*\*React.js\*\*

\- \*\*Axios\*\* (for API calls)

\- \*\*React Router\*\*

\- \*\*Bootstrap / Tailwind CSS\*\* (choose one)



\### Backend

\- \*\*Spring Boot\*\*

\- \*\*Spring Security\*\*

\- \*\*Spring Data JPA\*\*

\- \*\*MySQL\*\* / PostgreSQL

\- \*\*JWT Authentication\*\*



\### Tools

\- \*\*Maven\*\* (dependency management)

\- \*\*Eclipse / IntelliJ\*\* (backend)

\- \*\*VS Code\*\* (frontend)

\- \*\*Postman\*\* (API testing)



---



\## 📂 Project Structure



```

event-ticket-platform/

├── backend/

│   └── src/main/java/com/eventticket/...

│   └── pom.xml

├── frontend/

│   └── src/

│   └── public/

│   └── package.json

├── README.md

```



---



\## ⚙️ Getting Started



\### 1. Clone the Repository



```bash

git clone https://github.com/yourusername/event-ticket-platform.git

cd event-ticket-platform

```



---



\## 🧩 Backend Setup (Spring Boot)



\### Prerequisites:

\- Java 17+

\- Maven

\- MySQL (or PostgreSQL)



\### Steps:



```bash

cd backend

```



\- Configure `application.properties`:



```properties

spring.datasource.url=jdbc:mysql://localhost:3306/event\_ticket

spring.datasource.username=your\_db\_username

spring.datasource.password=your\_db\_password



spring.jpa.hibernate.ddl-auto=update

jwt.secret=your\_jwt\_secret\_key

```



\- Run the Spring Boot app:



```bash

mvn spring-boot:run

```



---



\## 🎨 Frontend Setup (React)



\### Prerequisites:

\- Node.js (v18+)

\- npm or yarn



\### Steps:



```bash

cd frontend

npm install

npm start

```



The app will run at `http://localhost:3000`



---



\## 🔐 Authentication



\- JWT-based token system

\- Role-based access for `USER`, `ORGANIZER`, and `ADMIN`



---



\## 🧪 API Testing



Use Postman or Swagger (if configured) to test the following:

\- `/api/auth/login`

\- `/api/auth/register`

\- `/api/events`

\- `/api/tickets`

\- `/api/admin/\*`



---



\## ✅ Future Enhancements



\- Payment integration (Stripe / Razorpay)

\- Email notifications (ticket confirmation)

\- QR code-based ticket validation

\- Search and filter events

\- User reviews and ratings for events



---



\## 🤝 Contributing



Contributions are welcome! Feel free to fork this repository and submit a pull request.



---



\## 📄 License



This project is licensed under the \[MIT License](LICENSE).



---



\## 📬 Contact



Created by \[Deepak Kumar](mailto:deepak@example.com)  

Feel free to connect!

