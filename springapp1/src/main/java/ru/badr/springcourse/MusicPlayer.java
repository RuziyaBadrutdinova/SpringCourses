package ru.badr.springcourse;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author RuziyaBadrutdinova
 * @since 02.04.2022
 */
public class MusicPlayer {
    private Music music;
  //  private List<Music> musicList= new ArrayList<>();

    private String name;
    private int volume;

    public String getName() {
        return name;
    }
    //сеттеры использует спринг
    public void setName(String name) {
        this.name = name;
    }
    //в мейне будем получать
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //Инверсия управления
    public MusicPlayer(Music music){
        this.music = music;
    }
    //создаем конструктор без параметров, чтобы в апп ини
    public MusicPlayer(){}

    //внедрение зависимости через setter
    public void setMusic(Music music){
        this.music = music;
    }
    //здесь используется внедренная зависимость
    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
    /*public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
    public void playMusicList(){
        for (Music muzika :musicList) {
            System.out.println("Playing " + muzika.getSong());

        }
    }*/
}
