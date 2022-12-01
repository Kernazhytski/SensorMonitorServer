To launch the project you need to install MySQL and create a server.
After go to the src/main/resources/application.properties and change username and password of the server.
Change a link for the MySQL server.
Then create a new SQL tab and paste the commands:

    CREATE SCHEMA `table_data`;

    use table_data;

    CREATE TABLE `table_data`.`types` (
      `id` INT NOT NULL,
      `type_of_probes` VARCHAR(45) NOT NULL,
      PRIMARY KEY (`id`));

    insert types(id,type_of_probes) values(1,'Pressure');
    insert types(id,type_of_probes) values(2,'Voltage');
    insert types(id,type_of_probes) values(3,'Temperature');
    insert types(id,type_of_probes) values(4,'Humidity');

    CREATE TABLE `table_data`.`probe` (
      `id` INT NOT NULL,
      `name` VARCHAR(30) NOT NULL,
      `model` VARCHAR(15) NOT NULL,
      `range_from` INT NOT NULL,
      `range_to` INT NOT NULL,
      `type` VARCHAR(45) NOT NULL,
      `unit` VARCHAR(45) NOT NULL,
      `location` VARCHAR(40) NULL,
      `description` VARCHAR(200) NULL,
      PRIMARY KEY (`id`));

    CREATE TABLE `table_data`.`units` (
          `id` INT NOT NULL,
          `unit_of_probes` VARCHAR(45) NOT NULL,
          PRIMARY KEY (`id`));

    insert units(id,unit_of_probes) values(1,'bar');
    insert units(id,unit_of_probes) values(2,'voltage');
    insert units(id,unit_of_probes) values(3,'°С');
    insert units(id,unit_of_probes) values(4,'%');

    CREATE TABLE `table_data`.`roles` (
       `id` BIGINT NOT NULL,
       `name` VARCHAR(100) NOT NULL,
       UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE,
       PRIMARY KEY (`id`));

    insert roles(id,name) values(1,'ROLE_VIEWER');
    insert roles(id,name) values(2,'ROLE_ADMIN');

    CREATE TABLE `table_data`.`users` (
         `id` BIGINT NOT NULL,
         `username` VARCHAR(255) NOT NULL,
         UNIQUE INDEX `name_UNIQUE` (`username` ASC) VISIBLE,
         `password` VARCHAR(255) NOT NULL,
         PRIMARY KEY (`id`));

    insert users(id,password,username) values(1,'$2a$10$jTRMYdG.QJu6sVB6HSP8T.etmtxPUQWEz39AqKXrtR6iWEDn2/jh2','viewer');
    insert users(id,password,username) values(2,'$2a$10$vj9kqF2qrpUOy759U/TbHOH3EachIdeIS.W8H0qIjD7n3lRFG3rN.','admin');



Then launch the program and stop it after success launch, refresh the table, after you see a new table 'user_roles'
enter this SQL commands in a new SQL tab:

    use table_data;

    insert user_roles(user_id,role_id) values(1,1);
    insert user_roles(user_id,role_id) values(2,2);


Setting a Java server is finished!
