
package Example_1;


//Person class attributes

public class Person {
     int Id;
     String Dni;
     String FirstName;
     String LastName;
     String Adress;
     String PhoneNummber;

     //Empty Constructor
    public Person() {
    }

    //Default Constructor
    public Person(int id, String dni, String firstName, String lastName, String adress, String phoneNummber) {
        Id = id;
        Dni = dni;
        FirstName = firstName;
        LastName = lastName;
        Adress = adress;
        PhoneNummber = phoneNummber;
    }

    //Getter
    public int getId() {
        return Id;
    }

    public String getDni() {
        return Dni;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getAdress() {
        return Adress;
    }

    public String getPhoneNummber() {
        return PhoneNummber;
    }

    // Setter
    public void setId(int id) {
        Id = id;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public void setPhoneNummber(String phoneNummber) {
        PhoneNummber = phoneNummber;
    }
}
