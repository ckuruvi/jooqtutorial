CREATE TABLE language (
  id              NUMBER(7)     NOT NULL PRIMARY KEY,
  cd              CHAR(2)       NOT NULL,
  description     VARCHAR2(50)
);
CREATE TABLE author (
  id              NUMBER(7)     NOT NULL PRIMARY KEY,
  first_name      VARCHAR2(50),
  last_name       VARCHAR2(50)  NOT NULL,
  date_of_birth   DATE,
  year_of_birth   NUMBER(7)
);
CREATE TABLE book (
  id              NUMBER(7)     NOT NULL PRIMARY KEY,
  author_id       NUMBER(7)     NOT NULL,
  title           VARCHAR2(400) NOT NULL,
  published_in    NUMBER(7)     NOT NULL,
  language_id     NUMBER(7)     NOT NULL,
  CONSTRAINT fk_book_author     FOREIGN KEY (author_id)   REFERENCES author(id),
  CONSTRAINT fk_book_language   FOREIGN KEY (language_id) REFERENCES language(id)
);


INSERT INTO language (id, cd, description) VALUES (1, 'en', 'English');
INSERT INTO language (id, cd, description) VALUES (2, 'de', 'Deutsch');
INSERT INTO language (id, cd, description) VALUES (3, 'fr', 'Français');
INSERT INTO language (id, cd, description) VALUES (4, 'pt', 'Português');

INSERT INTO author(id, first_name, last_name, date_of_birth, year_of_birth) VALUES(1 , 'Ayn'  , 'Rand' , DATE '1905-02-02', 1905);
INSERT INTO author(id, first_name, last_name, date_of_birth, year_of_birth) VALUES(2 , 'Paulo', 'Coelho' , DATE '1947-08-24', 1947);

INSERT INTO book(id, author_id, title, published_in, language_id) VALUES(1 , 1, 'The Fountainhead', 1943, 1);
INSERT INTO book(id, author_id, title, published_in, language_id) VALUES(2 , 1, 'Atlas Shrugged' , 1957, 1);
INSERT INTO book(id, author_id, title, published_in, language_id) VALUES(3 , 2, 'O Alquimista', 1988, 4);
INSERT INTO book(id, author_id, title, published_in, language_id) VALUES(4 , 2 , 'Brida', 1990, 2);
