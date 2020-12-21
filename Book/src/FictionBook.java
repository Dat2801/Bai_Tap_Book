public class FictionBook extends Book implements Discount{
    private String category;
    private double promotionalPrice;

    public FictionBook() {
    }

    public FictionBook(String category, double promotionalPrice) {
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    public FictionBook(int bookCode, String name, double price, String author, String category, double promotionalPrice) {
        super(bookCode, name, price, author);
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBooks{" +
                "id sách=" + getBookCode()+
                ",name=" + getName() +
                ",author=" + getAuthor()+
                ",price=" + getPrice()+
                ",category='" + category + '\'' +
                ", promotionalPrice=" + promotionalPrice +
                '}';
    }
    @Override
    public double setDiscount(int persent) {
        return promotionalPrice = getPrice()*(1-persent)/100;
    }
}
