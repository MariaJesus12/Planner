/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Task;

import Models.Entity;
import Models.Members.Member;

/**
 *
 * @author María Jesús
 */
public class Task implements Entity {

    private int num;
    private String name;
    private String description;
    private String startDate;
    private String endDate;
    private boolean completed;
    private Member responsible;

    public Task(int num, String name, String description, String startDate, String endDate, Member responsible) {
        this.num = num;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.responsible = responsible;
    }

    public Task(int num, String name, String description, String startDate, String endDate) {
        this(num, name, description, startDate, endDate, null);
    }

    public Task(int num) {
        this(num, " ", " ", " ", " ");
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public Member getResponsible() {
        return responsible;
    }

    public void setResponsible(Member responsible) {
        this.responsible = responsible;
    }

    public void Complete() {
        this.completed = true;
    }

    @Override
    public boolean isComplete() {
        return this.getNum() != 0 && !this.name.equals("") && !this.description.equals("") && !this.startDate.equals("") && !this.endDate.equals("");

    }

    @Override
    public Object[] toArrayObject() {
        return new Object[]{this.num, this.name, this.description, this.startDate, this.endDate, this.completed, this.responsible};

    }

}
