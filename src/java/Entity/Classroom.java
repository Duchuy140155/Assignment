/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.ArrayList;

/**
 *
 * @author DucHuy
 */
public class Classroom {
    private int id;
    private String name;   
    private String code;
    private User teacher;
    private Semester semester;
    private ArrayList<Capstone>  capstoneList;

    public Classroom(int id, String name, String code, User teacher, Semester semester, ArrayList<Capstone> capstoneList) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.teacher = teacher;
        this.semester = semester;
        this.capstoneList = capstoneList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public ArrayList<Capstone> getCapstoneList() {
        return capstoneList;
    }

    public void setCapstoneList(ArrayList<Capstone> capstoneList) {
        this.capstoneList = capstoneList;
    }
    

}
