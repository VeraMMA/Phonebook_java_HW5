package org.example;

import java.util.Objects;

public class SomePerson {
   private String name;
   private String surname;
   private int phone;



    /**
     * Позволяет создать новый объект и пронициализировать состояние
     * @param name имя объекта
     * @param surname имя объекта
     * @param phone телефон объекта
     */
    public SomePerson(String name, String surname, Integer phone){
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }



    @Override
    public String toString() {
        return name + " " + surname + " "  + phone;
    }
}
