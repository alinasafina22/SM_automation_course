package hw_7.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Класс, описывающий библиотеку, хранящую все имеющиеся в библиотеке книги (массив книг).
//        В этом классе должны быть нестатические методы:
//        - метод поиска книги по названию
//        - метод поиска книги по автору
//        - метод поиска книги по другому выбранному вами атрибуту книги
public class Library {
    public List<Book> books = new ArrayList<>();

    public Book findBookByName(String nameOfBook){
        for(Book book : books){
            if(book.bookName.contains(nameOfBook)){
                return book;
            }
        }
        return null;
    }
    public Book findBookByAuthor(String authorOfBook){
        for(Book book : books){
            if(book.bookAuthor.contains(authorOfBook)){
                return book;
            }
        }
        return null;
    }

    public Book findBookById( int id){
        for(Book book : books){
            if(book.bookId == id){
                return book;
            }
        }
        return null;
    }

    public void addBook(Book... book){
        books.addAll(Arrays.asList(book));
    }

}
