public class Person {
    protected String name;
    protected String surname;
    private int ticket;

    public Person(String name, String surname, int ticket) {
        this.name = name;
        this.surname = surname;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

}
