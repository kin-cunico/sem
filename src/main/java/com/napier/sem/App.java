package com.napier.sem;
import com.napier.sem.dataClasses.Employee;
import com.napier.sem.utils.DatabaseReq;


public class App {
    public static void main(String[] args) {
        // Connection to the database
        DatabaseReq req = new DatabaseReq();
        req.connectDb();
        Employee emp = req.getEmployee(255531);
        req.displayEmployee(emp);
        req.closeConnection();
    }
}