package hello.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hello.Model.Poll;

@Repository
public interface basicRepository extends CrudRepository<Poll, Long>{
    Optional<Poll> findById(Long pollId);
}