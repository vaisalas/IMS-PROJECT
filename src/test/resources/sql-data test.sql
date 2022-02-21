CREATE DATABASE IF NOT EXISTS ims;

use IMS;

DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS items;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS orderitem;

INSERT INTO `customers` (`first_name`,`surname`)
VALUES ("Amethyst","Howard");

INSERT INTO `items` (`name`,`price`)
VALUES ("Gone Girl","5.99");

INSERT INTO `orders` (`fk_customers_id`)
VALUES ("1");

INSERT INTO `orderitem`(`fk_orders_id`,`fk_items_id`)
VALUES ("1" , "3")