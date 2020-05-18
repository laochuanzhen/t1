package com.company;

import com.company.human.Person;
import com.company.transports.Airship;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Person person1 = new Person("1001838", "tom");
        Airship airship1 = new Airship("2000482", "airship");
        person1.driveMethod(airship1);
    }
}
