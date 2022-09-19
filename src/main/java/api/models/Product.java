package api.models;

public class Product {
    private String name;
    private Integer price;
    private String description;
    private String fabricationTime;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFabricationTime() {
        return fabricationTime;
    }

    public void setFabricationTime(String fabricationTime) {
        this.fabricationTime = fabricationTime;
    }
    public void getProducts(){

    }
}
