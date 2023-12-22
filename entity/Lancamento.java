package entity;

public class Lancamento extends Categoria {

    private String type;
    private String amount;
    private String date;
    private boolean paid;
    private Long categoryId;

    public Lancamento() {

    }

    public Lancamento(Long id, String name, String description, String type, String amount, String date, boolean paid, Long categoryId) {
        super(id, name, description);
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.paid = paid;
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Lancamento{" +
                "\n    id: " + super.getId() +
                "\n    name: " + super.getName() +
                "\n    description: " + super.getDescription() +
                "\n    type: " + type +
                "\n    amount: " + amount +
                "\n    date: " + date +
                "\n    paid: " + paid +
                "\n    categoryId: " + categoryId +
                "\n}";
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean getPaid() {
        return this.paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
