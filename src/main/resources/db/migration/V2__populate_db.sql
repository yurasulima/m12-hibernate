INSERT INTO client (name) VALUES
('Oleg1'),
('Oleg2'),
('Oleg3'),
('Oleg4'),
('Oleg5'),
('Oleg6'),
('Oleg7'),
('Oleg8'),
('Oleg9'),
('Oleg10');


INSERT INTO planet(id, name) VALUES
('EARTH', 'Earth'),
('VENUS', 'Venus'),
('MARS', 'Mars'),
('JUPITER', 'Jupiter'),
('SATURN', 'Saturn');


INSERT INTO ticket(client_id, from_planet_id, to_planet_id) VALUES
(1, 'MARS', 'EARTH'),
(2, 'VENUS', 'SATURN'),
(3, 'SATURN', 'EARTH'),
(4, 'JUPITER', 'EARTH'),
(5, 'MARS', 'EARTH'),
(6, 'SATURN', 'EARTH'),
(7, 'MARS', 'SATURN'),
(8, 'MARS', 'EARTH'),
(9, 'VENUS', 'SATURN'),
(10, 'MARS', 'VENUS');
