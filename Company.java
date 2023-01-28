import java.util.Objects;

public class Company {
  private String nameOfCompany;

    public Company(String name) {
        this.nameOfCompany = name;
    }

    public String getName() {
        return nameOfCompany;
    }

    public void setName(String name) {
        this.nameOfCompany = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        return Objects.equals(nameOfCompany, company.nameOfCompany);
    }

    @Override
    public int hashCode() {
        return nameOfCompany != null ? nameOfCompany.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + nameOfCompany + '\'' +
                '}';
    }
}
