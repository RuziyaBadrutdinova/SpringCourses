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
        TestBean testBean = context.getBean("testBean", TestBean.class); // первый агрумент это bean id, который в applicationContext, второй - объект (bean) какого класса хотим получить

        System.out.println(testBean.getName());
        testBean.setName("ruzikBadr");
        System.out.println(testBean.getName());


//lesson4
/*        Music music = context.getBean("musicBean", Music.class);

        //внедрение зависимости

        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        musicPlayer = new MusicPlayer(context.getBean("jazzMusicBean", Music.class));
        musicPlayer.playMusic();*/

        //lesson 5
//не внедряем зависимость вручную, а через спринг: в applicationContext
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusicList();

      //  System.out.println(musicPlayer);
        System.out.println(musicPlayer.getVolume());
        // после того, как поработали со  спрингом, с applicationContext, должны обязательно его закрыть
        context.close();
    }
}
