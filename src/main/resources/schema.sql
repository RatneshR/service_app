--DROP TABLE IF EXISTS "widgets";
--
--DROP SEQUENCE IF EXISTS "widgets_id_seq";
--CREATE SEQUENCE widgets_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1;
--
--CREATE TABLE "widgets" (
--    "id" bigint DEFAULT nextval('widgets_id_seq') NOT NULL,
--    "name" text,
--    "purpose" text,
--     CONSTRAINT "widgets_pkey" PRIMARY KEY ("id")
--);

DROP TABLE IF EXISTS "books";
DROP TABLE IF EXISTS "authors";
CREATE SEQUENCE authors_id_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE "authors" (
    "id" bigint DEFAULT nextval('authors_id_seq') NOT NULL,
    "name" text,
    "age" integer,
    CONSTRAINT "authors_pkey" PRIMARY KEY ("id")
);

CREATE TABLE "books" (
    "isbn" bigint NOT NULL,
    "title" text,
    "author_id" text,
    CONSTRAINT "books_pkey" PRIMARY KEY ("isbn"),
    CONSTRAINT "fk_author" FOREIGN KEY ("author_id") REFERENCES "authors"("id")
);