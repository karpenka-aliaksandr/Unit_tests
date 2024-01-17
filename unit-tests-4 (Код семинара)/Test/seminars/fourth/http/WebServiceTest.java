package seminars.fourth.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WebServiceTest {
    @Test
    void WebServiceTest(){
        HttpClient httpClientMock = mock(HttpClient.class);
        WebService webService = new WebService(httpClientMock);
        String query = "www.mail.ru";
        String request = "Not found";
        when(httpClientMock.get(query)).thenReturn(request);

        String result = webService.GetStringByUrl(query);

        assertEquals(request, result);
    }
}
