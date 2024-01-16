package seminars.fourth.hotel;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookingServiceTest {
    @Test
    void BookingServicePositiveTest(){
        HotelService hotelServiceMock = mock(HotelService.class);
        when(hotelServiceMock.isRoomAvailable(2)).thenReturn(true);
        BookingService bookingService = new BookingService(hotelServiceMock);

        boolean result = bookingService.bookRoom(2);
        assertTrue(result);

    }

    @Test
    void BookingServiceNegativTest(){
        HotelService hotelServiceMock = mock(HotelService.class);
        when(hotelServiceMock.isRoomAvailable(1)).thenReturn(false);
        BookingService bookingService = new BookingService(hotelServiceMock);

        boolean result = bookingService.bookRoom(1);
        assertFalse(result);

    }

}