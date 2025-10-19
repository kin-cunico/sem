package com.napier.sem;
import com.napier.sem.dataClasses.Employee;
import com.napier.sem.utils.DatabaseReq;



public class App {
    public static void main(String[] args) {
        // Connection to the database

        DatabaseReq req = new DatabaseReq();

        req.connectDb();

        req.closeConnection();

        Employee emp = req.getEmployee(2345);

        req.displayEmployee(emp);
    }
}