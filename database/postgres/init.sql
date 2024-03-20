CREATE DATABASE "event-api";
CREATE DATABASE "card-api";
CREATE DATABASE "event-management-api";


GRANT ALL PRIVILEGES ON DATABASE "event-api" TO root;
GRANT ALL PRIVILEGES ON DATABASE "card-api" TO root;
GRANT ALL PRIVILEGES ON DATABASE "event-management-api" TO root;

\c "event-api"
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

\c "card-api"
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

\c "event-management-api"
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";