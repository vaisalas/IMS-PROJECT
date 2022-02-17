CREATE DATABASE IF NOT EXISTS ims;
USE IMS;

CREATE TABLE IF NOT EXISTS `customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `items`(
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `price` decimal(6,2) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `orders`(
  `id` int NOT NULL AUTO_INCREMENT,
  `customers_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`customers_id`) REFERENCES customers(`id`)
);

CREATE TABLE IF NOT EXISTS `orderitem`(
  `id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  `orders_id` INT NOT NULL,
  `items_id` INT NOT NULL,
  FOREIGN KEY (`orders_id`) REFERENCES orders(`id`),
  FOREIGN KEY (`items_id`) REFERENCES items(`id`)
);