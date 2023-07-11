package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] people = {
                "Иван Павлов 8934755 ",
                "Ирина Новикова 947596",
                "Петр Володин 775954 ",
                "Виола Зорина 879345"
        };
           task1(people);
    }
    static HashMap<Integer, List<SomePerson>> phonebooks = new HashMap<>();

    static void task1(String[] people){
        for (String peopleStr : people){
            String [] peopleParts = peopleStr.split( " ");
            int tel = Integer.parseInt(peopleParts[2]);

            SomePerson somePerson = new SomePerson(peopleParts[0], peopleParts[1], tel);
            if(phonebooks.containsKey(tel)){
                phonebooks.get(tel).add(somePerson);
            }
            else {
                ArrayList<SomePerson> lst = new ArrayList<>();
                lst.add(somePerson);
                phonebooks.put(tel, lst);
            }
        }
        for(Map.Entry<Integer, List<SomePerson>> el : phonebooks.entrySet()){
            for (SomePerson somePerson : el.getValue()){
                System.out.println(somePerson);
            }
        }

    };

}


