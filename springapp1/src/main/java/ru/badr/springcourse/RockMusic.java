package ru.badr.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author RuziyaBadrutdinova
 * @since 02.04.2022
 */
@Component
//если не добавлять айдишник, то есть не писать @Component("musicBean"), то имя бина будет rockMusic
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind Cries Mary";
    }
}
