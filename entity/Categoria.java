package entity;

public class Categoria {

    private Long id;
    private String name;
    private String description;

    public Categoria() {

    }

    public Categoria(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Categoria{\n" +
                "   id: " + id +
                ", \n   name: " + name +
                ", \n   description: " + description +
                "\n}";
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
