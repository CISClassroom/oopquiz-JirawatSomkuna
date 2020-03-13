package com.company;

public class Main {

    public static void main(String[] args) {
        String[] inculcation = new String[44];
        Person person = new Person();

        person.Name = "...";
        person.Address = "...";
        person.Tel = "0XX-XXXXXXX";
        person.Email = "...@...";
        person.Status = " ";

        if(person.Status == "Collegian"){
            Collegian collegian = new Collegian();

            collegian.ID = "6X34100XX-X";
            collegian.Branch = "...";
            collegian.Academy = "...";
        }
        else if (person.Status == "Personnel"){
            Personnel personnel = new Personnel();

            personnel.Affiliation = "...";
        }

        for(int i = 0; i < 45; i++){
            System.out.println((i + 1) + inculcation[i]);
        }
        System.out.println("Full Room");
    }
}
