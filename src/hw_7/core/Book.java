package hw_7.core;

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
    protected String[] lastReaders;
    int bookId = 0;

    public Book(String bookName, String bookAuthor, int yearOfPublic){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPublic = yearOfPublic;
        bookId += 1;
    }
    protected String[] getLastReaders(){
        return lastReaders;
    }
}
