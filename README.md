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

## Ліцензія

Проєкт розповсюджується під MIT License.
