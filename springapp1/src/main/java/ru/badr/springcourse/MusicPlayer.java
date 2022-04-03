package ru.badr.springcourse;

/**
 * @author RuziyaBadrutdinova
 * @since 02.04.2022
 */
public class MusicPlayer {
    private Music music;
    //Инверсия управления
    public MusicPlayer(Music music){
        this.music = music;
    }

    //здесь используется внедренная зависимость
    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
