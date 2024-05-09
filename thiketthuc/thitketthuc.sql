create database thiketthuc;
use thiketthuc;

CREATE TABLE Book (
                      book_id INT PRIMARY KEY AUTO_INCREMENT,
                      title VARCHAR(255),
                      author VARCHAR(255),
                      description TEXT,
                      quantity INT
);
INSERT INTO Book (title, author, description, quantity)
VALUES
    ('1', 'title1', 'author1', 10),
    ('2', 'title2', 'author2', 5),
    ('3', 'title3 ', 'author3', 8);
CREATE TABLE Student (
                         student_id INT PRIMARY KEY AUTO_INCREMENT,
                         full_name VARCHAR(255),
                         class_name VARCHAR(50)
);
INSERT INTO Student (full_name, class_name)
VALUES
    ('Hieu1', 'DuongHieu1'),
    ('Hieu2', 'DuongHieu2'),
    ('Hieu3', 'DuongHieu3');

CREATE TABLE BorrowCard (
                            borrow_id INT PRIMARY KEY AUTO_INCREMENT,
                            book_id INT,
                            student_id INT,
                            status BOOLEAN,
                            borrow_date DATE,
                            return_date DATE,
                            FOREIGN KEY (book_id) REFERENCES Book(book_id),
                            FOREIGN KEY (student_id) REFERENCES Student(student_id)
);
INSERT INTO BorrowCard (book_id, student_id, status, borrow_date, return_date)
VALUES
    (1, 1, TRUE, '2024-05-01', '2024-05-15'),
    (2, 2, TRUE, '2024-04-20', '2024-05-10'),
    (3, 3, FALSE, '2024-04-25', NULL);
