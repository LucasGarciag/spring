package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.User;

//Extends: faz com que eu ja tenha varios comandos, insert, consulta, remoção. CRUD e find
//@Repository: Indica que se trata da camada de persistencia dos dados.
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
