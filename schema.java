import org.hibernate.cfg.Configuration;

Configuration configuration = new Configuration();
configuration.addAnnotatedClass(MyEntity.class);
SchemaExport schemaExport = new SchemaExport(configuration);
schemaExport.create(true, true);
