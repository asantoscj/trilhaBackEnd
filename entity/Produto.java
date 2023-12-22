package entity;

public class Produto extends Categoria {

    private Double price;

    public Produto() {
        super();
    }

    public Produto(Long id, String name, String description, Double price) {
        super(id, name, description);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produto{\n    id: " + super.getId() +
                "\n    name: " + super.getName() +
                "\n    description: " + super.getDescription() +
                "\n    price: " + price +
                "\n} ";
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
