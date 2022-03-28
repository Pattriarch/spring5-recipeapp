package spring.framework.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.framework.spring5recipeapp.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
