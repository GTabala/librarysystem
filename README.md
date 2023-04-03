# Capgemini programming task

## Engineers’ library system

### Introduction

Create a library system to support the administration of maintaining a physical library of reference books for engineers.  The front-end UI will be developed later, this task iteration is solely for the backend implementation.

This library system will be created in this GitHub repository. This repo will act as the "corporate server".

### Build approach

Each requirement has an associated priority.  Design, build and demo the highest priority items first. Each task is labelled so P1 is a higher priority than P2 and P2 is higher than P3.

You will build the application in three phases:
* Phase 1 will be the highest priority items.
* Phase 2 will be the medium priority items.
* Phase 3 will be the lowest priority items.

#### Common features for all users:
* See a list of books available right now (P1)
* See a list of books coming available soon (within 3 days of return) (P3)
* Search for a book by title, author or ISBN (P1)

#### As a user
* ‘Check-out’ a book (P2). Indicates that a user has a physical copy of a book with an agreed loan time of 1 or 2 weeks
* ‘Check-in’ a book (P2). Indicates that a book has been returned to the library

#### As a librarian (admin function)
* Check-out or check-in a book on behalf of another user (P3)
* Add new books to the library (P1)
* Remove books from the library (P2)
* Generate a report for books overdue (P3)
* Generate a report for frequent late returners of books (P3)

Additional notes:
* No user account is required to search the library.
* Checking out and in a book requires the user to provide their email address.  No user account is required
* Librarian (Admin) access is via an allow-list of defined email addresses.
* There could be multiple copies of a book.

### Technical requirements:
* Java 8 or greater
* Spring boot built with maven
* TDD must be followed (use git to provide via history that TDD is followed)
* 85% minimum code coverage required in Junit.  The build must fail if 85% is not achieved)
* Database – engineer’s choice
* Proof that the application can support multiple simultaneous users (JMeter or similar may be useful here)
* Logging to facilitate problem resolution.  Be mindful of logging PII.
* You may run the application run in a docker container if required.
* OpenApi specs are required for the APIs that your application exposes. These can be generated from your code.
* API is REST/Json

Deliverables for each development Phase:
* Design for the system features
* OpenApi specs the API specification
* Working API, proven with a suite of tests and proof of test coverage
* A demo of the working application from the different user contexts (customer and librarian where appropriate)