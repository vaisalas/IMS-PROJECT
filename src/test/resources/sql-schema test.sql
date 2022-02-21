CREATE DATABASE IF NOT EXISTS ims;
USE IMS;

DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS items;
DROP TABLE IF EXISTS orderitem;

CREATE TABLE IF NOT EXISTS `customers` (
    `customers_id` INT(50) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`customers_id`)
);

CREATE TABLE IF NOT EXISTS `items`(
  `items_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `price` decimal(6,2) NOT NULL,
  PRIMARY KEY (`items_id`)
);

CREATE TABLE IF NOT EXISTS `orders`(
  `orders_id` int NOT NULL AUTO_INCREMENT,
  `fk_customers_id` INT NOT NULL,
  PRIMARY KEY (`orders_id`),
  FOREIGN KEY (`fk_customers_id`) REFERENCES `customers`(`customers_id`)
);

CREATE TABLE IF NOT EXISTS `orderitem`(
  `orderitem_id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`orderitem_id`),
  `fk_orders_id` INT NOT NULL,
  `fk_items_id` INT NOT NULL,
  FOREIGN KEY (`fk_orders_id`) REFERENCES `orders`(`orders_id`),
  FOREIGN KEY (`fk_items_id`) REFERENCES `items`(`items_id`)
);
