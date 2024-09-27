src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── thentrees/
│   │           └── cleanarchitecture/
│   │               ├── core/
│   │               │   ├── entity/
│   │               │   │   └── User.java
│   │               │   ├── usecase/
│   │               │   │   ├── CreateUserUseCase.java
│   │               │   │   ├── DeleteUserUseCase.java
│   │               │   │   ├── GetUserUseCase.java
│   │               │   │   └── UpdateUserUseCase.java
│   │               │   └── exception/
│   │               │       └── UserNotFoundException.java
│   │               ├── adapters/
│   │               │   ├── controller/
│   │               │   │   └── UserController.java
│   │               │   ├── gateway/
│   │               │   │   ├── UserRepository.java
│   │               │   │   └── JpaUserRepository.java
│   │               │   └── presenter/
│   │               ├── configuration/
│   │               │   └── BeanConfiguration.java
│   │               └── shared/
│   └── resources/
│       └── application.yml
└── test/