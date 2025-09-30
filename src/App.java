public class App {
    public static void main(String[] args) {
        Author author1 = new Author("Пауло", "Коэльо");
        Author author2 = new Author("Шахна", "Сайн");

        Book book1 = new Book("Алхимик", author1, 1988);
        Book book2 = new Book("365 воинов внутри меня", author2, 2023);

        System.out.println("Книга: " + book1.getBookTitle() + ", автор: " + book1.getAuthorName().getAuthorName() + ", год издания: " + book1.getPublishingYear());
        System.out.println("Книга: " + book2.getBookTitle() + ", автор: " + book2.getAuthorName().getAuthorName() + ", год издания: " + book2.getPublishingYear());

        // Пример изменения года публикации
        book2.setPublishingYear(2024);
        System.out.println("Измененный год издания: " + book2.getPublishingYear());
    }
}
