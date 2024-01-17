package seminars.fourth.book;

/*
Задание 1.
1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов?
    Для ускорения прохождения теста, для отсечения изменяющихся данных.

2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?
думаю Dummy как более простой тип заглушки без реализации и возвращаемого значения. Теоретически еще Spy, но он гораздо сложнее.

3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?
Stub. Для него задается готовый ответ на вызов.

4) Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?
Скорее Fake. Для ускорения тестирования, но при этом в условиях приближенных к реальным.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {

    BookRepository bookRepositoryMock;
    List<Book> books;
    Book book1, book2;
    BookService bookService;

    @BeforeEach
    void setup(){
        bookRepositoryMock = mock(InMemoryBookRepository.class);
        book1 = new Book("1", "title_1", "athor_1");
        book2 = new Book("2", "title_2", "athor_2");
        books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        bookService = new BookService(bookRepositoryMock);
    }
    @Test
    void findBookById(){
        when(bookRepositoryMock.findById("1")).thenReturn(book1);
        Book result = bookService.findBookById("1");

        assertEquals(book1, result);
    }
    @Test
    void findAllBooks(){
        when(bookRepositoryMock.findAll()).thenReturn(books);
        List<Book> result = bookService.findAllBooks();

        assertEquals(books, result);
    }


}