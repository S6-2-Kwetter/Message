package umu.kwetter.message.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import umu.kwetter.message.Model.Message;
import java.util.List;
import java.util.Optional;

public interface MessageRepo extends MongoRepository<Message, String> {
    Optional<List<Message>> findByUserId(Long userId);
}
