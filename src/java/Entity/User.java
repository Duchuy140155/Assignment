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
public class User {

    private int id;
    private String username;
    private String password;
    private String type;
    private ArrayList<Classroom> classList;
    private ArrayList<Grade> gradeList;
    private String roleNumber;
    private String fullname;

    public User(int id, String username, String password, String type, ArrayList<Classroom> classList, ArrayList<Grade> gradeList, String roleNumber, String fullname) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.type = type;
        this.classList = classList;
        this.gradeList = gradeList;
        this.roleNumber = roleNumber;
        this.fullname = fullname;
    }

    public String getRoleNumber() {
        return roleNumber;
    }

    public void setRoleNumber(String roleNumber) {
        this.roleNumber = roleNumber;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Classroom> getClassList() {
        return classList;
    }

    public void setClassList(ArrayList<Classroom> classList) {
        this.classList = classList;
    }

    public ArrayList<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(ArrayList<Grade> gradeList) {
        this.gradeList = gradeList;
    }

}
