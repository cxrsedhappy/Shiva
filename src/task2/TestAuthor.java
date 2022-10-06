package task2;

public class TestAuthor {
    public static void main(String[] args) {

        Author author = new Author("Stanislaw", "qwerty@mail.ru", 'M');
        System.out.println("Author Params: ");
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());
        System.out.println("Info: " + author.toString());

        author.setEmail("asd@mail.ru");
        System.out.println("Email after changes: " + author.getEmail());


    }
}