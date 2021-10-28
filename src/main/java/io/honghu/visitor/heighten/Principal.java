package io.honghu.visitor.heighten;

public class Principal implements Visitor {

    @Override
    public void visit(Student student) {
        System.out.printf("学生信息 姓名：{%s} 班级：{%s}%n", student.name, student.clazz);
    }

    @Override
    public void visit(Teacher teacher) {
        System.out.printf("学生信息 姓名：{%s} 班级：{%s} 升学率：{%s}", teacher.name, teacher.clazz, teacher.entranceRatio());
    }

}