INSERT INTO BOOKS (book_id, title, author, isbn, loans) VALUES (11, 'Clean Code: A Handbook of Agile Software Craftsmanship', 'Robert Martin', '978-0132350884',3);
INSERT INTO BOOKS (book_id, title, author, isbn, loans) VALUES (12, 'Clean Code: A Handbook of Agile Software Craftsmanship', 'Robert Martin', '978-0132350884',2);
INSERT INTO BOOKS (book_id, title, author, isbn, loans) VALUES (13, 'Pragmatic Programmer, The: Your journey to mastery, 20th Anniversary Edition', 'David Thomas', '978-0135957059',0);
INSERT INTO LOANS (loan_id, user_email, book_id, loan_date, date_to_return,  active, overdue) VALUES (11, 'martin897@office.com', 11, '2023-04-03', '2023-04-10',  true, false);
INSERT INTO LOANS (loan_id, user_email, book_id, loan_date, date_to_return, return_date, active, overdue) VALUES (10, 'george12@office.com',11, '2023-03-03', '2023-03-10','2023-03-23', false, true);
INSERT INTO LIBRARIANS (librarian_id, email) VALUES (11,'glady7@library.com');