package spring.framework.spring5recipeapp.converters;

import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import spring.framework.spring5recipeapp.commands.UnitOfMeasureCommand;
import spring.framework.spring5recipeapp.domain.UnitOfMeasure;

@Component
public class UnitOfMeasureCommandToUnitOfMeasure implements Converter<UnitOfMeasureCommand, UnitOfMeasure>{

    @Synchronized // Spring не гарантирует thread-safe
    @Nullable // null-safe
    @Override
    public UnitOfMeasure convert(UnitOfMeasureCommand source) {
        if (source == null) {
            return null;
        }

        final UnitOfMeasure uom = new UnitOfMeasure(); // final делает код более безопасным
        uom.setId(source.getId());
        uom.setDescription(source.getDescription());
        return uom;
    }
}
