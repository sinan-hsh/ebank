package softuni.ebank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import softuni.ebank.entities.Transactionn;

public interface TransactionRepository extends JpaRepository<Transactionn, Long> {


}
