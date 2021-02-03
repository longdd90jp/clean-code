INSERT INTO users(user_id, name, email, password) VALUES
 (1, 'Teacher1', 'alice@gmail.com', '123456'),
 (2, 'Student1', 'bob@gmail.com', '123456'),
 (3, 'Teacher2', 'marry@gmail.com', '123456'),
 (4, 'Student2', 'bidden@gmail.com', '123456');

INSERT INTO teachers(teacher_id, phone, experiences) VALUES
 (1, '0973551683', 15),
 (3, '0973551684', 15);

INSERT INTO students(student_id, year) VALUES
 (2, 2020),
 (4, 2021);

INSERT INTO courses(course_id, teacher_id, name, description, location, opened_date, closed_date) VALUES
 (1, 1, 'Spring Boot Fundamental', 'Spring Boot Course For Basic', 'Hanoi CS1', '2021-01-10', '2021-04-11'),
 (2, 1, 'Spring Boot Pro', 'Spring Boot Course For Pro', 'Hanoi CS1', '2021-02-10', '2021-04-11'),
 (3, 3, 'Spring Boot Microservice', 'Spring Boot Course For Microservice', 'Hanoi CS2', '2021-01-15', '2021-04-11');