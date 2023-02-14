import java.util.Map;
import java.util.Objects;

public class Company implements Comparable<Company> {
    private String nameOfCompany;
    private Map<String, String> holidays;

    public Company(String name) {
        this.nameOfCompany = name;
    }

    public String getName() {
        return nameOfCompany;
    }

    public void setName(String name) {
        this.nameOfCompany = name;
    }

    public Map<String, String> getHolidays() {
        return holidays;
    }

    public void setHolidays(Map<String, String> holidays) {
        this.holidays = holidays;
    }

    @Override
    public int compareTo(Company o) {
        if (nameOfCompany.length() > o.getName().length()) {
            return 1;
        }
       else if (nameOfCompany.length() < o.getName().length()) {
            return -1;
        }
       else
           return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (!Objects.equals(nameOfCompany, company.nameOfCompany)) return false;
        return Objects.equals(holidays, company.holidays);
    }

    @Override
    public int hashCode() {
        return nameOfCompany != null ? nameOfCompany.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + nameOfCompany + '\'' +
                ", holidays=" + holidays +
                '}';
    }
}
