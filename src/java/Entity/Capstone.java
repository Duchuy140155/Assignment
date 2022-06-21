/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author DucHuy
 */
public class Capstone {
    private int id;
    private Capstone parent;
    private float percent;
    private String name;

    public Capstone(int id, Capstone parent, float percent, String name) {
        this.id = id;
        this.parent = parent;
        this.percent = percent;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Capstone getParent() {
        return parent;
    }

    public void setParent(Capstone parent) {
        this.parent = parent;
    }

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
