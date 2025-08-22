# Spring Security Practice

This project is a playground to learn and experiment with Spring Security.  It contains basic MVC pages and REST endpoints so that you can progressively add security features from the simplest configuration to more advanced setups.

## Getting Started

1. **Build and run the application:**
   ```bash
   ./mvnw spring-boot:run
   ```
2. Visit `http://localhost:8080` to see the home page.

## Progressive Exercise

Work through the following steps, committing after each one.  Each step builds on the previous step.

1. **Hello, Security**  
   * Add Spring Security with the default login form and configure an in-memory user.
   * Protect all endpoints so that any request requires authentication.

2. **Form Login with Custom Users**  
   * Replace the default user with your own in-memory user store containing at least two users with different roles.
   * Configure form based login.

3. **Role Based Access**  
   * Secure `/user` so that only users with role `USER` can access it.
   * Secure `/admin` so that only users with role `ADMIN` can access it.
   * Expose the REST endpoints under `/api` with similar role restrictions.

4. **Custom Login Page**  
   * Use the provided `login.html` template as the login page.
   * Configure logout and ensure it redirects to the home page.

5. **Register New Users**  
   * Implement a registration form using `register.html`.
   * Persist users in memory or a database and encode passwords.

6. **Remember-Me and Session Management**  
   * Add remember-me functionality.
   * Limit concurrent sessions per user.

7. **Method Level Security**  
   * Enable method security and use `@PreAuthorize` on service or controller methods.

8. **CSRF Protection**  
   * Explore CSRF protection on form submissions and REST APIs.
   * Demonstrate how to disable CSRF for stateless APIs when needed.

9. **JWT Based Authentication**  
   * Secure the `/api` endpoints with JWT tokens instead of the session.
   * Provide a login endpoint that issues tokens.

10. **OAuth2 Login (Optional Advanced)**  
    * Configure OAuth2 login with a third-party provider (e.g., Google or GitHub).

After each step, commit your changes and ask for code review or improvement suggestions.

Happy coding!
