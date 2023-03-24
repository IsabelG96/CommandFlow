package org.example;

import java.util.Scanner;

public class WeatherTask {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please describe the weather");
        String weather = reader.nextLine();

        System.out.println("please enter the temp in celsius");
        int temperature = reader.nextInt();

        if(weather.toLowerCase().equals("sunny") && temperature > 8){
            System.out.println("short sleeve and shorts");
        }
        if(weather.toLowerCase().equals("sunny") && temperature < 8){
            System.out.println("Sunglasses and a coat");
        }
    }
}
