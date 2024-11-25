package user.models;

public class Profesor extends Persoana implements User{

    private String rol;

    public Profesor(String nume, String prenume, String adresa, String numarTelefon, String CNP) {
        super(nume, prenume, adresa, numarTelefon, CNP);
    }

    public void login(){}
    public void logout(){}
    public String getRole(){
        return this.rol;
    }


}
