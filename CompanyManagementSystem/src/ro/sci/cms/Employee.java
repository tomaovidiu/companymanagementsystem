package ro.sci.cms;

/**
 * This class implements Employ. An Employ has 3 elements: *<b>The application
 * is able to</b>
 * <ul>
 * <li>name
 * <li>seniority - how old is the employ in the firm
 * <li>role in company
 * </ul>
 *
 * @author ovidiu
 *
 */
public class Employee implements Comparable<Employee> {

	private String name;
	private int seniority;
	private String roleInCompany;

	public Employee(String name, int seniority, String roleInCompany) {

		this.name = name;
		this.seniority = seniority;
		this.roleInCompany = roleInCompany;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", seniority=" + seniority + ", roleInCompany=" + roleInCompany + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	public String getRoleInCompany() {
		return roleInCompany;
	}

	public void setRoleInCompany(String roleInCompany) {
		this.roleInCompany = roleInCompany;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.seniority < o.getSeniority()) {
			return 	1;
		}
		if (this.seniority > o.getSeniority()) {
			return -1;
		}
		return this.name.compareTo(o.name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((roleInCompany == null) ? 0 : roleInCompany.hashCode());
		result = prime * result + seniority;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roleInCompany == null) {
			if (other.roleInCompany != null)
				return false;
		} else if (!roleInCompany.equals(other.roleInCompany))
			return false;
		if (seniority != other.seniority)
			return false;
		return true;
	}

}