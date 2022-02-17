package ru.hh.school.dao;

import org.hibernate.SessionFactory;
import ru.hh.school.entity.Employer;

public class EmployerDao extends GenericDao {

  public EmployerDao(SessionFactory sessionFactory) {
    super(sessionFactory);
  }

  public Employer getEager(int employerId) {
    return getSession()
        .createQuery("from Employer e left join fetch e.vacancies where e.id = :id", Employer.class)
        .setParameter("id",employerId)
        .getSingleResult();
  }

}
