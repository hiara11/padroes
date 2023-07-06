package src.entities;

public class DisciplinaEntity {

    private int matricula;
    private String nome;
    private boolean ativo;
    private CursoEntity curso;

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
        return false;
        DisciplinaEntity other = (DisciplinaEntity) obj;
        return Objects.equals(id, other.id);
    }

    @Override
    public String toString() {
        return new StringBuilder("ID Disciplina: ").append(this.id).append(", nome: ").append(this.nome)
                .append(", descricao: ").append(this.descricao).append(", curso: ").append(this.curso.getNome())
                .toString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public CursoEntity getCurso() {
        return curso;
    }

    public void setCurso(CursoEntity curso) {
        this.curso = curso;
    }
}
