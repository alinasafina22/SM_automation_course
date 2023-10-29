package hw_7.core;

import java.util.List;

//Класс, описывающий книгу.
//Выделите и реализуйте необходимые поля и/или методы.
//Помимо этих полей дополнительно объявите свойства String[] последниеЧитатели и метод получитьПоследнихЧитателей,
//возвращающий этот массив.
//Но мы же не хотим утечек персональных данных? Поэтому - сделайте так, чтобы и это поле,
//и этот метод - были доступны только в пакете core, и ни в коем случае не были доступны в классе для запуска приложения.
public class Book {
    String bookName;
    String bookAuthor;
    int yearOfPublic;
    protected List<String> lastReaders;
    static int lastBookId = 0;
    int bookId;


    public Book(String bookName, String bookAuthor, int yearOfPublic){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPublic = yearOfPublic;
        this.bookId = ++lastBookId;
    }
    protected List<String> getLastReaders(){
        return lastReaders;
    }

    public void setLastReaders(String lastReader){
        lastReaders.add(lastReader);
    }

    public String getBookName(){
        return bookName;
    }
    public String getBookAuthor(){
        return bookAuthor;
    }

    public int getYearOfPublic(){
        return yearOfPublic;
    }
    public int getBookId(){
        return bookId;
    }
}
