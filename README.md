# employee_management
Employee CURD Operation(Spring boot+JPA+MYSQL)

Application: employee_management
Author : Meenakshi Rakshit

Start Application : mvn clean spring-boot:run

API Details
==================

Get All employee details

URI:http://localhost:9999/employee_management/api/v1/employee/
HTTP METHOD: GET

Sample Response:

    [
        {
            "sapId": 1,
            "name": "Meenakshi",
            "gender": "Female",
            "doj": "2018-09-14",
            "emailId": "meenakshi_r@hcl.com",
            "department": "GLS",
            "projectName": "P&P"
        },
        {
            "sapId": 2,
            "name": "Mriganka",
            "gender": "Male",
            "doj": "2018-09-14",
            "emailId": "mriganka.roy@gmail.com",
            "department": "GLS",
            "projectName": "P&P"
        }
     ]

 Get employee Details by Id:

URI:http://localhost:9999/employee_management/api/v1/employee/{SAP_ID}
HTTP METHOD: GET
Sample: http://localhost:9999/employee_management/api/v1/employee/1

 Sample Response:
 
     [
         {
             "sapId": 1,
             "name": "Meenakshi",
             "gender": "Female",
             "doj": "2018-09-14",
             "emailId": "meenakshi_r@hcl.com",
             "department": "GLS",
             "projectName": "P&P"
         }

     ]

 Create Employee:

 URI:http://localhost:9999/employee_management/api/v1/employee/
 HTTP Method: POST
 Content-Type :application/json;charset=UTF-8
 Request Body sample:
 
     {
         "name": "Arohi_1",
         "gender": "Female",
         "doj": "2018-09-14",
         "emailId": "arohi_r_1@mit.edu",
         "department": "GLS",
         "projectName": "P&P"
     }

 Response Body Sample:

     {
         "sapId": 4,
         "name": "Arohi_1",
         "gender": "Female",
         "doj": "2018-09-14T00:00:00.000+0000",
         "emailId": "arohi_r_1@mit.edu",
         "department": "GLS",
         "projectName": "P&P"
     }

Update Employee

URI:http://localhost:9999/employee_management/api/v1/employee/{SAP_ID}
HTTP Method:PUT
Content-Type :application/json;charset=UTF-8

Request Body Sample:

    {
        "sapId": 4,
        "name": "Arohi_2",
        "gender": "Female",
        "doj": "2018-09-14",
        "emailId": "arohi_r_1@mit.edu",
        "department": "GLS",
        "projectName": "P&P"
    }

 Response Body Sample:

    {
            "sapId": 4,
            "name": "Arohi_2",
            "gender": "Female",
            "doj": "2018-09-14",
            "emailId": "arohi_r_1@mit.edu",
            "department": "GLS",
            "projectName": "P&P"
        }


Delete Employee

URI: http://localhost:9999/employee_management/api/v1/employee/{SAP_ID}
HTTP Method:DELETE
