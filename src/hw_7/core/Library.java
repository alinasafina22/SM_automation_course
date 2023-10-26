package hw_7.core;
//Класс, описывающий библиотеку, хранящую все имеющиеся в библиотеке книги (массив книг).
//        В этом классе должны быть нестатические методы:
//        - метод поиска книги по названию
//        - метод поиска книги по автору
//        - метод поиска книги по другому выбранному вами атрибуту книги
public class Library {
    Book[] books;

    public int findBookByName(Book[] books, String nameOfBook){
        for(int i=0; i<books.length; i++){
            if(books[i].bookName.contains(nameOfBook)){
                return i;
            }
        }
        return -1;
    }
    public int findBookByAuthor(Book[] books, String authorOfBook){
        for(int i=0; i<books.length; i++){
            if(books[i].bookAuthor.contains(authorOfBook)){
                return i;
            }
        }
        return -1;
    }

}
