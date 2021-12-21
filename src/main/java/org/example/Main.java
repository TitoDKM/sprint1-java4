package org.example;

import com.sparkpost.Client;
import com.sparkpost.exception.SparkPostException;
import com.sparkpost.transport.IRestConnection;

public class Main {
    static Client client = new Client("876eec3ea54daa781dd490eb4ce1b7da1feb3afb", IRestConnection.SPC_EU_ENDPOINT); // 074373279f34349e73c1e0c6eb7cd520458fd6d6

    public static void main(String[] args) {
        try {
            client.sendMessage("tito@mail.daboy.me", "97dahh@gmail.com", "Subject", "Text", "<h1>HTML</h1>");
        } catch (SparkPostException e) {
            System.out.println("Error while trying to send mail: " + e.toString());
        }
    }
}