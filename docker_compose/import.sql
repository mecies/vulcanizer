CREATE DATABASE vulcan_db;
CREATE USER su WITH ENCRYPTED PASSWORD '123';
GRANT ALL PRIVILEGES ON DATABASE vulcan_db TO su;