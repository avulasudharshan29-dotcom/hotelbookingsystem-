CREATE DATABASE IF NOT EXISTS hotel_system;
USE hotel_system;

CREATE TABLE Rooms (
    room_id INT PRIMARY KEY,
    type VARCHAR(20),
    price DECIMAL(8,2),
    isBooked BOOLEAN
);

CREATE TABLE Customers (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    contact VARCHAR(50)
);

CREATE TABLE Bookings (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_id INT,
    room_id INT,
    checkin DATE,
    checkout DATE,
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
    FOREIGN KEY (room_id) REFERENCES Rooms(room_id)
);
