CREATE TABLE "Object" (
     "id" serial NOT NULL,
     "lead_id" bigint NOT NULL,
     "lat" float8 NOT NULL,
     "lng" float8 NOT NULL,
     CONSTRAINT "Object_pk" PRIMARY KEY ("id")
);




