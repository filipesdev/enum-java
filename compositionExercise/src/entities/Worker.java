package entities;

import enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>(); // Quando tiver uma lista "tem muitos" não incluir a lista no construtor. inicia a lista vazia do jeito que está aqui

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContracts(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContracts(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(int year, int mounth) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts) {
            cal.setTime(c.getDate());

            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && mounth == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
