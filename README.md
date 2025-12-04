# backend

Бекенд для сайту Міністерства Культури та Мистецтва Березанського ліцею №3.

## Технології

- Java
- Spring
- PostgreSQL
- Gradle

## Встановлення

```bash
# Клонуємо репо
git clone https://github.com/lyceum-3/backend.git
cd backend

# Збираємо проєкт
./gradlew build

# Запускаємо
./gradlew bootRun
```

> За замовчуванням сервер стартує на **localhost:8080**

## API

- `/api/events` - CRUD для шкільних подій.
- `/api/forms` - повертає список класів ліцею.
- `/api/auth/login` - авторизація для адмін-панелі.

## База даних

Проєкт використовує PostgreSQL з ORM JPA.

### Список таблиць

- `events` - таблиця шкільних подій.
- `admins` - таблиця з адміністраторами проєкту.

## Архітектура

```
┌── gradle/                                   # Gradle wrapper та конфігурація збірки
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── dev/lyceum/backend/
│   │   │       ├── config/                   # Налаштування безпеки і т.д.
│   │   │       ├── controllers/              # REST-контролери (вхідні endpoints)
│   │   │       ├── dto/                      # Data Transfer Objects (виносимо payload-и)
│   │   │       ├── entities/                 # JPA сутності (таблиці БД)
│   │   │       ├── repositories/             # Інтерфейси для роботи з БД (Spring Data)
│   │   │       ├── service/                  # Бізнес-логіка, реалізація функціоналу
│   │   │       ├── utils/                    # Корисні класи: хелпери, валідатори, конвертери
│   │   │       └── BackendApplication.java   # Головний стартовий клас Spring Boot
│   │   └── resources/
│   │       └── application.properties         # Конфігурація (порт, доступ до БД, параметри)
│   └── test/                                  # Тести, якщо вирішиш додавати
├── .gitattributes                             # Налаштування Git для різних ОС
├── .gitignore                                 # Файли, які не потрапляють у репозиторій
├── build.gradle.kts                           # Основний файл збірки Gradle (Kotlin DSL)
├── gradlew                                    # Unix-скрипт для запуску Gradle Wrapper
├── gradlew.bat                                # Windows-версія Gradle Wrapper
├── LICENSE                                    # Ліцензія проєкту
├── README.md                                  # Документація до репозиторію
└── settings.gradle.kts                        # Налаштування модулів Gradle
```

## Ліцензія

Проєкт розповсюджується під **[MIT License](https://opensource.org/license/mit)**.
