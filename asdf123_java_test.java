**Unit Test Case:**

```
@Test
public void testGetEmployee() {
    EmployeeService employeeService = mock(EmployeeService.class);
    EmployeeController employeeController = new EmployeeController(employeeService);
    
    Employee employee = new Employee();
    employee.setId(1L);
    employee.setFirstName("John");
    employee.setLastName("Doe");
    employee.setDepartment("IT");
    
    when(employeeService.getEmployee(1L)).thenReturn(employee);
    
    Employee result = employeeController.getEmployee(1L);
    
    assertNotNull(result);
    assertEquals(1L, result.getId());
    assertEquals("John", result.getFirstName());
    assertEquals("Doe", result.getLastName());
    assertEquals("IT", result.getDepartment());
    
    verify(employeeService, times(1)).getEmployee(1L);
}
```

**Code Coverage:**

The above unit test covers the following code:

- EmployeeController class
- getEmployee() method
- EmployeeService class
- getEmployee() method
- Employee class
- setId() method
- setFirstName() method
- setLastName() method
- setDepartment() method