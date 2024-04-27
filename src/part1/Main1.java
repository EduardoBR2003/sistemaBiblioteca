package part1;

import java.util.ArrayList;
import java.util.Scanner;
/*Acontece os seguintes polimorfismos:

- Sobrecarga (Overloading)
- Sobrescrita (Overriding)

Para implementa as seguintes regras:
    Empréstimos para estudantes: até 3 livros, por até 7 dias
    Empréstimos para funcionários: até 6 livros, por até 15 dias
    Empréstimos para professores: até 9 livros, por até 30 dias.

    Seria necessario criar um método na classe 'Empréstimo' para
    verificar qual de qual tipo de classe o objeto usuario foi instanciado,
    com isso aplicando as regras dentro método, e retornando um valor
    Booleano, com a determina regra.
*/
public class Main1 {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.exibirMenu();
//        menu.cadastraLivro();
//        menu.cadastraLivro();
//        menu.cadastraLivro();
//        menu.cadastraUsuario();
//        menu.cadastraEmprestimo();
//        menu.mostrarEmprestimos();
//        menu.realizarDevolucao();
//        menu.mostrarEmprestimos();
    }

    public static class Menu{
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();

        public static Scanner reader(){ //Método reader para utilizar o Scanner sem precisar instancialo varias vezes.
            return new Scanner(System.in);
        }

        //Métodos de ação do menu.
        public void cadastraLivro(){ //Cadastrando livros.
            Livro livro = new Livro();
            System.out.println("Insira o título do livro: ");
            livro.setTitulo(reader().next());
            System.out.println("Insira o autor: ");
            livro.setAutor(reader().next());
            System.out.println("Insira o area do livro: ");
            livro.setArea(reader().next());
            System.out.println("Insira o editora: ");
            livro.setEditora(reader().next());
            System.out.println("Insira o genero: ");
            livro.setGenero(reader().next());
            System.out.println("Insira o ano: ");
            livro.setAno(reader().nextInt());
            System.out.println("Insira o edição: ");
            livro.setEdicao(reader().nextInt());
            System.out.println("Insira o número de folhas: ");
            livro.setNumFolhas(reader().nextInt());
            //Livro livro = new Livro("Alice no pais das maravilhas", "Jose", "Entreterimento", "LIVROSLTDA","ficção",2021, 6, 235);

            livros.add(livro);
            System.out.println("Cadastro do livro '"+ livro.getTitulo() +"' realizado com sucesso.");
        }

        public void cadastrarProfessor(){
            Professor professor = new Professor();
            System.out.println("Insira o nome do Professor: ");
            professor.setNome(reader().next());
            System.out.println("Insira a idade:");
            professor.setIdade(reader().nextInt());
            System.out.println("Insira o sexo: ");
            professor.setSexo(reader().next());
            System.out.println("Insira o telefone: ");
            professor.setTelefone(reader().next());
            System.out.println("Insira o id: ");
            professor.setId(reader().nextInt());
            System.out.println("Insira a disciplina: ");
            professor.setDisciplina(reader().next());
            System.out.println("Insira a matéria: ");
            professor.setMateria(reader().next());

            usuarios.add(professor);
            System.out.println("O professor '"+professor .getNome()+"' cadastrado com sucesso.");
        }

        public void cadastrarEstudante(){
            Estudante estudante = new Estudante();
            System.out.println("Insira o nome do estudante: ");
            estudante.setNome(reader().next());
            System.out.println("Insira a idade:");
            estudante.setIdade(reader().nextInt());
            System.out.println("Insira o sexo: ");
            estudante.setSexo(reader().next());
            System.out.println("Insira o telefone: ");
            estudante.setTelefone(reader().next());
            System.out.println("Insira a matricula: ");
            estudante.setMatricula(reader().next());
            System.out.println("Insira a turma: ");
            estudante.setTurma(reader().next());

            usuarios.add(estudante);
            System.out.println("O estudante '"+estudante.getNome()+"' cadastrado com sucesso.");
        }

        public void cadastrarFuncionario(){
            Funcionario funcionario = new Funcionario();
            System.out.println("Insira o nome do Funcionário: ");
            funcionario.setNome(reader().next());
            System.out.println("Insira a idade:");
            funcionario.setIdade(reader().nextInt());
            System.out.println("Insira o sexo: ");
            funcionario.setSexo(reader().next());
            System.out.println("Insira o telefone: ");
            funcionario.setTelefone(reader().next());
            System.out.println("Insira o id: ");
            funcionario.setId(reader().nextInt());
            System.out.println("Insira a função: ");
            funcionario.setFuncao(reader().next());

            usuarios.add(funcionario);
            System.out.println("O funcionário '"+funcionario.getNome()+"' cadastrado com sucesso.");
        }

        public void cadastraUsuario(){ //Cadastrando usuário
            Usuario usuario = new Usuario();
            System.out.println("Insira o nome do usuário: ");
            usuario.setNome(reader().next());
            System.out.println("Insira a idade:");
            usuario.setIdade(reader().nextInt());
            System.out.println("Insira o sexo: ");
            usuario.setSexo(reader().next());
            System.out.println("Insira o telefone: ");
            usuario.setTelefone(reader().next());
            System.out.println("Insira o id: ");
            usuario.setId(reader().nextInt());
            //Usuario usuario = new Usuario("Eduardo",20,"masculino","38999343462",20);

            usuarios.add(usuario);
            System.out.println("O Usuário '"+usuario.getNome()+"' cadastrado com sucesso.");
        }

        public void cadastraEmprestimo(){
            Emprestimo emprestimo = new Emprestimo();
            listarLivro(livros);
            listarUsers(usuarios);

            int i=0;
            //Pegando o objeto livro no array e adicionando no emprestimo
            System.out.println("Selecione o livro: ");
            i = reader().nextInt();
            livros.get(i).setEmprestimo(true); //Setando o emprestimo para true
            emprestimo.setLivro(livros.get(i));

            //Pegando o objeto usuários e adicionando no emprestimo
            System.out.println("Selecione o usuário:");
            i = reader().nextInt();
            emprestimo.setUsuario(usuarios.get(i));
            System.out.println();

            System.out.println("Insira a data e a hora do emprestimo respectivamente: ");
            emprestimo.setDataEmprestimo(reader().next());
            emprestimo.setHoraEmprestimo(reader().next());

            emprestimos.add(emprestimo);

            System.out.println("Empréstimo realizado com sucesso.");
        }

        public void realizarDevolucao(){
            listarEmpres(emprestimos);

            int i = 0;
            System.out.println("Selecione o empréstimo que deseja quitar: ");
            i = reader().nextInt();
            emprestimos.get(i).getLivro().setEmprestimo(false);

            System.out.println(emprestimos.remove(i).toString());
            System.out.println("Empréstimo quitado com sucesso. ");
        }

        public void mostrarEmprestimos(){
            listarEmpres(emprestimos);
        }


        //Métodos para manusear os Arrays Lists
        public  void listarLivro(ArrayList<Livro>livros){
            int i = 0;
            for(Livro livro : livros){
                System.out.println(i++ +"-"+livro);
            }
            System.out.println();
        }
        public void listarUsers(ArrayList<Usuario>usuarios){
            int i = 0;
            for(Usuario user : usuarios){
                System.out.println(i++ +"-"+user);
            }
            System.out.println();
        }
        public void listarEmpres(ArrayList<Emprestimo>emprestimos){
            int i=0;
            for (Emprestimo emp: emprestimos){
                System.out.println(i++ +"-"+emp);
            }
            System.out.println();
        }


        //Método menu
        public void exibirMenu(){
            int op = 0;

            while (true){
                System.out.println(menu());
                op = reader().nextInt();
                switch (op){
                    case 1:
                        cadastraLivro();
                        break;
                    case 2:
                        System.out.println("Informe qual tipo de usuário deseja cadastrar: ");
                        System.out.println("1 - Professor \n 2 - Estudante \n 3 - Funcionário");
                        int i = reader().nextInt();
                        if(i==1){
                            cadastrarProfessor();
                        } else if (i==2) {
                            cadastrarEstudante();
                        } else if (i==3) {
                            cadastrarFuncionario();
                        }else {
                            System.out.println("Nenhuma opção selecionada.");
                        }
                        break;
                    case 3:
                        cadastraEmprestimo();
                        break;
                    case 4:
                        realizarDevolucao();
                        break;
                    case 5:
                        mostrarEmprestimos();
                        break;
                    default:
                        System.out.println("Selecione a opção correta.");
                        break;
                }
            }
        }
        public String menu(){
            return """
                \nSelecione a opção que queira executar\n
                \n1 - Cadastrar livro:
                \n2 - Cadastrar Usuário:
                \n3 - Realizar empréstimo:
                \n4 - Realizar devolução:
                \n5 - Mostrar empréstimos:
                """;
        }
    }
}



/*      LINHAS DE TEST

        Livro livro = new Livro("Alice no pais das maravilhas", "Jose", "Entreterimento", "LIVROSLTDA","ficção",2021, 6, 235);
        //Usuario usuario = new Usuario("Eduardo", 20, "M", "0000-0000", 2);
        Estudante estudante = new Estudante("Eduardo", 20, "M", "0000-0000", 2,"A",20323);
        Emprestimo emp = new Emprestimo("04/02/2023", "14:30", livro, estudante);

        System.out.println("Livro: "+emp.getLivro().getTitulo());
        System.out.println("Usuário: "+emp.getUsuario().getNome());
        System.out.println("Data: "+emp.getDataEmprestimo());
        emp.getLivro().consumirObra(); //Utilização do polimorfismo
        emp.getLivro().abrirLivro();
        emp.getUsuario().lerLivro();
        emp.getLivro().fecharLivro();
        emp.devolverLivro();
        */
