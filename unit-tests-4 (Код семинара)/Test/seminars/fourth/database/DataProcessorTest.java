package seminars.fourth.database;


import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DataProcessorTest {
    @Test
    void DataProcessorTest() {
    Database databaseFake = mock(Database.class);
    DataProcessor dataProcessor = new DataProcessor(databaseFake);
    List<String> fakeData = new ArrayList<>();
    fakeData.add("Data1");
    fakeData.add("Data2");
    fakeData.add("Data3");
    when(databaseFake.query("SELECT * FROM Data")).thenReturn(fakeData);

    List<String> result = dataProcessor.processData("SELECT * FROM Data");

    assertEquals(fakeData, result);


    }

}