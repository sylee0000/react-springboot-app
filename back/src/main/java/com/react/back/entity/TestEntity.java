package com.react.back.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//@Table(name = "my_table") 이런식으로 테이블 이름 지정 가능,
//지정 안하면 클래스 이름으로 자동지정됨
@Entity
public class TestEntity {

  @Id
  @Column(nullable = false)
  private String id;

  @Column(nullable = false)
  private String name;

  public TestEntity() {
  }

  public TestEntity(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName(){
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
}