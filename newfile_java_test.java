@Service
        public class UserServiceImpl implements UserService {

            @Autowired
            private UserRepository userRepository;

            @Override
            public User getUserById(Long id) {
                Optional<User> user = userRepository.findById(id);
                if (user.isPresent()) {
                    return user.get();
                } else {
                    throw new UserNotFoundException("User not found with id: " + id);
                }
            }

            @Override
            public User createUser(User user) {
                return userRepository.save(user);
            }

            @Override
            public void deleteUser(Long id) {
                Optional<User> user = userRepository.findById(id);
                if (user.isPresent()) {
                    userRepository.deleteById(id);
                } else {
                    throw new UserNotFoundException("User not found with id: " + id);
                }
            }
        }

**Unit Test Case:**

    @RunWith(MockitoJUnitRunner.class)
    public class UserServiceImplTest {

        @Mock
        private UserRepository userRepository;

        @InjectMocks
        private UserServiceImpl userService;

        @Test
        public void testGetUserById() {
            // Arrange
            Long id = 1L;
            User user = new User();
            user.setId(id);
            user.setUsername("testUser");
            user.setEmail("test@test.com");
            user.setPassword("test123");

            Mockito.when(userRepository.findById(id)).thenReturn(Optional.of(user));

            // Act
            User result = userService.getUserById(id);

            // Assert
            Assert.assertEquals("testUser", result.getUsername());
            Assert.assertEquals("test@test.com", result.getEmail());
            Assert.assertEquals("test123", result.getPassword());
        }

        @Test(expected = UserNotFoundException.class)
        public void testGetUserByIdNotFound() {
            // Arrange
            Long id = 1L;

            Mockito.when(userRepository.findById(id)).thenReturn(Optional.empty());

            // Act
            userService.getUserById(id);

            // Assert
            // UserNotFoundException is expected to be thrown
        }

        @Test
        public void testCreateUser() {
            // Arrange
            User user = new User();
            user.setUsername("testUser");
            user.setEmail("test@test.com");
            user.setPassword("test123");

            Mockito.when(userRepository.save(user)).thenReturn(user);

            // Act
            User result = userService.createUser(user);

            // Assert
            Assert.assertEquals("testUser", result.getUsername());
            Assert.assertEquals("test@test.com", result.getEmail());
            Assert.assertEquals("test123", result.getPassword());
        }

        @Test
        public void testDeleteUser() {
            // Arrange
            Long id = 1L;
            User user = new User();
            user.setId(id);
            user.setUsername("testUser");
            user.setEmail("test@test.com");
            user.setPassword("test123");

            Mockito.when(userRepository.findById(id)).thenReturn(Optional.of(user));

            // Act
            userService.deleteUser(id);

            // Assert
            Mockito.verify(userRepository, Mockito.times(1)).deleteById(id);
        }

        @Test(expected = UserNotFoundException.class)
        public void testDeleteUserNotFound() {
            // Arrange
            Long id = 1L;

            Mockito.when(userRepository.findById(id)).thenReturn(Optional.empty());

            // Act
            userService.deleteUser(id);

            // Assert
            // UserNotFoundException is expected to be thrown
        }
    }

**Code Coverage:**

- The code coverage for the above unit tests is 100%. All lines of code in the UserServiceImpl class are covered by the tests.
- The getUserById() method is tested for both the case where a user is found and the case where a user is not found.
- The createUser() method is tested by creating a user and verifying that the returned user has the correct information.
- The deleteUser() method is tested for both the case where a user is found and the case where a user is not found. The deleteById() method is also verified to be called once in the case where a user is found.