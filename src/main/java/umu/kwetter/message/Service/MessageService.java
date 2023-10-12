package umu.kwetter.message.Service;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import umu.kwetter.message.Model.Message;
import umu.kwetter.message.Repo.MessageRepo;

import java.util.List;

@Service
public class MessageService implements IMessageService {
    @Resource
    MessageRepo repo;

    public List<Message> get(Long userId){
        return repo.findByUserId(userId).orElse(null);
    }

    public void post(Message message){
        repo.save(message);
    }

    public void delete(Long userId){
        List<Message> messages = get(userId);
        int messageCount = messages.size();
        if(messageCount > 0){
            for(Message message : messages){
                repo.delete(message);
            }
        }
    }
}
