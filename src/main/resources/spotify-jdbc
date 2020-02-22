CREATE SCHEMA `spotify` ;


CREATE TABLE users (
id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(255) NOT NULL,
last_name VARCHAR(255) NOT NULL,
email VARCHAR(255),
birth_date DATE,
subscription BOOLEAN
)

CREATE TABLE artists (
id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(255) NOT NULL,
last_name VARCHAR(255) NOT NULL,
genre VARCHAR(255)
)


CREATE TABLE songs (
id INT AUTO_INCREMENT PRIMARY KEY,
song_name VARCHAR(255) NOT NULL,
release_date DATE NOT NULL,
song_length INT NOT NULL,
artist_id INT NOT NULL,
FOREIGN KEY (artist_id) REFERENCES artists(id)












