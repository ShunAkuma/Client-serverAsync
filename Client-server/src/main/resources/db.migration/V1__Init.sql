CREATE TABLE "perobject" (
     "id" bigserial NOT NULL primary key,
     "lead_id" int8 NOT NULL,
     "lat" float8 NOT NULL,
     "lng" float8 NOT NULL
);