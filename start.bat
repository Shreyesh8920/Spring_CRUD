@echo off

start cmd /k "cd backend && .\mvnw spring-boot:run"

timeout /t 8 > nul

start cmd /k "cd frontend && live-server --port=5500"