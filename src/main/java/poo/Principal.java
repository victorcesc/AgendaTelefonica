package poo;

public class Principal {

    public static void main(String[] args) {

        Agenda a = new Agenda(3);
        Pessoa p = new Pessoa("Victor","998627832",Agenda.getContador());
        a.adicionar(p);


        Pessoa p2 = new Pessoa("Maria","321515151",new Data(11,11,1111),Agenda.getContador());
        a.adicionar(p2);

        a.listarTodasPessoas();

        Pessoa[] resultado = a.localizar("Victor");



    }
}
