# CNPM_NC
Danh sách nhóm:
1. Nguyễn Ngọc Hải Đăng - 2310730
2. Đặng Gia Bảo - 2310210

Public URL: https://student-management-api-2nwl.onrender.com

Câu trả lời các câu hỏi lý thuyết
- Truy cập liên kết sau để xem câu trả lời lí thuyết https://docs.google.com/document/d/1EaKSqGVnacfxp3Ghtake3Bj6dPyOV7ztt-AdwnGvwyQ/edit?usp=drive_link

Cách chạy dự án ở local bằng spring boot
#Cần cấu hình các biến trong file .env theo mẫu .env_example
1. Chạy lệnh ./mvnw dependency:resolve để cài đặt các dependency cần thiết
2. Chạy lệnh  export $(grep -v '^#' .env | xargs) để tải biến môi trường 
2. Chạy lệnh ./mvnw spring-boot:run để khởi chạy dự án
3. Truy cập liên kết localhost:8080 để truy cập dự án
