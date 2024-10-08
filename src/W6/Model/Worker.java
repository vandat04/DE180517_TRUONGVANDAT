
package W6.Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Worker {
    private String id;
    private String name;
    private String age;
    private String salary;
    private String workLocation;
    private String status;
    private String date;

        public Worker(String id, String name, String age, String salary, String workLocation, String status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
        this.status = status;
        setDate();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate() {
        LocalDate current = LocalDate.now();
        this.date = current.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public void display() {
        System.out.printf("%-5s %-10s %-5s %-10s %-5s %-10s%n",id,name,age,salary,status,date);
    }
    
    
}

