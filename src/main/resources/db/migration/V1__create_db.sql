CREATE TABLE IF NOT EXISTS client (
    id BIGINT PRIMARY KEY auto_increment,
    name VARCHAR(200) NOT NULL CHECK(length(name) >= 3 AND length(name) <= 200)
);

CREATE TABLE IF NOT EXISTS planet (
    id VARCHAR(20) PRIMARY KEY CHECK (id ~ '^[A-Z0-9]+$'),
    name VARCHAR(500) NOT NULL CHECK (LENGTH(name) >= 1 AND LENGTH(name) <= 500)
);

CREATE TABLE ticket (
    id BIGINT PRIMARY KEY auto_increment,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    client_id INT NOT NULL,
    from_planet_id VARCHAR(20) NOT NULL,
    to_planet_id VARCHAR(20) NOT NULL,
    FOREIGN KEY (client_id) REFERENCES client(id) ON DELETE CASCADE,
    FOREIGN KEY (from_planet_id) REFERENCES planet(id) ON DELETE CASCADE,
    FOREIGN KEY (to_planet_id) REFERENCES planet(id) ON DELETE CASCADE
);