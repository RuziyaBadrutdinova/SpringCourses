package ru.badr.springcourse;

/**
 * Пример класса, реализующего паттерн Singleton (англ. Одиночка)
 * Можно будет использовать только один объект класса Lesson7Singleton
 * @author RuziyaBadrutdinova
 * @since 09.04.2022
 */
public class Lesson7Singleton {
    // В этой статической(!) переменной будет хранится единственный объект класса Lesson7Singleton
    private static Lesson7Singleton instance;
    // Скажем, что у нашего единственного объекта должно быть поле value
    private String value;

    public String getValue(){
        return value;
    }

    // ВАЖНО: Конструктор должен быть приватным
    // Мы не хотим, чтобы пользователь мог создавать новые объекты класса Lesson7Singleton
    public Lesson7Singleton(String value) {
        this.value = value;
    }

    public static Lesson7Singleton getInstance(String value){
        if(instance == null){
            // код здесь выполняется только в момент первого вызова метода getInstance()
            // создаем объект один раз
            instance = new Lesson7Singleton(value);
        }
        // все остальные вызовы метода getInstance() пользователю возвращается тот же самый объект
        return instance;
    }
}

class SingletonTest{
    public static void main(String[] args) {
        Lesson7Singleton first = Lesson7Singleton.getInstance("Hello");
        Lesson7Singleton second = Lesson7Singleton.getInstance("Bye");

        // Hello!
        System.out.println(first.getValue());

        // Hello!
        System.out.println(second.getValue());


        // true
        System.out.println(first == second);
    }
}


/**
 * вариант, где System.out.println(first == second); будет false
 */

/*
public class Lesson7Singleton {
    // В этой статической(!) переменной будет хранится единственный объект класса Lesson7Singleton
    private Lesson7Singleton instance;
    // Скажем, что у нашего единственного объекта должно быть поле value
    private String value;

    public String getValue(){
        return value;
    }

    // ВАЖНО: Конструктор должен быть приватным
    // Мы не хотим, чтобы пользователь мог создавать новые объекты класса Lesson7Singleton
    public Lesson7Singleton(String value) {
        this.value = value;
    }

    public  Lesson7Singleton getInstance(String value){
        if(instance == null){
            // код здесь выполняется только в момент первого вызова метода getInstance()
            // создаем объект один раз
            instance = new Lesson7Singleton(value);
        }
        // все остальные вызовы метода getInstance() пользователю возвращается тот же самый объект
        return instance;
    }
}

class SingletonTest{
    public static void main(String[] args) {
        Lesson7Singleton first = new Lesson7Singleton("Hello");
        first.getInstance("Hello");
      //  Lesson7Singleton second = Lesson7Singleton.getInstance("Bye");
        Lesson7Singleton second = new Lesson7Singleton("Bye");
        first.getInstance("Bye");

        // Hello!
        System.out.println(first.getValue());

        // Hello!
        System.out.println(second.getValue());


        // true
        System.out.println(first == second);
    }
}

 */
