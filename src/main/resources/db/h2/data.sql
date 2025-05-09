-- src/main/resources/data.sql

-- CUSTOMER Data (Assuming some customer data based on OrderRepository usage)
INSERT INTO CUSTOMER (ID, NAME, CUSTOMER_SINCE) VALUES
                                                    (1, 'Ana C. G. Martin', '2006-02-13'), -- Corresponds to cust1 in OrderRepository
                                                    (2, 'Antonio Machado', '2007-12-03'),
                                                    (3, 'Bill T. Gates', '2007-03-09'),
                                                    (4, 'James T. Kirk', '2008-01-15'),   -- Corresponds to cust4 in OrderRepository
                                                    (5, 'Jean-Luc Picard', '2007-05-20'),
                                                    (6, 'Kathryn Janeway', '2009-11-02');  -- Corresponds to cust6 in OrderRepository


-- PRODUCT Data (From ProductRepository.java)
INSERT INTO PRODUCT (ID, NAME, IN_STOCK, PRICE) VALUES
                                                    (1, 'Fresh Sweet Basil', true, 4.99),
                                                    (2, 'Italian Tomato', false, 1.25),
                                                    (3, 'Yellow Bell Pepper', true, 2.50),
                                                    (4, 'Old Cheddar', true, 18.75),
                                                    (5, 'Extra Virgin Coconut Oil', true, 6.34),
                                                    (6, 'Organic Tomato Ketchup', true, 1.99),
                                                    (7, 'Whole Grain Oatmeal Cereal', true, 3.07),
                                                    (8, 'Traditional Tomato & Basil Sauce', true, 2.58),
                                                    (9, 'Quinoa Flour', true, 3.02),
                                                    (10, 'Grapefruit Juice', true, 2.58),
                                                    (11, '100% Pure Maple Syrup', true, 5.98),
                                                    (12, 'Marinara Pasta Sauce', false, 2.08),
                                                    (13, 'Vanilla Puff Cereal', false, 1.75),
                                                    (14, 'Extra Virgin Oil', false, 5.01),
                                                    (15, 'Roasted Garlic Pasta Sauce', true, 2.40),
                                                    (16, 'Canned Minestrone Soup', true, 2.19),
                                                    (17, 'Almond Milk 1L', true, 3.24),
                                                    (18, 'Organic Chicken & Wild Rice Soup', true, 3.17),
                                                    (19, 'Purple Carrot, Blackberry, Quinoa & Greek Yogurt', true, 8.88),
                                                    (20, 'Pumpkin, Carrot and Apple Juice', false, 3.90),
                                                    (21, 'Organic Canola Oil', true, 10.13),
                                                    (22, 'Potato Corn Tortilla Chips', true, 2.44),
                                                    (23, 'Canned Corn Chowder Soup', true, 2.30),
                                                    (24, 'Organic Lemonade Juice', true, 2.48),
                                                    (25, 'Spicy Basil Dressing', true, 4.72),
                                                    (26, 'Sweet Agave Nectar', true, 6.46),
                                                    (27, 'Dark Roasted Peanut Butter', false, 3.48),
                                                    (28, 'Unsweetened Lemon Green Tea', true, 18.34),
                                                    (29, 'Whole Grain Flakes Cereal', true, 3.52),
                                                    (30, 'Berry Chewy Granola Bars', true, 4.00);

-- COMMENT Data (From ProductRepository.java)
-- Comments for Product ID 2 (Italian Tomato)
INSERT INTO COMMENT (ID, TEXT, PRODUCT_ID) VALUES
                                               (1, 'I''m so sad this product is no longer available!', 2),
                                               (2, 'When do you expect to have it back?', 2);

-- Comments for Product ID 13 (Vanilla Puff Cereal)
INSERT INTO COMMENT (ID, TEXT, PRODUCT_ID) VALUES
                                               (3, 'Very tasty! I''d definitely buy it again!', 13),
                                               (4, 'My kids love it!', 13),
                                               (5, 'Good, my basic breakfast cereal. Though maybe a bit in the sweet side...', 13),
                                               (6, 'Not that I find it bad, but I think the vanilla flavouring is too intrusive', 13),
                                               (7, 'I agree with the excessive flavouring, but still one of my favourites!', 13),
                                               (8, 'Cheaper than at the local store!', 13),
                                               (9, 'I''m sorry to disagree, but IMO these are far too sweet', 13),
                                               (10, 'Good. Pricey though.', 13);

-- Comments for Product ID 9 (Quinoa Flour)
INSERT INTO COMMENT (ID, TEXT, PRODUCT_ID) VALUES
                                               (11, 'Made bread with this and it was great!', 9),
                                               (12, 'Note: this comes actually mixed with wheat flour', 9);

-- Comments for Product ID 14 (Extra Virgin Oil)
INSERT INTO COMMENT (ID, TEXT, PRODUCT_ID) VALUES
                                               (13, 'Awesome Spanish oil. Buy it now.', 14),
                                               (14, 'Would definitely buy it again. Best one I''ve tasted', 14),
                                               (15, 'A bit acid for my taste, but still a very nice one.', 14),
                                               (16, 'Definitely not the average olive oil. Really good.', 14);

-- Comments for Product ID 16 (Canned Minestrone Soup)
INSERT INTO COMMENT (ID, TEXT, PRODUCT_ID) VALUES
    (17, 'Great value!', 16);

-- Comments for Product ID 24 (Organic Lemonade Juice)
INSERT INTO COMMENT (ID, TEXT, PRODUCT_ID) VALUES
    (18, 'My favourite :)', 24);

-- Comments for Product ID 30 (Berry Chewy Granola Bars)
INSERT INTO COMMENT (ID, TEXT, PRODUCT_ID) VALUES
                                               (19, 'Too hard! I would not buy again', 30),
                                               (20, 'Taste is OK, but I agree with previous comment that bars are too hard to eat', 30),
                                               (21, 'Would definitely NOT buy again. Simply unedible!', 30);


-- GTORDER Data (From OrderRepository.java)
-- Order 1 for Customer 4 (James T. Kirk)
INSERT INTO GTORDER (ID, CUSTOMER_ID, ORDER_DATE) VALUES
    (1, 4, '2009-01-12 10:23:00');

-- OrderLines for Order 1
INSERT INTO ORDER_LINE (ORDER_ID, PRODUCT_ID, AMOUNT, PURCHASE_PRICE) VALUES
                                                                          (1, 2, 2, 0.99),  -- Product: Italian Tomato
                                                                          (1, 3, 4, 2.50),  -- Product: Yellow Bell Pepper
                                                                          (1, 4, 1, 15.50); -- Product: Old Cheddar

-- Order 2 for Customer 6 (Kathryn Janeway)
INSERT INTO GTORDER (ID, CUSTOMER_ID, ORDER_DATE) VALUES
    (2, 6, '2010-06-09 21:01:00');

-- OrderLines for Order 2
INSERT INTO ORDER_LINE (ORDER_ID, PRODUCT_ID, AMOUNT, PURCHASE_PRICE) VALUES
                                                                          (2, 1, 5, 3.75),  -- Product: Fresh Sweet Basil
                                                                          (2, 4, 2, 17.99); -- Product: Old Cheddar

-- Order 3 for Customer 1 (Ana C. G. Martin)
-- Note: In original OrderRepository, order3 was associated with cust1 but added to cust4's list.
-- Here, it's correctly associated with Customer ID 1.
INSERT INTO GTORDER (ID, CUSTOMER_ID, ORDER_DATE) VALUES
    (3, 1, '2010-07-18 22:32:00');

-- OrderLines for Order 3
INSERT INTO ORDER_LINE (ORDER_ID, PRODUCT_ID, AMOUNT, PURCHASE_PRICE) VALUES
    (3, 1, 8, 5.99);  -- Product: Fresh Sweet Basil
