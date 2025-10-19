package com.napier.sem;
import com.napier.sem.utils.DatabaseReq;

import java.sql.*;


public class App {
    public static void main(String[] args) {
        // Connection to the database

        DatabaseReq req = new DatabaseReq();

        req.connectDb();

        req.closeConnection();
    }
}