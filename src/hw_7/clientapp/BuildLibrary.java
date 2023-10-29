package hw_7.clientapp;
import hw_7.core.Book;
import hw_7.core.Library;


//Класс-запускалка - имеет метод main, где инициализирует объект библиотеки с книгами и работает с функционалом
//        объекта библиотеки - вызывает методы поиска книг по разным критериям и выводит их на печать.
//        Метод печати книги должен быть определен в этом же классе, как статический,
//        позволяющий выводить в консоль все поля переданного в метод объект книги.
//        Если в метод был передан пустой (null) объект - вместо книги в консоль должно выводиться предупреждение.
public class BuildLibrary {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Гордость", "Michle", 1995);
        Book book2 = new Book("Tweak", "Alex", 1997);
        Book book3 = new Book("Cooking", "John", 2005);
        library.addBook(book1, book2, book3);
        printBook(library.findBookById(1));
        printBook(library.findBookByAuthor("Al"));
        printBook(library.findBookByName("GFgfgfg"));

    }
    public static void printBook(Book book) {
        if (book != null){
            System.out.println("Название книги:" + book.getBookName());
            System.out.println("Автор книги:" + book.getBookAuthor());
            System.out.println("Год выпуска:" + book.getYearOfPublic());
            System.out.println("Book ID is " + book.getBookId());
        }
        else{
            System.out.println("Book wasn't found");
        }
    }
}
