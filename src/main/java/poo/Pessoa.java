package poo;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    private Data dNasc;
    private int id;

    public Pessoa(String nome, String telefone, int id) {
        this.nome = nome;
        this.telefone = telefone;
        this.id = id;
    }

    public Pessoa(String nome, String telefone, Data dNasc, int id) {
        this(nome,telefone,id);
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Data getdNasc() {
        return dNasc;
    }

    public void setdNasc(Data dNasc) {
        this.dNasc = dNasc;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        String res;
        if(this.dNasc!=null) {
             res = "Nome :" + this.nome + "\nSobrenome: " + this.sobrenome + "\nTelefone: " + this.telefone + "\nE-mail: " + this.email + "\nData Nasc:" + this.dNasc.toString();
        }else{
             res = "Nome :" + this.nome + "\nSobrenome: " + this.sobrenome + "\nTelefone: " + this.telefone + "\nE-mail: " + this.email + "\nData Nasc:--/--/----";
        }
        return res;
    }
}
