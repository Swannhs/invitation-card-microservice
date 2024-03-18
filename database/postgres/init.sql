CREATE DATABASE "event-api";

GRANT ALL PRIVILEGES ON DATABASE "event-api" TO root;

\c "event-api"
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";