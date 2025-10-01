import java.util.Objects;

public class Author {

    private final String name;
    private final String lastName;
    public Author(String firstName, String lastName) {
        this.name = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) &&
                Objects.equals(lastName, author.lastName);
    }

    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}