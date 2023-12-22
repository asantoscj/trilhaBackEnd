package entity;

public class Categoria {
    
    public Long id;
    public String name;
    public String description;

    public Categoria() {

    }

    public Categoria(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String toString() {
        return description.toString();
    }
    
}
