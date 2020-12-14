# XMAS LOTTERY APP V3

## App used in determining who's got who on Christmas!

## Structure:

- config: app global configuration (Spring Security)
- domain: domain layer with gateways
- endpoints: controller layer
- gateway: database layer with gateways that implement domain gateways
- usecase: service layer

## Flyway

App uses flyway as database migration tool. Every migration script is under resources/db/migration.