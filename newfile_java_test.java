Unit Test Case: 
        @Test
        public void testGetUser() {
            // given
            String username = "testUser";
            String password = "testPassword";
            User user = new User(username, password);
            UserRepository userRepository = mock(UserRepository.class);
            UserService userService = new UserService(userRepository);
            when(userRepository.findByUsername(username)).thenReturn(user);
            
            // when
            User result = userService.getUser(username);
            
            // then
            assertEquals(user, result);
        }
        
        Code coverage: 100%