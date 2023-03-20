package ru.badr.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Для запуска
 * @author RuziyaBadrutdinova
 * @since 02.04.2022
 */
public class TestSpring {
    public static void main(String[] args) {
        //этот класс обращается к файлу applicationContext.xml считывает его и помещает все Bean-ы, которые там описаны в applicationContext
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
"applicationContext.xml"
        ); //applicationContext - передаем название конфигурационного файла спринга
        // важно, чтобы файл applicationContext лежал в папке resources, который помечен как ресурсы
     /*   TestBean testBean = context.getBean("testBean", TestBean.class); // первый агрумент это bean id, который в applicationContext, второй - объект (bean) какого класса хотим получить

        System.out.println(testBean.getName());
        testBean.setName("ruzikBadr");
        System.out.println(testBean.getName());*/

     /*   ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic2.getSong());*/

//lesson4
/*        Music music = context.getBean("musicBean", Music.class);

        //внедрение зависимости

        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        musicPlayer = new MusicPlayer(context.getBean("jazzMusicBean", Music.class));
        musicPlayer.playMusic();*/

        //lesson 5
//не внедряем зависимость вручную, а через спринг: в applicationContext
      /*  MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

       boolean comparison = firstMusicPlayer ==secondMusicPlayer;
        System.out.println(comparison);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);                                         

        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
        firstMusicPlayer.playMusic();*/
      //  System.out.println(musicPlayer.getVolume());

       // Music music = context.getBean("musicBean", Music.class); // первый агрумент это bean id, который в applicationContext, второй - объект (bean) какого класса хотим получить
        Music music = context.getBean("rockMusic", Music.class); // первый агрумент это bean id, который в applicationContext, второй - объект (bean) какого класса хотим получить
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class); // первый агрумент это bean id, который в applicationContext, второй - объект (bean) какого класса хотим получить

        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
        classicalMusicPlayer.playMusic();
        // после того, как поработали со  спрингом, с applicationContext, должны обязательно его закрыть
        context.close();
    }
}
