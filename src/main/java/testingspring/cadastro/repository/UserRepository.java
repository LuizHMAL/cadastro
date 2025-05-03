package testingspring.cadastro.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import testingspring.cadastro.model.User;



public interface UserRepository extends JpaRepository<User, Long>{
    
}