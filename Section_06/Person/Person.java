public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100)
            this.age = 0;
        else
            this.age = age;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20)
            return true;
        else
            return false;
    }

    public String getFullName() {
        if (firstName.isEmpty()) {
            return lastName;
        }
        if (lastName.isEmpty()) {
            return firstName;
        } else
            return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setFirstName("");
        p.setLastName("");
        p.setAge(10);

        System.out.println("fullName= " + p.getFullName());
        System.out.println("teen= " + p.isTeen());
        p.setFirstName("John");
        p.setAge(18);
        System.out.println("fullName= " + p.getFullName());
        System.out.println("teen= " + p.isTeen());
        p.setLastName("Smith");
        System.out.println("fullName= " + p.getFullName());
    }
}
