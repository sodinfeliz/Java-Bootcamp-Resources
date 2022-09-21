import java.util.Arrays;

public class Person {
    
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    int seatNumber;

    // Constructors

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }

    public Person(Person source) {
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getDataOfBirth() {
        return dateOfBirth;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String[] getPassport() {
        return Arrays.copyOf(passport, passport.length);
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDataOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setPassport() {
        this.passport = new String[] {this.name, this.nationality, this.dateOfBirth};
    }

    // Actions

    /**
     *  Function name: applyPassport
     *  @return (boolean)
     *
     *  Inside the function:
     *     1. Returns a random boolean of true or false.
     */
    public boolean applyPassport() {
        if (Math.random() > 0.5) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *  Function name: chooseSeat
     *
     *  Inside the function:
     *    1. Sets this.seat to a random number between 1 -- 11.
     */
    public void chooseSeat() {
        this.seatNumber = (int)(Math.random()*11 + 1);
    } 


    public String toString() {
        return "Name: " + this.name + "\n" + 
               "Nationality: " + this.nationality + "\n" + 
               "Date of Birth: " + this.dateOfBirth + "\n" +
               "Seat Number: " + this.seatNumber + "\n" + 
               "Passport: " + Arrays.toString(this.passport) + "\n";
    }

}
