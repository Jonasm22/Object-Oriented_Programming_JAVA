package Example_1;


public class Assesor  extends  Person{

String AssesorFirstName;
int AssesorNumber;

    public Assesor() {
    }

    public Assesor(int id, String dni, String firstName, String lastName, String adress, String phoneNummber,
                   String assesorFirstName, int assesorNumber) {
        super(id, dni, firstName, lastName, adress, phoneNummber);
        AssesorFirstName = assesorFirstName;
        AssesorNumber = assesorNumber;


    }


    public String getAssesorFirstName() {
        return AssesorFirstName;
    }

    public int getAssesorNumber() {
        return AssesorNumber;
    }


    public void setAssesorFirstName(String assesorFirstName) {
        AssesorFirstName = assesorFirstName;
    }

    public void setAssesorNumber(int assesorNumber) {
        AssesorNumber = assesorNumber;
    }
}
