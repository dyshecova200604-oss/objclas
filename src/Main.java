//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Author Paulo = new Author("Пауло", "Коэльо");
                Author Shahnaz= new Author("Шахназ", "Сайн");
                Book book1 = new Book("Алхимик ", Paulo, 1988);
                Book book2 = new Book("365 воинов внутри меня", Shahnaz, 2023);
        System.out.println("Книга 1: " + book1);
        System.out.println("Книга 2: " + book2);

        System.out.println("book1.equals(book1): " + book1.equals(book1));
        System.out.println("book1.equals(book2): " + book1.equals(book2));

        System.out.println("book1.hashCode(): " + book1.hashCode());
        System.out.println("book3.hashCode(): " + book2.hashCode());



    }
        }
