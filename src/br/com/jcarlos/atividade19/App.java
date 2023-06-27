package br.com.jcarlos.atividade19;

@Tabela(nome = "clientes")
class Cliente {
    // ...
}

public class App {
    public static void main(String[] args) {
        Class<?> clienteClass = Cliente.class;

        if (clienteClass.isAnnotationPresent(Tabela.class)) {
            Tabela tabelaAnnotation = clienteClass.getAnnotation(Tabela.class);
            String nomeTabela = tabelaAnnotation.nome();
            System.out.println("Nome da tabela: " + nomeTabela);
        } else {
            System.out.println("A anotação @Tabela não está presente na classe Cliente.");
        }
    }
}
