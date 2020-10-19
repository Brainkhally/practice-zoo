package org.itstep.zoo;

public abstract class Animal {
    private String nickname;
    private int age;
    private double weigth;
    private int number;
    private int time;

    public Animal(String nickname, int age, double weigth, int number, int time) {
        this.nickname = nickname;
        this.age = age;
        this.weigth = weigth;
        this.number = number;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", weigth=" + weigth +
                ", number=" + number +
                ", time=" + time +
                '}';
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
