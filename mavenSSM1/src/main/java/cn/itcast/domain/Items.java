package cn.itcast.domain;

public class Items {
    private Integer id;
    private String name;
    private Double price;
    private String pic;
    private String detail;

    public Items() {
    }

    public Items(Integer id, String name, Double price, String pic, String detail) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pic = pic;
        this.detail = detail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", pic='" + pic + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
