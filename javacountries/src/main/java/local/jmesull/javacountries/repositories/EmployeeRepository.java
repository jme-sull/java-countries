package local.jmesull.javacountries.repositories;

import local.jmesull.javacountries.models.Country;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Country, Long>
{
}
