CREATE TABLE AIRLINE(
  ROOM_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  NAME VARCHAR(16) NOT NULL,
  AIRLINE_NUMBER CHAR(2) NOT NULL UNIQUE,
  SEAT_INFO CHAR(2) NOT NULL
);