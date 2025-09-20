package com.napier.sem;
import com.napier.sem.utils.InputReq;
import com.napier.sem.utils.MongReq;


public class App {
    public static void main(String[] args) {
/*        InputReq inputReq = new InputReq();
        inputReq.promptName();
        inputReq.greetUser();
        inputReq.guessAge();*/

        MongReq mongReq = new MongReq();

        System.out.println(mongReq.getDoc().toJson());
    }
}