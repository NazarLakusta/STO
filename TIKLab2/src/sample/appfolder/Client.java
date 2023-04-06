package sample.appfolder;

public class Client {
    private String surname;
    private String name;
    private String numberPhone;
    private String probablyProblem;

    public Client(String surname, String name, String numberPhone, String probablyProblem) {
        this.surname = surname;
        this.name = name;
        this.numberPhone = numberPhone;
        this.probablyProblem = probablyProblem;
    }

    public Client(){

    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getProbablyProblem() {
        return probablyProblem;
    }

    public void setProbablyProblem(String probablyProblem) {
        this.probablyProblem = probablyProblem;
    }

    @Override
    public String toString() {
        return "Client{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", probablyProblem='" + probablyProblem + '\'' +
                '}';
    }


}
