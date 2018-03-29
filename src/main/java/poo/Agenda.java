package poo;


import java.util.ArrayList;

public class Agenda {
    private Pessoa[] contatos;
    private static int contador = 0;


    public Agenda(int tamanho){
        this.contatos = new Pessoa[tamanho];

    }

    public static int getContador(){
        return contador;

    }

    public boolean adicionar(Pessoa p){

        for (int i = 0; i <contatos.length ; i++) {
            if(contatos[i]==null){
                contatos[i] = p;
                return true;
            }
        }
        return false;
    }

    public void listarTodasPessoas(){
        for (int i = 0; i <this.contatos.length ; i++) {
            if(this.contatos[i]!=null) {
                System.out.println(this.contatos[i].toString());
                System.out.println("--------------------------------------");
            }
        }

    }

    public Pessoa localizar(int id){
        for (int i = 0; i <this.contatos.length ; i++) {
            if(this.contatos[i].getId() == id){
                return this.contatos[i];
            }


        }
        return null;
    }

    public Pessoa[] localizar(String criterio){
        ArrayList<Pessoa> resultado = new ArrayList<>();
        for (int i = 0; i <this.contatos.length ; i++) {
            if (this.contatos[i] != null) {

                if (criterio.equals(this.contatos[i].getNome())) {
                    resultado.add(this.contatos[i]);
                }
            }
        }

        return resultado.toArray(new Pessoa[resultado.size()]);

    }

}
