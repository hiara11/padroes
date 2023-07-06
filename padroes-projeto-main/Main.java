[21:11] LUANA FERNANDA DOS SANTOS



import java.util.Scanner;

import src.entities.AlunoEntity;

import src.entities.CursoEntity;

import src.entities.DisciplinaEntity;

import src.services.AlunoService;

import src.services.CursoService;

import src.services.DisciplinaService;

 

public class Main {

 

    private static Scanner scanner = new Scanner(System.in);

 

    private static AlunoService alunoService = AlunoService.getInstance();

    private static CursoService cursoService = CursoService.getInstance();

    private static DisciplinaService disciplinaService = DisciplinaService.getInstance();

 

    public static int readInt() {

        while (true) {

            try {

                return Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException ex) {

                System.out.println("Valor inválido. Digite novamente:");

            }

        }

    }

 

    public static boolean readAtivo() {

        while (true) {

            String leitura = scanner.nextLine();

 

            if ("S".equalsIgnoreCase(leitura)) {

                return true;

            } else if ("N".equalsIgnoreCase(leitura)) {

                return false;

            } else {

                System.out.println("Valor inválido. Digite apenas 'S' ou 'N':");

            }

        }

    }

 

    public static void main(String[] args) {

        int opcao;

 

        do {

            System.out.println("1 - Cadastrar Curso");

            System.out.println("2 - Pesquisar Curso");

            System.out.println("3 - Alterar Curso");

            System.out.println("4 - Excluir Curso");

            System.out.println("5 - Cadastrar Disciplina");

            System.out.println("6 - Pesquisar Disciplina");

            System.out.println("7 - Alterar Disciplina");

            System.out.println("8 - Excluir Disciplina");

            System.out.println("9 - Cadastrar Aluno");

            System.out.println("10 - Pesquisar Aluno");

            System.out.println("11 - Alterar Aluno");

            System.out.println("12 - Excluir Aluno");

            System.out.println("13 - Sair");

 

            opcao = readInt();

 

            switch (opcao) {

                case 1:

                    System.out.println("Informe o ID do curso:");

                    int idCurso = readInt();

 

                    if (idCurso > 0) {

                        System.out.println("Informe o nome do curso:");

                        String nome = scanner.nextLine();

 

                        System.out.println("Informe a descrição do curso:");

                        String descricao = scanner.nextLine();

 

                        if (cursoService.insert(idCurso, nome, descricao)) {

                            System.out.println("Curso inserido com sucesso");

                        } else {

                            System.out.println("Falha ao tentar inserir o curso");

                        }

                    } else {

                        System.out.println("ID inválido, favor informar somente números inteiros positivos");

                    }

                    break;

                case 2:

                    System.out.println("Informe o ID do curso:");

                    int idCursoPesquisa = readInt();

 

                    CursoEntity cursoPesquisa = cursoService.getByID(idCursoPesquisa);

 

                    if (cursoPesquisa != null) {

                        System.out.println(cursoPesquisa);

                    } else {

                        System.out.println("Curso não encontrado");

                    }

                    break;

                case 3:

                    System.out.println("Informe o ID do curso:");

                    int idCursoAlteracao = readInt();

 

                    CursoEntity cursoAlteracao = cursoService.getByID(idCursoAlteracao);

 

                    if (cursoAlteracao != null) {

                        System.out.println("Informe o novo nome do curso:");

                        String nomeAlteracao = scanner.nextLine();

 

                        System.out.println("Informe a nova descrição do curso:");

                        String descricaoAlteracao =import java.util.Scanner;

import src.entities.AlunoEntity;

import src.entities.CursoEntity;

import src.entities.DisciplinaEntity;

import src.services.AlunoService;

import src.services.CursoService;

import src.services.DisciplinaService;

 

public class Main {

 

    private static Scanner scanner = new Scanner(System.in);

 

    private static AlunoService alunoService = AlunoService.getInstance();

    private static CursoService cursoService = CursoService.getInstance();

    private static DisciplinaService disciplinaService = DisciplinaService.getInstance();

 

    public static int readInt() {

        while (true) {

            try {

                return Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException ex) {

                System.out.println("Valor inválido. Digite novamente:");

            }

        }

    }

 

    public static boolean readAtivo() {

        while (true) {

            String leitura = scanner.nextLine();

 

            if ("S".equalsIgnoreCase(leitura)) {

                return true;

            } else if ("N".equalsIgnoreCase(leitura)) {

                return false;

            } else {

                System.out.println("Valor inválido. Digite apenas 'S' ou 'N':");

            }

        }

    }

 

    public static void main(String[] args) {

        int opcao;

 

        do {

            System.out.println("1 - Cadastrar Curso");

            System.out.println("2 - Pesquisar Curso");

            System.out.println("3 - Alterar Curso");

            System.out.println("4 - Excluir Curso");

            System.out.println("5 - Cadastrar Disciplina");

            System.out.println("6 - Pesquisar Disciplina");

            System.out.println("7 - Alterar Disciplina");

            System.out.println("8 - Excluir Disciplina");

            System.out.println("9 - Cadastrar Aluno");

            System.out.println("10 - Pesquisar Aluno");

            System.out.println("11 - Alterar Aluno");

            System.out.println("12 - Excluir Aluno");

            System.out.println("13 - Sair");

 

            opcao = readInt();

 

            switch (opcao) {

                case 1:

                    System.out.println("Informe o ID do curso:");

                    int idCurso = readInt();

 

                    if (idCurso > 0) {

                        System.out.println("Informe o nome do curso:");

                        String nome = scanner.nextLine();

 

                        System.out.println("Informe a descrição do curso:");

                        String descricao = scanner.nextLine();

 

                        if (cursoService.insert(idCurso, nome, descricao)) {

                            System.out.println("Curso inserido com sucesso");

                        } else {

                            System.out.println("Falha ao tentar inserir o curso");

                        }

                    } else {

                        System.out.println("ID inválido, favor informar somente números inteiros positivos");

                    }

                    break;

                case 2:

                    System.out.println("Informe o ID do curso:");

                    int idCursoPesquisa = readInt();

 

                    CursoEntity cursoPesquisa = cursoService.getByID(idCursoPesquisa);

 

                    if (cursoPesquisa != null) {

                        System.out.println(cursoPesquisa);

                    } else {

                        System.out.println("Curso não encontrado");

                    }

                    break;

                case 3:

                    System.out.println("Informe o ID do curso:");

                    int idCursoAlteracao = readInt();

 

                    CursoEntity cursoAlteracao = cursoService.getByID(idCursoAlteracao);

 

                    if (cursoAlteracao != null) {

                        System.out.println("Informe o novo nome do curso:");

                        String nomeAlteracao = scanner.nextLine();

 

                        System.out.println("Informe a nova descrição do curso:");

                        String descricaoAlteracao = scanner.nextLine();

 

                        if (cursoService.update(idCursoAlteracao, nomeAlteracao, descricaoAlteracao)) {

                            System.out.println"Curso alterado com sucesso");

                        } else {

                            System.out.println("Falha ao tentar alterar o curso");

                        }

                    } else {

                        System.out.println("Curso não encontrado");

                    }

                    break;

                case 4:

                    System.out.println("Informe o ID do curso:");

                    int idCursoExclusao = readInt();

 

                    CursoEntity cursoExclusao = cursoService.getByID(idCursoExclusao);

 

                    if (cursoExclusao != null) {

                        if (cursoExclusao.getAlunosSize() == 0) {

                            if (cursoService.delete(idCursoExclusao)) {

                                System.out.println("Curso removido com sucesso");

                            } else {

                                System.out.println("Falha ao tentar remover o curso");

                            }

                        } else {

                            System.out.println("O curso não pode ser excluído, pois possui alunos matriculados");

                        }

                    } else {

                        System.out.println("Curso não encontrado");

                    }

                    break;

                case 5:

                    System.out.println("Informe o ID do curso da disciplina:");

                    int idCursoDisciplina = readInt();

 

                    CursoEntity cursoDisciplina = cursoService.getByID(idCursoDisciplina);

 

                    if (cursoDisciplina != null) {

                        System.out.println("Informe o ID da disciplina:");

                        int idDisciplina = readInt();

 

                        if (idDisciplina > 0) {

                            System.out.println("Informe o nome da disciplina:");

                            String nomeDisciplina = scanner.nextLine();

 

                            System.out.println("Informe a descrição da disciplina:");

                            String descricaoDisciplina = scanner.nextLine();

 

                            if (disciplinaService.insert(idDisciplina, nomeDisciplina, descricaoDisciplina, cursoDisciplina)) {

                                System.out.println("Disciplina inserida com sucesso");

                            } else {

                                System.out.println("Falha ao tentar inserir disciplina");

                            }

                        } else {

                            System.out.println("ID da disciplina inválido, favor informar somente números inteiros positivos");

                        }

                    } else {

                        System.out.println("Curso não encontrado");

                    }

                    break;


  case 6:

                    System.out.println("Informe o ID da disciplina:");

                    int idDisciplinaPesquisa = readInt();

 

                    DisciplinaEntity disciplinaPesquisa = disciplinaService.getById(idDisciplinaPesquisa);

 

                    if (disciplinaPesquisa != null) {

                        System.out.println(disciplinaPesquisa);

                    } else {

                        System.out.println("Disciplina não encontrada");

                    }

                    break;

                case 7:

                    System.out.println("Informe o ID da disciplina:");

                    int idDisciplinaAlteracao = readInt();

 

                    DisciplinaEntity disciplinaAlteracao = disciplinaService.getById(idDisciplinaAlteracao);

 

                    if (disciplinaAlteracao != null) {

                        System.out.println("Informe o novo ID do curso da disciplina:");

                        int idNovoCursoDisciplina = readInt();

 

                        CursoEntity novoCursoDisciplina = cursoService.getByID(idNovoCursoDisciplina);

 

                        if (novoCursoDisciplina != null) {

                            System.out.println("Informe o novo nome da disciplina:");

                            String novoNomeDisciplina = scanner.nextLine();

 

                            System.out.println("Informe a nova descrição da disciplina:");

                            String novaDescricaoDisciplina = scanner.nextLine();

 

                            if (disciplinaService.update(idDisciplinaAlteracao, novoNomeDisciplina, novaDescricaoDisciplina, novoCursoDisciplina)) {

                                System.out.println("Disciplina alterada com sucesso");

                            } else {

                                System.out.println("Falha ao tentar alterar a disciplina");

                            }

                        } else {

                            System.out.println("Curso não encontrado");

                        }

                    } else {

                        System.out.println("Disciplina não encontrada");

                    }

                    break;

                case 8:

                    System.out.println("Informe o ID da disciplina:");

                    int idDisciplinaExclusao = readInt();

 

                    DisciplinaEntity disciplinaExclusao = disciplinaService.getById(idDisciplinaExclusao);

 

                    if (disciplinaExclusao != null) {

                        if (disciplinaService.delete(idDisciplinaExclusao)) {

                            System.out.println("Disciplina removida com sucesso");

                        } else {

                            System.out.println("Falha ao tentar remover a disciplina");

                        }

                    } else {

                        System.out.println("Disciplina não encontrada");

                    }

                    break;

                case 9:

                    System.out.println("Informe a matrícula do aluno:");

                    int matriculaAluno = readInt();

 

                    if (matriculaAluno > 0) {

                        System.out.println("Informe o nome do aluno:");

                        String nomeAluno = scanner.nextLine();

 

                        System.out.println("Informe o status do aluno (S/N):");

                        boolean ativoAluno = readAtivo();

 

                        System.out.println("Informe o ID do curso do aluno:");

                        int idCursoAluno = readInt();

 

                        CursoEntity cursoAluno = cursoService.getByID(idCursoAluno);

 

                        if (cursoAluno != null) {

                            if (alunoService.insert(matriculaAluno, nomeAluno, ativoAluno, cursoAluno)) {

                                System.out.println("Aluno inserido com sucesso");

                            } else {

                                System.out.println("Falha ao tentar inserir o aluno");

                            }

                        } else {

                            System.out.println("Curso não encontrado");

                        }

                    } else {

                        System.out.println("Matrícula inválida, favor informar somente números inteiros positivos");

                    }

                    break;

                case 10:

                    System.out.println("Informe a matrícula do aluno:");

                    int matriculaPesquisa = readInt();

 

                    AlunoEntity alunoPesquisa = alunoService.getByMatricula(matriculaPesquisa);

 

                    if (alunoPesquisa != null) {

                        System.out.println(alunoPesquisa);

                    } else {

                        System.out.println("Aluno não encontrado");

                    }

                    break;

                case 11:

                    System.out.println("Informe a matrícula do aluno:");

                    int matriculaAlteracao = readInt();

 

                    AlunoEntity alunoAlteracao = alunoService.getByMatricula(matriculaAlteracao);

 

                    if (alunoAlteracao != null) {

                        System.out.println("Informe o novo nome do aluno:");

                        String novoNomeAluno = scanner.nextLine();

 

                        System.out.println("Informe o novo status do aluno (S/N):");

                        boolean novoStatusAluno = readAtivo();

 

                        System.out.println("Informe o novo ID do curso do aluno:");

                        int novoIdCursoAluno = readInt();

 

                        CursoEntity novoCursoAluno = cursoService.getByID(novoIdCursoAluno);

 

                        if (novoCursoAluno != null) {

                            if (alunoService.update(matriculaAlteracao, novoNomeAluno, novoStatusAluno, novoCursoAluno)) {

                                System.out.println("Aluno alterado com sucesso");

                            } else {

                                System.out.println("Falha ao tentar alterar o aluno");

                            }

                        } else {

                            System.out.println("Curso não encontrado");

                        }

                    } else {

                        System.out.println("Aluno não encontrado");

                    }

                    break;

                case 12:

                    System.out.println("Informe a matrícula do aluno:");

                    int matriculaExcluirAluno = readInt();

 

                    AlunoEntity alunoExclusao = alunoService.getByMatricula(matriculaExclusao);

 

                    if (alunoExclusao != null) {

                        if (alunoService.delete(matriculaExclusao)) {

                            System.out.println("Aluno removido com sucesso");

                        } else {

                            System.out.println("Falha ao tentar remover o aluno");

                        }

                    } else {

                        System.out.println("Aluno não encontrado");

                    }

                    break;

                case 13:

                    System.out.println("Saindo do programa...");

                    break;

                default:

                    System.out.println("Opção inválida. Digite novamente.");

                    break;

            }

        } while (opcao != 13);

    }

}
