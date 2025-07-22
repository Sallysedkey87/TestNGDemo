# MavenDemoProject

[![Maven Test](https://github.com/${{github.repository}}/actions/workflows/maven-test.yml/badge.svg)](https://github.com/${{github.repository}}/actions/workflows/maven-test.yml)

This project demonstrates the use of TestNG, ExtentReports, and Rest-Assured in a Maven-based Java testing framework. It includes examples of test grouping, annotations, reporting, and API testing.

## Features
- TestNG-based test suites and groups
- ExtentReports integration for test reporting
- REST API testing with Rest-Assured
- Example TestNG configuration files
- GitHub Actions CI for automated testing

## Running Tests
To run the tests locally:
```bash
mvn test
```

## Continuous Integration
This project uses GitHub Actions to automatically run tests on every push and pull request to the `main` branch.