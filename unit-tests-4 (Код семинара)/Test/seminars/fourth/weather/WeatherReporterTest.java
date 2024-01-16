package seminars.fourth.weather;


import org.assertj.core.api.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class WeatherReporterTest {

    @Test
    void WeatherReporterTest(){
        WeatherService weatherServiceMock = mock(WeatherService.class);
        when(weatherServiceMock.getCurrentTemperature()).thenReturn(22);
        WeatherReporter weatherReporter = new WeatherReporter(weatherServiceMock);

        String result = weatherReporter.generateReport();

        assertEquals("Текущая температура: 22 градусов.", result);
    }
}