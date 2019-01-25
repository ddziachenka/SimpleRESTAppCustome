package customer.repository;

import customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Customer} class.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
