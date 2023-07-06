package src.services;

import src.entities.CursoEntity;
import src.entities.DisciplinaEntity;
import src.repositories.DisciplinaRepostory;

public class DisciplinaService {
    private static DisciplinaService instance;
    private DisciplinaRepostory disciplinaRepository;
    private DisciplinaService() {
        this.disciplinaRepository = DisciplinaRepostory.getInstance();
    }

    public static DisciplinaService getInstance() {
        if(instance == null) {
            instance = new DisciplinaService();
        }
        return instance;
    }

    public boolean insert(int id, String nome, String descricao, CursoEntity curso) {
        DisciplinaEntity disciplina = new DisciplinaEntity();
        disciplina.setId(id);
        disciplina.setDescricao(descricao);
        disciplina.setNome(nome);
        disciplina.setCurso(curso);
        return this.disciplinaRepository.insert(disciplina);
    }

    public DisciplinaEntity getById(int idDisciplina) {
        return this.disciplinaRepository.getByIdDisciplina(idDisciplina);
    }

    public boolean update(int idDisciplina, String nome, String descricao, CursoEntity curso) {
        DisciplinaEntity disciplina = this.getById(idDisciplina);
        if(disciplina != null) {
            disciplina.setNome(nome);
            disciplina.setDescricao(descricao);
            disciplina.setCurso(curso);
            return this.disciplinaRepository.update(disciplina);
        }
        return false;
    }

    public boolean delete(int idDisciplina) {
        DisciplinaEntity disciplina = new DisciplinaEntity();
        disciplina.setId(idDisciplina);
        return this.disciplinaRepository.delet(disciplina);
    }
}
