# Contackt - Contact Management Application

A modern, containerized contact management application built with Spring Boot and React. This application allows users to manage their contacts with basic CRUD operations in a user-friendly interface.

## Project Structure

```
contackt/
├── src/                           # Backend source code
│   ├── main/
│   │   ├── java/
│   │   │   └── com/subodh/contackt/
│   │   │       ├── config/       # Configuration classes
│   │   │       │   └── WebConfig.java
│   │   │       ├── controller/   # REST controllers
│   │   │       │   └── ContactController.java
│   │   │       ├── model/       # Data models
│   │   │       │   └── Contact.java
│   │   │       ├── repository/  # Database repositories
│   │   │       │   └── ContactRepository.java
│   │   │       ├── service/     # Business logic
│   │   │       │   └── ContactService.java
│   │   │       └── ContacktApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/                     # Backend tests
├── frontend/                     # Frontend source code
│   ├── src/
│   │   ├── components/          # React components
│   │   │   ├── ContactForm.js
│   │   │   └── ContactList.js
│   │   ├── App.js
│   │   └── index.js
│   ├── public/
│   ├── package.json
│   ├── Dockerfile               # Frontend Dockerfile
│   └── nginx.conf              # Nginx configuration
├── Dockerfile                   # Backend Dockerfile
├── docker-compose.yml          # Docker Compose configuration
├── pom.xml                     # Backend dependencies
└── README.md                   # This file
```

## Technology Stack

### Backend
- Java 21
- Spring Boot 3.4.4
- Spring Data JPA
- MySQL 8
- Maven

### Frontend
- React 18
- Material-UI
- Axios
- Node.js 20
- Nginx

### DevOps & Infrastructure
- Docker
- Docker Compose
- Nginx
- Maven multi-stage builds

## Prerequisites

- Docker
- Docker Compose
- Git

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/contackt.git
   cd contackt
   ```

2. Start the application using Docker Compose:
   ```bash
   docker-compose up -d
   ```

3. Access the application:
   - Frontend: http://localhost
   - Backend API: http://localhost:8080
   - MySQL: localhost:3306

## Docker Container Management

### View running containers:
```bash
docker-compose ps
```

### View container logs:
```bash
# All containers
docker-compose logs

# Specific container
docker-compose logs backend
docker-compose logs frontend
docker-compose logs mysql
```

### Restart containers:
```bash
docker-compose restart
```

### Stop containers:
```bash
docker-compose down
```

## Database Management

### Accessing MySQL Container:
```bash
docker-compose exec mysql mysql -uroot -proot
```

### Common MySQL Commands:
```sql
-- List databases
SHOW DATABASES;

-- Use contackt database
USE contackt;

-- List tables
SHOW TABLES;

-- View contacts
SELECT * FROM contacts;
```

## API Endpoints

### Contacts API
- GET `/contacts` - List all contacts
- GET `/contacts/{id}` - Get contact by ID
- POST `/contacts` - Create new contact
- PUT `/contacts/{id}` - Update contact
- DELETE `/contacts/{id}` - Delete contact

## Future Enhancements

### Features
1. User Authentication & Authorization
   - JWT-based authentication
   - Role-based access control
   - OAuth2 integration

2. Contact Features
   - Contact groups/categories
   - Contact import/export (CSV, vCard)
   - Contact sharing
   - Contact search and filtering
   - Contact notes and tags
   - Contact history/audit log

3. UI/UX Improvements
   - Dark mode
   - Responsive design
   - Drag-and-drop interface
   - Bulk operations
   - Advanced search filters

### System Design Enhancements
1. Scalability
   - Implement caching (Redis)
   - Message queuing (RabbitMQ/Kafka)
   - Load balancing
   - Database sharding

2. Performance
   - API rate limiting
   - Database indexing
   - Query optimization
   - Content compression

3. Monitoring & Observability
   - Prometheus metrics
   - Grafana dashboards
   - ELK stack integration
   - Distributed tracing (Jaeger)

### DevOps Integration
1. CI/CD Pipeline
   - GitHub Actions/Jenkins
   - Automated testing
   - Code quality checks
   - Security scanning

2. Infrastructure as Code
   - Terraform configurations
   - Kubernetes manifests
   - Helm charts

3. Security
   - SSL/TLS configuration
   - Secret management (Vault)
   - Container security scanning
   - WAF integration

4. Backup & Recovery
   - Automated database backups
   - Disaster recovery plan
   - High availability setup

### Cloud Integration
1. AWS Services
   - ECS/EKS deployment
   - RDS for MySQL
   - S3 for file storage
   - CloudFront CDN

2. Microservices Architecture
   - Service discovery
   - API gateway
   - Circuit breakers
   - Event-driven architecture

## Contributing

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.
