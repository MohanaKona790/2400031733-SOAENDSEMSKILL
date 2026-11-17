SERVICE DISCOVERY USING EUREKA - STS QUICK START

Requirements:
- JDK 17
- Spring Tool Suite (STS 4)
- Maven (STS includes Maven integration)
- Internet connection for the first Maven dependency download

IMPORT INTO STS:
1. Extract this ZIP file.
2. Open STS.
3. Select File > Import > Maven > Existing Maven Projects.
4. Browse to the extracted eureka-service-discovery folder.
5. Select the parent pom.xml and click Finish.
6. Wait for Maven dependencies to download. If needed, right-click the projects
   and choose Maven > Update Project.

RUN IN THIS ORDER:
1. Right-click EurekaServerApplication.java > Run As > Spring Boot App.
2. Right-click ProviderApplication.java > Run As > Spring Boot App.
3. Right-click ConsumerApplication.java > Run As > Spring Boot App.

TEST:
- Eureka dashboard: http://localhost:8761
- Provider endpoint: http://localhost:8081/message
- Consumer endpoint: http://localhost:8082/consume

Expected response from both endpoints:
Hello from Service Provider!

IMPORTANT:
- Keep all three applications running while testing.
- If a port is already in use, stop the other application using that port.
- First run needs internet to download Maven dependencies.
- This project uses Spring Boot 3.3.5, Spring Cloud 2023.0.3, and Java 17.
