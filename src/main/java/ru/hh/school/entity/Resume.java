package ru.hh.school.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;


@Entity
public class Resume {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="resume_id")
  @SequenceGenerator(name="resume_id", sequenceName="resume_id_seq", allocationSize=10)
  private Integer id;
  private String description;

  public Resume() {}

  public Resume(String description) {
    this.description = description;
  }
}
