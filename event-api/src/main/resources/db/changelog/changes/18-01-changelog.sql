-- liquibase formatted sql

-- changeset swann:1710788908785-1
CREATE TABLE events
(
    id                UUID         NOT NULL,
    name              VARCHAR(255),
    slug              VARCHAR(255) NOT NULL,
    short_description VARCHAR(255),
    description       TEXT,
    CONSTRAINT pk_events PRIMARY KEY (id)
);

-- changeset swann:1710788908785-2
ALTER TABLE events
    ADD CONSTRAINT uc_events_slug UNIQUE (slug);

