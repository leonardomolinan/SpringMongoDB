package br.com.neppo.springMongo.Models;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class UserModel {

    private String firstName;
    private String lastName;

    public UserModel() {
        super();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
