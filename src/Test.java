import classes.Emprestimo;
import classes.Livro;
import classes.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int op= -1;
        boolean loop = true;

        ArrayList<Livro> livros=new ArrayList<Livro>();
        ArrayList<Usuario> users=new ArrayList<Usuario>();
        ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

        while (loop){
            System.out.println(menu());
            op = sc.nextInt();
            switch (op){
                case 1://Cadastrar LIVRO
                    Livro novoLivro = new Livro("Ação","Duds","O FAMOSO","Geografia","HEBERTRICHAS",12,200,"2024");
//                    System.out.println("\nInsira o genenro do livro: ");
//                    novoLivro.setGenero(sc.next());
//                    System.out.println("Insira o título do livro: ");
//                    novoLivro.setTitulo(sc.next());
//                    System.out.println("Insira o autor do livro: ");
//                    novoLivro.setAutor(sc.next());
//                    System.out.println("Insira a area do livro: ");
//                    novoLivro.setAutor(sc.next());
//                    System.out.println("Insira a editora do livro: ");
//                    novoLivro.setEditora(sc.next());
//                    System.out.println("Insira a edição do livro: ");
//                    novoLivro.setEdicao(sc.nextInt());
//                    System.out.println("insira o ano do livro: ");
//                    novoLivro.setAno(sc.next());
//                    System.out.println("Insira o númeor de folhas: ");
//                    novoLivro.setNum_Folhas(sc.nextInt());
                    livros.add(novoLivro);
                    System.out.println("classes.Livro cadastrado com sucesso!!!");
                    break;
                case 2://Cadastrar User
                    Usuario novoUser = new Usuario("Eduardo","masculino","38999343462",20);
//                    System.out.println("Insira o nome: ");
//                    novoUser.setNome(sc.next());
//                    System.out.println("Insira o sexo: ");
//                    novoUser.setSexo(sc.next());
//                    System.out.println("Insira o telefone: ");
//                    novoUser.setTelefone(sc.next());
//                    System.out.println("Insira a idade: ");
//                    novoUser.setIdade(sc.nextInt());
                    users.add(novoUser);
                    System.out.println("Usuário cadastrado com sucesso: ");
                    sc = new Scanner(System.in);
                    break;
                case 3://classes.Emprestimo
                    Emprestimo emp = new Emprestimo();
                    System.out.println("Realizando empréstimo:");

                    System.out.println("Insira  a data do empréstimo: ");
                    emp.setDataEmprestimo(sc.next());

                    System.out.println("Insira a hora do empréstimo: ");
                    emp.setHoras(sc.nextInt());

                    listarLivro(livros);
                    System.out.println("Qual o número livro? ");
                    emp.setLivro(livros.get(sc.nextInt()));

                    listarUsers(users);
                    System.out.println("Qual o número do usuário? ");
                    emp.setUser(users.get(sc.nextInt()));

                    emprestimos.add(emp);
                    System.out.println("Empréstimo realizado com sucesso!!!");
                    break;
                case 4:
                    listarEmpres(emprestimos);
                    System.out.println("Insira empréstimo que você deseja quitar: ");
                    int i = sc.nextInt();

                    System.out.println(emprestimos.get(i).toString());
                    emprestimos.remove(i);

                    System.out.println("Empréstimo quitado!!!");
                    break;
                case 5://Listar empréstimos
                    listarEmpres(emprestimos);
                    break;
                case 6://Listar usuários
                    listarUsers(users);
                    break;
                case 7://Listar LIVROS
                    listarLivro(livros);
                case 0:
                    loop=false;
                    break;
                default:
                    System.out.println("Selecione uma opção valida:");
                    break;
            }
        }
    }
    public static void listarLivro(ArrayList<Livro>livros){
        int i = 0;
        for(Livro livro : livros){
            System.out.println(i++ +"-"+livro);
        }
        System.out.println();
    }
    public static void listarUsers(ArrayList<Usuario>usuarios){
        int i = 0;
        for(Usuario user : usuarios){
            System.out.println(i++ +"-"+user);
        }
        System.out.println();
    }
    public static void listarEmpres(ArrayList<Emprestimo>emprestimos){
        int i=0;
        for (Emprestimo emp: emprestimos){
            System.out.println(i++ +"-"+emp);
        }
        System.out.println();
    }
    public static String menu(){
        return """
                \nSelecione a opção que queira executar\n
                \n1 - Cadastrar classes.Livro:    
                \n2 - Cadastrar Usuário:  
                \n3 - Realizar empréstimo:
                \n4 - Realizar devolução:
                \n5 - Lista empréstimos:
                \n6 - Lista users:
                \n7 - Listar livros: 
                \n0 - SAIR  
                """;
    }
}

