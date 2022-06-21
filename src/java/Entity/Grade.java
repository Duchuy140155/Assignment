/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author DucHuy
 */
public class Grade {
    private int id;
    private float value;
    private User student;
    private User teacher;
    private Capstone capstone;
    private float percent;

    public Grade(int id, float value, User student, User teacher, Capstone capstone, float percent) {
        this.id = id;
        this.value = value;
        this.student = student;
        this.teacher = teacher;
        this.capstone = capstone;
        this.percent = percent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }

    public Capstone getCapstone() {
        return capstone;
    }

    public void setCapstone(Capstone capstone) {
        this.capstone = capstone;
    }

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }
    
}
