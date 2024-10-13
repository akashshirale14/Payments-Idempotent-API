package org.example;

import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Starting API Server...");
        port(8080);
        get("/balance/:id", new Route() {
            @Override
            public Object handle(Request request, Response response) {
                return "User: username=test, balance=1000";
            }
        });

        post("/addUser/", new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {
                request.
            }
        });

    }
}