//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Author author1 = new Author("Пауло", "Коэльо");
                Author author2 = new Author("Шахназ", "Сайн");
                Book book1 = new Book("Алхимик ", author1, 1988);
                Book book2 = new Book("365 воинов внутри меня", author2, 2023);
                book2.getPublishingYear ();
                System.out.println("Год издания: " + book2.getPublishingYear());
                System.out.println("Книга: " + book1.getBookTitle() + ", автор: " + author1.getAuthorName() + " " + author1.getAuthorSurname() + ", год издания: " + book1.getPublishingYear());
                System.out.println("Книга: " + book2.getBookTitle() + ", автор: " + author2.getAuthorName() + " " + author2.getAuthorSurname() + ", год издания: " + book2.getPublishingYear());

            }
        }
