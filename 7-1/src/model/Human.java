package model;

import java.io.Serializable;

public class Human implements Serializable {

  private String name;
  private int age;

  //ルール3
  public Human() {}

  //コンストラクター(なくても動く)
  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  //getterのまとまり
  public String getName() {return name;}
  public int getAge() {return age;}

  //settseのまとまり
  public void setName(String name) {this.name = name;}
  public void setAge(int age) {this.age = age;}
}