package ru.badr.springcourse;

/**
 * @author RuziyaBadrutdinova
 * @since 02.04.2022
 */
public class TestBean {
    private  String name;

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
