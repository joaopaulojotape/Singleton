public class Email {

    private static Email email = new Email();
    private String cadastrado;

    public Email(){

    }
    public static Email getEmail(){

        return email;
    }

    public String getCadastrado() {
        return cadastrado;
    }

    public void setCadastrado(String cadastrado) {
        this.cadastrado = cadastrado;
    }

}
