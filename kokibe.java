
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 56130
 */
public class User {

    private String firstName;
    private String lastName;
    private String profession;

    public User(int id, String firstName, String lastName, int age) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public String getChildName(User child) {
        if(name != null && name.length() > 0){ if(name.equals("Harry")){ name = name.replace('r', 'p'); } this.name = name.concat(child.getLastName()) }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
