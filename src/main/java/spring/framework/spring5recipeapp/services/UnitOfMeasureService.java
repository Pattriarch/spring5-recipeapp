package spring.framework.spring5recipeapp.services;

import spring.framework.spring5recipeapp.commands.UnitOfMeasureCommand;
import spring.framework.spring5recipeapp.domain.UnitOfMeasure;

import java.util.Set;

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
