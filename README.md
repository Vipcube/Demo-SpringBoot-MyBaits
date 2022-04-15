# The Demo of MyBaits integrate with SpringBoot

## Overview

This project show MyBaits how to work with Spring Boot.

There modules show as below:

- `Database`：Use flyway to migrate database tables.
- `MyBaits`：The demo of simple CRUD API and one to many select, it's create by used MyBaits integrate with SpringBoot.
- `MyBaits-Plus`： The demo of simple CRUD API, pageable, database auditing and one to many select, it's create by used MyBaits + MyBaits Plus integrate with SpringBoot

## Run Applications

1. Startup the Database.

```shell
docker-compose up -d ./docker/docker-compose.yml
```

2. Run command to create tables.

```shell
mvn flyway:migrate
```

3. Startup Service： `MyBaits` or `MyBaits-Plus`
4. Try with REST API endpoints.
