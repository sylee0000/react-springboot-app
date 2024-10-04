package com.react.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.react.back.entity.TestEntity;
import com.react.back.repository.TestRepository;

@Service
public class TestService {

  @Autowired
  private TestRepository testRepository;
  //db저장
  public void saveTestEntity(TestEntity testEntity) {
    testRepository.save(testEntity); //Null type safety: The expression of t
  }

  //db리스트 반환
  public List<TestEntity> getAllTestEntities() {
    return testRepository.findAll();
  }
  
}