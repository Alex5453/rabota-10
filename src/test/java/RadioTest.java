import org.example.Radio;
import org.testng.annotations.Test;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class RadioTest {

    @Test
    public void testDefaultConstructor() {
        Radio radio = new Radio();
        assertEquals(10, radio.getCurrentStation());
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void testCustomConstructor() {
        Radio radio = new Radio(15);
        assertEquals(15, radio.getCurrentStation());
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void testNextStation() {
        Radio radio = new Radio();
        radio.next();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void testPreviousStation() {
        Radio radio = new Radio();
        radio.prev();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testSetStationInRange() {
        Radio radio = new Radio();
        radio.setStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testSetStationOutOfRange() {
        Radio radio = new Radio();
        radio.setStation(15);
        assertEquals(0, radio.getCurrentStation()); // Текущая станция не должна измениться
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void testIncreaseVolumeToMax() {
        Radio radio = new Radio();
        for (int i = 0; i < 60; i++) {
            radio.increaseVolume();
        }
        assertEquals(100, radio.getCurrentVolume()); // Дальнейшее увеличение не должно изменить громкость
    }
}
