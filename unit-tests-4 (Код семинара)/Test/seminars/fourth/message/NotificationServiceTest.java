package seminars.fourth.message;


import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class NotificationServiceTest {
    @Test
    void NotificationServiceTest(){
        MessageService messageServiceMock = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageServiceMock);
        notificationService.sendNotification("message", "recipient");

        verify(messageServiceMock, times(1)).sendMessage("message", "recipient");
    }

}