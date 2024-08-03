import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;
import static org.junit.jupiter.api.Assertions.*;


    public class PhoneBookTest {
        @Test
        public void testAddSingleContact() {
            PhoneBook phoneBook = new PhoneBook();
            int count = phoneBook.add("Alice", "12345");
            assertEquals(1, count);
        }

        @Test
        public void testAddMultipleContacts() {
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.add("Alice", "12345");
            int count = phoneBook.add("Bob", "67890");
            assertEquals(2, count);
        }

        @Test
        public void testAddDuplicateName() {
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.add("Alice", "12345");
            int count = phoneBook.add("Alice", "67890");
            assertEquals(1, count); // На допускется добавление  того же имени
        }

        @Test
        public void testFindByNumber() {
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.add("Alice", "12345");
            assertEquals("Alice", phoneBook.findByNumber("12345"));
        }

        @Test
        public void testFindByNonExistentNumber() {
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.add("Alice", "12345");
            assertNull(phoneBook.findByNumber("67890"));
        }

        @Test
        public void testFindByName() {
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.add("Alice", "12345");
            assertEquals("12345", phoneBook.findByName("Alice"));
        }

        @Test
        public void testFindByNonExistentName() {
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.add("Alice", "12345");
            assertNull(phoneBook.findByName("Bob"));
        }
    }

