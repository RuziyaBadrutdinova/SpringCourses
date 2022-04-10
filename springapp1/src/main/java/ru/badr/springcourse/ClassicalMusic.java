package ru.badr.springcourse;

/**
 * @author RuziyaBadrutdinova
 * @since 02.04.2022
 */
public class ClassicalMusic implements Music {
    private ClassicalMusic(){} //приватный конструктор , ограничивает создание объекта через new

    //фабричный метод должен быть статическим, т.е. должен вызываться на классе
    //при синглтоне только 1 раз будет вызван этот фабричный метод, объект сохранит.
    //и каждый раз при вызове getBean будет возвращаться ссылка на этот единственный объект
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
