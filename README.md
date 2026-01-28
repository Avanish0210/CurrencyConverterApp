

# 💱 Currency Converter Application

A simple and efficient **Currency Converter** application that converts one currency to another using **real-time exchange rates** fetched from a third-party API via a **REST client**.


## 🚀 Features

* Convert currency from one country to another
* Real-time exchange rates
* Third-party API integration using REST client
* Clean and scalable architecture
* Easy to extend for more currencies or providers


## 🛠 Tech Stack

* **Java**
* **Spring Boot**
* **REST Client** (for third-party API integration)
* **Maven**
* **JSON**
* **Third-Party Currency Exchange API**


This application uses a **REST client** to communicate with an external currency exchange service.

**Flow:**

1. User provides source currency, target currency, and amount
2. Application sends a REST request to a third-party exchange rate API
3. API responds with the latest exchange rate
4. Converted amount is calculated and returned to the user

## 📌 API Endpoints

### Convert Currency

```http
GET /api/convert
```

**Query Parameters:**

* `from` – Source currency (e.g., USD)
* `to` – Target currency (e.g., INR)
* `amount` – Amount to convert

**Sample Request:**

```http
GET /api/convert?from=USD&to=INR&amount=100
```

**Sample Response:**

```json
{
  "from": "USD",
  "to": "INR",
  "amount": 100,
  "convertedAmount": 8325.50,
  "exchangeRate": 83.255
}
```

---

## ⚙️ How It Works

* The controller receives the request
* The service layer calls a **REST client**
* REST client fetches data from the third-party API
* Response is parsed and processed
* Converted value is returned to the user

---

## ▶️ How to Run the Project

1. Clone the repository

```bash
git clone https://github.com/your-username/currency-converter.git
```

2. Navigate to the project directory

```bash
cd currency-converter
```

3. Configure your API key in `application.properties`

```properties
currency.api.url=YOUR_API_URL
currency.api.key=YOUR_API_KEY
```

4. Run the application

```bash
mvn spring-boot:run
```

5. Access the app at

```text
http://localhost:8080
```

---

## 🧪 Testing

* API can be tested using **Postman** or any REST client
* Unit testing can be added for service and controller layers

---

## 🔮 Future Enhancements

* Add caching for exchange rates
* Support historical exchange rates
* Add frontend (React / Angular)
* Improve error handling and validations
* Add authentication and rate limiting

---

## 👨‍💻 Author

**Avanish Pratap Singh**
Java | Spring Boot | Backend Developer

---

If you want, I can:

* Rewrite this for **GitHub portfolio impact**
* Make it **ATS-friendly**
* Customize it for **Spring `RestTemplate` or WebClient**
* Add **Swagger/OpenAPI** section

Just tell me 👍
