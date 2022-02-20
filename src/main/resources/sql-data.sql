use ims;

INSERT INTO `customers` (`first_name`,`surname`)
VALUES
  ("Amethyst","Howard"),
  ("Hedy","Shannon"),
  ("Emerson","Prince"),
  ("Arden","Waller"),
  ("Jerry","Poole");
  
INSERT INTO `items` (`name`,`price`)
VALUES
 ("Gone Girl","5.99"),
  ("Rogue Lawyer","6.99"),
  ("Dear John","7.00"),
  ("The Notebook","6.49");
  
INSERT INTO `orders` (`fk_customers_id`)
VALUES
("1"),
("2"),
("4"),
("3"),
("3");

INSERT INTO `orderitem`(`fk_orders_id`,`fk_items_id`)
VALUES
("1" , "3"),
("2" , "3"),
("1" , "1"),
("3" , "4");