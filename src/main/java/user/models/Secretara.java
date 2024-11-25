package user.models;


public class Secretara extends Persoana implements User{

    private String rol;

    public Secretara(String nume, String prenume, String adresa, String numarTelefon, String CNP) {
        super(nume, prenume, adresa, numarTelefon, CNP);
    }

    public void login(){}
    public void logout(){}
    public String getRole(){
        return this.rol;
    }


}