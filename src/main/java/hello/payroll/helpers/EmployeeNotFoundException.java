package hello.payroll.helpers;

public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -7845046935013042757L;

	public EmployeeNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}