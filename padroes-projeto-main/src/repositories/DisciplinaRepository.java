package src.repositories;

import java.util.ArrayList;
import java.util.List;
import src.entities.DisciplinaEntity;

public class DisciplinaRepostory {
    private static DisciplinaRepostory instance;
    private List<DisciplinaEntity> disciplinas;

    private DisciplinaRepostory() {
        this.disciplinas = new ArrayList<DisciplinaEntity>();
    }

    public static DisciplinaRepostory getInstance() {
        if (instance == null) {
            instance = new DisciplinaRepostory();
        }
        return instance;
    }

    public boolean insert(DisciplinaEntity disciplina) {
        return this.disciplinas.add(disciplina);
    }

    public boolean delet(DisciplinaEntity disciplina) {
        return this.disciplinas.remove(disciplina);
    }

    public int size() {
        return this.disciplinas.size();
    }

    public DisciplinaEntity getByIdDisciplina(int id) {
        DisciplinaEntity disciplina = new DisciplinaEntity();
        disciplina.setId(id);
        int index = this.disciplinas.indexOf(disciplina);
        if (index >= 0) {
            return this.disciplinas.get(index);
        }
        return null;
    }

    public boolean update(DisciplinaEntity disciplina) {
        int index = this.disciplinas.indexOf(disciplina);
        if (index >= 0) {
            this.disciplinas.set(index, disciplina);
            return true;
        }
        return false;
    }
}