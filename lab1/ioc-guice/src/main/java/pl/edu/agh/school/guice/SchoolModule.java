package pl.edu.agh.school.guice;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import pl.edu.agh.school.persistence.IPersistenceManager;
import pl.edu.agh.school.persistence.SerializablePersistenceManager;

public class SchoolModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IPersistenceManager.class).to(SerializablePersistenceManager.class);
        bind(String.class).annotatedWith(Names.named("teachersFileName")).toInstance("guice-teachers.dat");
        bind(String.class).annotatedWith(Names.named("classesFileName")).toInstance("guice-classes.dat");
    }
}
