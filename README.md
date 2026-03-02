# Student Management WebApp
Một WebApp căn bản xây dựng bằng Java Spring Boot nhằm hỗ trợ cho buổi học thực hành Scrum Agile

- **FrameWork:** SpringBoot
- **Công Cụ Quản Lý:** Maven
- **DBMS:** PostgreSQL

Dự án được thiết kế theo kiến trúc phân lớp (Controllers, Services, Repositories) và sử dụng Maven để quản lý các thư viện cũng như quy trình build dự án.

## Mục Lục
- [Danh Sách Nhóm](#danh-sách-nhóm)
- [Public URL](#public-url)
- [Chạy Dự Án](#chạy-dự-án)
- [Trả Lời Câu Hỏi Lý Thuyết](#trả-lời-câu-hỏi-lý-thuyết)
- [Screenshot Các Module](#screenshots)

## Danh sách nhóm:
| Họ Tên | MSSV |
| ------------------------------- | ---------- |
| Nguyễn Ngọc Hải Đăng | 2310730 |
| Đặng Gia Bảo | 2310210 |

## Public URL:
https://student-management-api-2nwl.onrender.com

## Chạy Dự Án:
### 1. Cài đặt các dependencies
```bash
./mvnw dependency:resolve
```

### 2. Tạo file .env gồm các biến môi trường
Dưới đây là file mẫu, thay đổi các biến tùy theo môi trường cục bộ
```bash
POSTGRES_HOST=localhost
POSTGRES_PORT=5432
POSTGRES_DB=student_management
POSTGRES_USER=postgres
POSTGRES_PASSWORD=YourPasswordHere

SPRING_DATASOURCE_URL=jdbc:postgresql://${POSTGRES_HOST}:${POSTGRES_PORT}/${POSTGRES_DB}
SPRING_DATASOURCE_USERNAME=${POSTGRES_USER}
SPRING_DATASOURCE_PASSWORD=${POSTGRES_PASSWORD}
```
### 3. Tải biến môi trường
Chạy lệnh sau để tải các biến môi trường từ file .env
```bash
export $(grep -v '^#' .env | xargs)
```

### 4. Khởi chạy dự án
```bash
./mvnw spring-boot:run
```
### 5. Truy cập dự án
Truy cập liên kết localhost:8080 để truy cập dự án


## Trả Lời Câu Hỏi Lý Thuyết:
### LAB 1
Câu 2: Quan sát thông báo lỗi: UNIQUE constraint failed. Tại sao Database lại chặn thao tác này?

- Vì khi tạo bảng student thuộc tính id được cấu hình là primary key nên các đối tượng được thêm vào bảng phải tuân theo ràng buộc có id tồn tại duy nhất  trong bảng, không được trùng với các đối tượng khác.

Câu 3: Database có báo lỗi khi INSERT một sinh viên nhưng bỏ trống cột name không? Từ đó suy nghĩ xem sự thiếu chặt chẽ này ảnh hưởng gì khi code Java đọc dữ liệu lên?

- Khi thêm vào 1 sinh viên nhưng bỏ trống cột name sẽ không báo lỗi.
- Khi một thuộc tính trong database có thể NULL, việc đọc dữ liệu lên trong Java sẽ dễ gây ra lỗi NullPointerException, sai lệch logic xử lý và làm tăng độ phức tạp của chương trình. Do đó, việc thiết kế database chặt chẽ với các ràng buộc NOT NULL giúp đảm bảo tính toàn vẹn dữ liệu, giảm lỗi runtime và làm cho code Java đơn giản, an toàn hơn.

Câu 4: Tại sao mỗi lần tắt ứng dụng và chạy lại, dữ liệu cũ trong Database lại bị mất hết?

- Vì hiện tại chúng ta cấu hình JPA/Hibernate là ddl-auto=create. Nên khi mỗi lần khởi chạy lại app dữ liệu trong database sẽ được tạo lại từ đầu.

### LAB 2
- Test API lấy danh sách sinh viên: 
<img width="975" height="493" alt="image" src="https://github.com/user-attachments/assets/a2d23fa8-3489-4d52-ac16-02dfec58d89f" />

- Test API lấy chi tiết sinh viên
<img width="975" height="354" alt="image" src="https://github.com/user-attachments/assets/25685ce7-9577-48a0-8da4-99165f106be6" />

- Test API lấy sinh viên không tồn tại
<img width="975" height="332" alt="image" src="https://github.com/user-attachments/assets/7a68f8f7-9217-43bc-96f1-3d4dceca1604" />

## Screenshots
### Trang Danh Sách
<img width="1919" height="498" alt="image" src="https://github.com/user-attachments/assets/74dcd87b-082c-4f0d-9f91-a2c8106373dd" />

### Trang Chi Tiết
<img width="1919" height="621" alt="image" src="https://github.com/user-attachments/assets/a750f233-b867-439d-8e9c-afddc1e036b5" />

### Chức Năng Thêm
<img width="1919" height="657" alt="image" src="https://github.com/user-attachments/assets/41cbc717-3f2d-41a7-bfe1-f72c99e287df" />

### Chức Năng Chỉnh Sửa
<img width="1919" height="696" alt="image" src="https://github.com/user-attachments/assets/964335f6-069f-4087-80cb-76e4deca894c" />

### Chức Năng Xóa
<img width="1919" height="685" alt="image" src="https://github.com/user-attachments/assets/6a2729e6-2207-4191-8c04-8c6b307b8e16" />

### Chức Năng Tìm Kiếm
<img width="1919" height="496" alt="image" src="https://github.com/user-attachments/assets/7cb95fb9-15bf-492f-80e9-e927b6c51a98" />






