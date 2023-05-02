public class PersonDetails {
    String name;
    Integer amount;
    String date;
    String description;
    String category;
    PersonDetails( String name, Integer amount, String date, String description, String category){
        this.amount=amount;
        this.date=date;
        this.name=name;
        this.description=description;
        this.category=category;
    }

    public String getName() {
        return name;
    }

    public Integer getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}
