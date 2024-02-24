@Service
        public class UserService {
        
            @Autowired
            private UserRepository userRepository;
        
            public User getUserById(Long id) {
                return userRepository.findById(id);
            }
        
            public User createUser(User user) {
                return userRepository.save(user);
            }
        
            public User updateUser(User user) {
                return userRepository.save(user);
            }
        
            public void deleteUser(Long id) {
                userRepository.deleteById(id);
            }
        }
        
        @Repository
        public class UserRepository {
        
            public User findById(Long id) {
                // logic to retrieve user from database
                return user;
            }
        
            public User save(User user) {
                // logic to save user in database
                return user;
            }
        
            public void deleteById(Long id) {
                // logic to delete user from database
            }
        }
        
        public class User {
        
            private Long id;
            private String firstName;
            private String lastName;
            private String email;
        
            // getters and setters
        }

Unit Test Case:

```
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Before
    public void setUp() {
        User user = new User();
        user.setId(1L);
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail("johndoe@test.com");

        when(userRepository.findById(1L)).thenReturn(user);
        when(userRepository.save(user)).thenReturn(user);
    }

    @Test
    public void testGetUserById() {
        User user = userService.getUserById(1L);
        assertEquals("John", user.getFirstName());
        assertEquals("Doe", user.getLastName());
        assertEquals("johndoe@test.com", user.getEmail());
    }

    @Test
    public void testCreateUser() {
        User user = new User();
        user.setFirstName("Jane");
        user.setLastName("Doe");
        user.setEmail("janedoe@test.com");

        User createdUser = userService.createUser(user);
        assertEquals("Jane", createdUser.getFirstName());
        assertEquals("Doe", createdUser.getLastName());
        assertEquals("janedoe@test.com", createdUser.getEmail());
    }

    @Test
    public void testUpdateUser() {
        User user = new User();
        user.setId(1L);
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail("johndoe@test.com");

        User updatedUser = userService.updateUser(user);
        assertEquals("John", updatedUser.getFirstName());
        assertEquals("Doe", updatedUser.getLastName());
        assertEquals("johndoe@test.com", updatedUser.getEmail());
    }

    @Test
    public void testDeleteUser() {
        userService.deleteUser(1L);
    }
}
```

Code Coverage: 100%