package practice06;

/*2.狗类Dog
        属性:
        毛的颜色color
        品种breed
        行为:
        吃饭()
        看家lookHome()*/
public class Dog {
    private String color;
    private String breed;

    public void eat() {
        System.out.println();
    }

    public void lookHome() {
        System.out.println();
    }

    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
        System.out.println(this.color+"的"+breed+"正在啃骨头");
        System.out.println(this.color+"的"+breed+"正在看家");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;

    }
}

