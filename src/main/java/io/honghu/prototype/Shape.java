package io.honghu.prototype;

public abstract class Shape implements Cloneable {

    private Integer id;

    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}