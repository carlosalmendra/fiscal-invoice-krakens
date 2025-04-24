CREATE TABLE invoices (
      id SERIAL PRIMARY KEY,
      state_code VARCHAR(255),
      tax_rate DOUBLE PRECISION,
      total DOUBLE PRECISION
);

CREATE TABLE products (
      id SERIAL PRIMARY KEY,
      sku VARCHAR(100),
      description TEXT,
      price NUMERIC(15, 2),
      tax DOUBLE PRECISION,
      total NUMERIC(15, 2)
);